package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil 
{
	public WebDriver driver;
	
	/**
	 * 
	 * @param this method launches browser specified in browsername
	 * @return
	 */
	public WebDriver launchBrowser(String browser)
	{
		switch(browser.toLowerCase())
		{
		case "chrome":
			// System.setProperty("webdriver.chrome.driver", "/Users/ankita/Documents/Webdriver/chromedriver");
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver(); //launch gc
			 System.out.println("Chrome browser launched");
			 break;
			
		case "firefox":
			 //System.setProperty("webdriver.gecko.driver", "/Users/ankita/Documents/Webdriver/geckodriver");
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver(); //launch gc
			 System.out.println("Firefox browser launched");
			 break;
			
		case "safari":
			 driver = new SafariDriver();
			System.out.println("Safari browser launched");
			break;
			
		}
		return driver;
	}
	/**
	 * 
	 * @param open specified url in browser
	 */
	public void getUrl(String url)
	{
		if(url==null)
		{
			System.out.println("Please write url name...");
			return;
		}
		if(url.indexOf("http")==-1)
		{
			System.out.println("Please write http in url...");
			return;
		}
		  driver.get(url);
	}
	/**
	 * 
	 * @return returns url of current page
	 */
	public String getAppCurrentURL()
	{
		return driver.getCurrentUrl();
		 
	}
	/**
	 * 
	 * @return returns title of page
	 */
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	/**
	 * Performs close operation on browser
	 */
	public void doClose()
	{
		driver.close();
	}
	/**
	 * Performs Quit operation on browser
	 */
	public void doQuit()
	{
		driver.quit();
	}
	

}
