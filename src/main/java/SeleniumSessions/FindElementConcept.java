package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementConcept {

	static WebDriver driver ;
	//you have to get count of links/images on the page
		// then print the text of each link on the console
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
	
	List<WebElement> links=	driver.findElements(By.tagName("a"));
	int count = links.size();
	System.out.println(count);
//	for(int i = 0;i< count;i++)
//	{
//		String linkText = links.get(i).getText();
//		if(!linkText.isEmpty())
//		{
//		System.out.println(linkText);
//		}
//	}
	for (WebElement e:links)
	{
		String linkText = e.getText();
		if(!linkText.isEmpty())
			{
		System.out.println(linkText);
			}
				
	}

	}
}