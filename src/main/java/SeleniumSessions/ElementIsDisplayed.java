package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementIsDisplayed {
	static WebDriver driver;
	public static void main(String[] args) 
	{

		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		By emailID = By.id("input-email");
//		 Boolean flag = driver.findElement(emailID).isDisplayed();
//		 if(flag)
//		 {
//			 System.out.println("Element is displayed");
//		 }
	
		 if(doIsDisplayed(emailID))
			 {
				 System.out.println("Element is displayed");
			 }

	}
	public static boolean doIsDisplayed(By locator)
	{
		return driver.findElement(locator).isDisplayed();
	}

}
