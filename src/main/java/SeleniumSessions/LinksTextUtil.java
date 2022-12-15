package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksTextUtil {

	static WebDriver driver;
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		 By links = By.tagName("a"); 
		System.out.println(getElementsCount(links)) ;
		
		 
		 List<String> linkList = getElementsTextList(links);
		 for(String e:linkList)
		 {
			 System.out.println(e);
		 }
	}
	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	public static int getElementsCount(By locator)
	{
		return getElements(locator).size();
	}
	public static List<String> getElementsTextList(By locator)
	{
		List<WebElement> eleList = getElements(locator);
		List<String> textList = new ArrayList<String>();
		for(WebElement e:eleList)
		{
			if(!e.getText().isEmpty())
			{
				textList.add(e.getText());
			}
		}
		return textList;
	  
	}
}
