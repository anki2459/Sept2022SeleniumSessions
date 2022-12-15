package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImagesUtil {

	static WebDriver driver;
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		 By images = By.tagName("img");
		 System.out.println(getElementsCount(images));
		 
		 List<String> srcList = getAttributeList(images,"src");
		 printElementValue(srcList);
		 
		 printElementValue(getAttributeList(images,"alt"));


	}
	
	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	public static int getElementsCount(By locator)
	{
		return getElements(locator).size();
	}
	public static List<String> getAttributeList(By locator,String attrName)
	{
		List<WebElement> eleList = getElements(locator);
		List<String> attrList = new ArrayList<String>();
		for(WebElement e:eleList)
		{
			String attrValue = e.getAttribute(attrName);
			attrList.add(attrValue);
		}
		return attrList;
	}
	public static void printElementValue(List<String> eleList)
	{
		 for(String e:eleList)
		 {
			 System.out.println(e);
		 }
	}
}
