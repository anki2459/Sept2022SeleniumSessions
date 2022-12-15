package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownValueWithoutUsingSelectMethods {

	static WebDriver driver ;
	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//WebElement country = driver.findElement(By.id("Form_getForm_Country"));
		By countryTag = By.id("Form_getForm_Country");
		String countryName = "Argentina";
		doSelectDropDownValue(countryTag, countryName);
		
//		Select select = new Select(country);
//		List<WebElement> countryList = select.getOptions();
//		
//		for(WebElement e:countryList )
//		{
//			String countryName = e.getText();
//			System.out.println(countryName);
//			if(countryName.equals("India"))
//			{
//				e.click();
//				break;
//			}
//		}

	}
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	public static void doSelectDropDownValue(By locator,String value)
	{
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		
		for(WebElement e:optionsList )
		{
			String countryName = e.getText();
			System.out.println(countryName);
			if(countryName.equals(value))
			{
				e.click();
				break;
			}
		}
		
	}

}
