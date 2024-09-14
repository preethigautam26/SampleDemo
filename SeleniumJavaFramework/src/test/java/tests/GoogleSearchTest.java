package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.GoogleSearchPage;

public class GoogleSearchTest extends GoogleSearchPage {
	
	static WebDriver driver = null;
	
	public GoogleSearchTest() {
		super();
	}

	@Test
	public static void googleSearch() throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		
		// goto google.com
		driver.get("https://www.google.com/");
		
		GoogleSearchPage.textbox_serach(driver).sendKeys("Automation step by step");
		Thread.sleep(2000);
		
		GoogleSearchPage.button_serach(driver).click();
		
		driver.close();
	}

}
