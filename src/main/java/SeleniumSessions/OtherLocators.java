package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OtherLocators {
	static WebDriver driver;
	public static void main(String[] args)  {

		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		
		//driver.get("https://classic.crmpro.com/index.html");
		//driver.get("https://demo.opencart.com/index.php?route=account/login");
	   // driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	    driver.get("https://www.freshworks.com/");
		//2.By name
//		driver.findElement(By.name("username")).sendKeys("hello");
//		driver.findElement(By.name("password")).sendKeys("world");
		
//		By username = By.name("username");
//		By password = By.name("password");
	ElementUtil eleUtil = new ElementUtil(driver);
//		
//		eleUtil.doSendKeys(username, "test@gmail.com");
//		eleUtil.doSendKeys(password, "test@123");

		//3.By className
//		driver.findElement(By.className("form-control")).sendKeys("naveen");
		
		//4.By xpath
//		driver.findElement(By.xpath("//*[@id='input-email']")).sendKeys("ankitababy");
		
		//5.By cssselector
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("ankitababy");
		
		//6.By linked text
//		driver.findElement(By.linkText("Register")).click();
//		By regLink = By.linkText("Register");
//		doClick(regLink);
		
//		String register = "Register";
//		eleUtil.doClick("linkText", register);
	
		//7. By partial link text
	//	driver.findElement(By.partialLinkText("Book")).click();
		
		//8 By tagNAme
		String header = driver.findElement(By.tagName("h1")).getText();  
		System.out.println(header);
		if(header.contains("Love"))
		{
			System.out.println("header is correct");
		}
	}
	public static WebElement getElement(By locator)
	{
		 return driver.findElement(locator);
	}
	public static void doClick(By locator)
	{
		getElement(locator).click();
	}
	

}
