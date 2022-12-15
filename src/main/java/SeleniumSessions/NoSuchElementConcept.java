package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoSuchElementConcept {
	static WebDriver driver;
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
//		WebElement name = driver.findElement(By.id("Form_getForm_Name"));
//		name.sendKeys("Ankita");
		
		List<WebElement> eleList = driver.findElements(By.className("text8"));
		//will not give no such element exception
		System.out.println(eleList.size());
	}

}
