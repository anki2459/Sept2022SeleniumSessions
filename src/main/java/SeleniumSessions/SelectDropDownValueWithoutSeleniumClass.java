package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownValueWithoutSeleniumClass {
	static WebDriver driver ;
	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//List<WebElement> country = driver.findElements(By.xpath("//select[@id='Form_getForm_Country']/option"));
		By country = By.xpath("//select[@id='Form_getForm_Country']/option");
		selectDropDownValueWithoutSelect(country, "Ecuador");
//		for(WebElement e:country)
//		{
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals("India"))
//			{
//				e.click();
//				break;
//			}
//		}
	}
	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	public static void selectDropDownValueWithoutSelect(By locator,String value)
	{
		List<WebElement> optionsList = getElements(locator);
		System.out.println(optionsList.size());
		for(WebElement e:optionsList)
		{
			String text = e.getText();
			System.out.println(text);
			if(text.equals(value))
			{
				e.click();
				break;
			}
		}
	}
}
