package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchSafari {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new SafariDriver(); //topcast Interface -> CD
		driver.get("https://www.google.com");
		String urlName = driver.getCurrentUrl();
		System.out.println("Page url is : "+urlName);
		String title = driver.getTitle();
		System.out.println("Page title is : "+title);
		driver.quit();
	}

}
