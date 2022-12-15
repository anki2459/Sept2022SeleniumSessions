package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); //topcast Interface -> CD
		driver.get("https://www.google.com");
		String urlName = driver.getCurrentUrl();
		System.out.println("Page url is : "+urlName);
		String title = driver.getTitle();
		System.out.println("Page title is : "+title);

	}

}
