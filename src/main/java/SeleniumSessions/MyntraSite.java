package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyntraSite {

	static WebDriver driver ;
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dresses");
		Thread.sleep(5000);
		
//		List<WebElement> dresslist = driver.findElements(ey.xpath("//div[@class = 'autocomplete-results-container']//div[@role='button']"));
//		
//		for(WebElement e :dresslist)
//		{
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals("dresses for girls"))
//			{
//				e.click();
//				break;
//			}
//		}
		
		
	}
	public List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	public static void SelectOptionsFromSuggList(By locator,String value)
	{
		
		//getElements
	}
	

}
