package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTest {
	static WebDriver driver;
	public static void main(String[] args) {
		
		String browserName = "FIREFOX";
		switch(browserName.toLowerCase())
		{
		case "chrome":
			 System.setProperty("webdriver.chrome.driver", "/Users/ankita/Documents/Webdriver/chromedriver");
			 driver = new ChromeDriver(); //launch gc
			 System.out.println("Chrome browser launched");
			 break;
			
		case "firefox":
			 System.setProperty("webdriver.gecko.driver", "/Users/ankita/Documents/Webdriver/geckodriver");
			 driver = new FirefoxDriver(); //launch gc
			 System.out.println("Firefox browser launched");
			 break;
			
		case "safari":
			 driver = new SafariDriver();
			System.out.println("Safari browser launched");
			break;
			
		}
		  //topcast Interface -> CD
		driver.get("https://www.google.com");
		String urlName = driver.getCurrentUrl();
		System.out.println("Page url is : "+urlName);
		String title = driver.getTitle();
		System.out.println("Page title is : "+title);
		driver.quit();
	}

}
