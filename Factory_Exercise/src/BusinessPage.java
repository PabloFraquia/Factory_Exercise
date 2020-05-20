import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BusinessPage {

	private WebDriver driver;
	@FindBy(id = "itemTitle") List<WebElement> TitlesList;
	public BusinessPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String listTitle() {
		String ret = "";
		for(WebElement we : TitlesList) {
			ret += we.getText();
			ret += "\n";
			}
		return ret;
	}

}
