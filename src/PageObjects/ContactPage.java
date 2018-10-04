package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends AbstractPage {

	@FindBy(how = How.NAME, using = "nav_home")
	private WebElement homePageLink;

	public ContactPage(WebDriver driver) {
		super(driver);
	}

	public HomePage navigateToHomePage() {
		homePageLink.click();
		return PageFactory.initElements(driver, HomePage.class);
	}

}