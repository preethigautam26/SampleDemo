package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {

  @Test
	
	public void login() {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("preethis9008@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("1234");
		driver.close();
	}
}
