package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AttributesConcept {

	static WebDriver driver;
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		//String hrefVal = driver.findElement(By.linkText("Amazon Devices")).getAttribute("href");
		By amazonDevicesLink = By.linkText("Amazon Devices");
		String hrefVal =getAttributeValue(amazonDevicesLink,"href");
		//System.out.println(hrefVal);
		
		if(hrefVal.contains("footer_devices"))
		{
			System.out.println("This is correct href");
		}
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	public static String getAttributeValue(By locator,String attrName)
	{
		 String attrVal =  getElement(locator).getAttribute(attrName);
		 System.out.println(attrVal);
		 return attrVal;
	}

}
