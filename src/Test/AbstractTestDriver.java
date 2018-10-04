package Test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractTestDriver {

	protected WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C://Apps/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void shutDown() {
		driver.close();
	}

}