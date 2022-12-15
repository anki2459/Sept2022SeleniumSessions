package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements1 {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
	List<WebElement> list=	driver.findElements(By.tagName("a"));
	int count = list.size();
	System.out.println(count);
	
	for(WebElement e:list)
	{
		if(!e.getText().isEmpty())
		{
		System.out.println(e.getText());
		}
	}
   
	}

}
