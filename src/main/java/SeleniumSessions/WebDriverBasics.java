package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/ankita/Documents/Webdriver/chromedriver");
		
		WebDriver driver = new ChromeDriver(); //topcast Interface -> CD
		driver.get("https://www.google.com");
		String urlName = driver.getCurrentUrl();
		System.out.println("Page url is : "+urlName);
		String title = driver.getTitle();
		System.out.println("Page title is : "+title);

		driver.quit();
	}

}
