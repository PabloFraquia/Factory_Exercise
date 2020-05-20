import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	@FindBy (xpath = "//*[@id='form1']") WebElement NEmpleado;
	@FindBy (id = "proceed-button") WebElement ProceedLocator;
	@FindBy (xpath = "//*[@id='auth-code-btn']") WebElement AuthLocator;
	@FindBy (id = "form-submit")WebElement LoginLocator;
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.get("https://auth.ultimatix.net/utxLogin");
	}

	public void login() throws InterruptedException  {
		NEmpleado.sendKeys("1863134");
		ProceedLocator.click();
		//Thread.sleep(5000);
		//click(AuthLocator);
		Thread.sleep(20000);
		LoginLocator.click();

	}

}
