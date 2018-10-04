package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractPage {

	@FindBy(how = How.NAME, using = "nav_contact")
	private WebElement contactPageLink;

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public ContactPage navigateToContactPage() {
		contactPageLink.click();
		return PageFactory.initElements(driver, ContactPage.class);
	}

}