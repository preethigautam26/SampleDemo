package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage<Webdriver> {
	
	
	public static WebElement textbox_serach( WebDriver driver) {
		
		WebElement element = driver.findElement(By.name("q"));
		return element;
		
	}
	
	
    public static WebElement  button_serach( WebDriver driver) {
		
		WebElement element = driver.findElement(By.name("btnK"));
		return element;
		
	}
	

}
