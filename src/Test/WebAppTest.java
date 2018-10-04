package Test;

import org.junit.Test;

import PageObjects.HomePage;

public class WebAppTest extends AbstractTestDriver {

	@Test
	public void shouldPerformSimpleClick() {
		PageObjects.HomePage homePage = new HomePage(driver);
		homePage.navigateToWebApp().navigateToContactPage().navigateToHomePage();
	}

}