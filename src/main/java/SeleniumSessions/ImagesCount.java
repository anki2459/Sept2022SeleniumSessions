package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImagesCount {

	static WebDriver driver ;
	//you have to get count of links/images on the page
		// then print the text of each link on the console
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
	
	List<WebElement> imgLinks=	driver.findElements(By.tagName("img"));
	int count = imgLinks.size();
	System.out.println(count);
	for (WebElement e:imgLinks)
	{
		String linkText = e.getAttribute("src");
		if(!linkText.isEmpty())
			{
		System.out.println(linkText);
			}

	}

	}
}
