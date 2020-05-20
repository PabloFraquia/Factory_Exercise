
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Worklist {
	private WebDriver driver;
	@FindBy (xpath = "//*[@id=\'buzz_head\']/a")WebElement businessButton;
	@FindBy (xpath = "//td[@id='appName']/span")List<WebElement> AppNames;
	@FindBy (xpath = "//td[@id='wrklist-helpnote'][2]/span")List<WebElement> Frequencies;
	

	public Worklist(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	public String returnAppNames() {
		String ret = "";
		for(int i = 0; i < AppNames.size(); i++) {
			ret += AppNames.get(i).getText() + "---" + Frequencies.get(i).getText() + "\n";
			}
		return ret;
	}

	public void clickBusiness() {
		businessButton.click();
		
	}

}