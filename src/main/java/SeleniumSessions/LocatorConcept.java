package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {
	static WebDriver driver ;
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		
		// 1 direct call
//		driver.findElement(By.id("input-email")).sendKeys("ankita.george@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("Test@123");
		
		//2 create WebEleemnt to perform action
		
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		emailId.sendKeys("ankita.george@gmail.com");
//		password.sendKeys("Test@123");
		
		//3 Create By locator , then webelemnt then perfrom action
		
//		By email = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		driver.findElement(email).sendKeys("ankita.george@gmail.com");
//		driver.findElement(pwd).sendKeys("Test@123");
//					//OR//
//		WebElement emailId = driver.findElement(email);
//		WebElement password = driver.findElement(pwd);
//		
//		emailId.sendKeys("ankita.george@gmail.com");
//		password.sendKeys("Test@123");

		//4 create getElement method with By locator arg
		
//		By email = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		getElement(email).sendKeys("ankita.george@gmail.com");
//		getElement(pwd).sendKeys("Test@123");
		
		//5 create getElement method and do sendkeys method
		
//		By email = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		doSendKeys(email,"ankita@gmail.com");
//		doSendKeys(pwd,"Test@123");
		
		//6 ElementUtil method 
//		By email = By.id("input-email");
//		By pwd = By.id("input-password");
//			
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(email,"ankita@gmail.com");
//		eleUtil.doSendKeys(pwd,"Test@123");
//		
		//7 create getBy method 
//		
//		String un =	"input-email";
//		String pw =  "input-password";
//		
//		doSendKeys("id",un,"ankita@gmail.com");
//		doSendKeys("id",pw,"Test@123");
		
		Thread.sleep(5000);
		
		driver.quit();
	}
	public static By getBy(String locatorType,String locatorvalue)
	{
		By locator=null;
		switch(locatorType)
		{
		case "id" :
					locator = By.id(locatorvalue);
					break;
		case "name" :
					locator = By.name(locatorvalue);
					break;
		default :
			System.out.println("Please enter valid locator...");
			break;
		}
		return locator;
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	public static WebElement getElement(String locatorType,String locatorvalue)
	{
		return driver.findElement(getBy(locatorType,locatorvalue));
	}
	public static void doSendKeys(By locator,String value)
	{
		 getElement(locator).sendKeys(value);
	}
	public static void doSendKeys(String locatorType,String locatorvalue,String value)
	{
		 getElement(getBy(locatorType,locatorvalue)).sendKeys(value);
	}

}
