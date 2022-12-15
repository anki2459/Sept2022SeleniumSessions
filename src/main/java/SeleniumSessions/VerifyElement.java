package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyElement {

	static WebDriver driver;
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By formFields = By.className("text11"); 
		int fieldsCount = driver.findElements(formFields).size();
		
		if(fieldsCount == 0)
		{
			System.out.println("Form fields are not available");
		}
		else
		{
			System.out.println("Form fields are available");

		}
		
		//To verify Single Element
		//By contactSalesLink = By.linkText("CONTACT SALES");
		//Always choose the format written on page instead of DOM
		By contactSalesLink = By.linkText("Contact Sales");
		//driver.findElement(contactSalesLink).click();
		
//		boolean flag = driver.findElement(contactSalesLink).isDisplayed();
//		System.out.println(flag);
//		
//		if(driver.findElements(contactSalesLink).size() >= 1)
//		{
//			System.out.println("Contact Sales Link is Displayed on Page");
//		}
//		
		isElementExists(contactSalesLink);

	}
	public static boolean isElementExists(By locator)
	{
		int elementCount = driver.findElements(locator).size();
		System.out.println("total elements found " +elementCount);
			if(elementCount >= 1) {
				System.out.println("Element is found.."+ locator);
				return true;
			}
			else {
				System.out.println("Element is not found.."+ locator);
				return false;
			}
	}

}
