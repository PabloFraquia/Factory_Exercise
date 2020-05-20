import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	private WebDriver driver;
	@FindBy (id = "es_search") WebElement findInputBar;
	@FindBy (xpath = "//*[@id='itemTitle']") WebElement findTitle;
	@FindBy (xpath = "//*[@id=\'worklist_head\']/a") WebElement workListLocator;
	@FindBy (xpath = "//*[@class = 'logoutButton']") WebElement logoutLocator;
	@FindBy (id = "uamExitCurrentButton") WebElement logoutEndLocator;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void writeName() throws InterruptedException {
		findInputBar.sendKeys("Pablo Fraquia");
		Thread.sleep(6000);
		findInputBar.clear();
		//System.out.print()
	}
	public void obtainTitle() {
		System.out.println(findTitle.getText());
	}
	public void clickWorklist() {
		workListLocator.click();
	}
	public void clickLogout() {
		logoutLocator.click();
		logoutEndLocator.click();
	}
	
}
