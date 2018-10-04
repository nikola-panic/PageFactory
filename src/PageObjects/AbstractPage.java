package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractPage {
	
	protected WebDriver driver;
	
	public AbstractPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage navigateToWebApp() {
		driver.navigate().to("http://www.thetestroom.com/webapp/");
		return PageFactory.initElements(driver, HomePage.class);
	}

}