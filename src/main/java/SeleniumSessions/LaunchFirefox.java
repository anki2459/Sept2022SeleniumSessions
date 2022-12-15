package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/ankita/Documents/Webdriver/geckodriver");
		
		WebDriver driver = new FirefoxDriver(); //topcast Interface -> CD
		driver.get("https://www.google.com");
		String urlName = driver.getCurrentUrl();
		System.out.println("Page url is : "+urlName);
		String title = driver.getTitle();
		System.out.println("Page title is : "+title);

		driver.quit();
	}

}
