package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindImages {
static WebDriver driver;
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		 By images = By.tagName("img");
	//List<WebElement> images = driver.findElements(By.tagName("img"));
		 List<WebElement> imageList =getElements(images);
		
	int count = imageList.size();
	System.out.println(count);
	
	for(WebElement e:imageList)
	{
		String name = e.getAttribute("alt");
		String jpg = e.getAttribute("src");
		System.out.println(name+ " ---> "+jpg);
			
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

}
