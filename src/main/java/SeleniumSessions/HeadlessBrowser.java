package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {

	public static void main(String[] args) {

		//headless
		// no browser launch visible
//		WebDriverManager.chromedriver().setup();
//		
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--headless");
//		WebDriver driver = new ChromeDriver(co);
		
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxOptions fo = new FirefoxOptions();
		//fo.addArguments("--headless");
		fo.addArguments("--incognito");
		WebDriver driver = new FirefoxDriver(fo);
		
		
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	//	System.out.println(driver.getPageSource());
		
		driver.quit();
	}
	

}
