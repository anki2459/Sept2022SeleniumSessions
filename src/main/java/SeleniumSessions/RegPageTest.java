package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest {

	public static void main(String[] args) throws InterruptedException 
	{
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("Safari");
		brUtil.getUrl("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		String title = brUtil.getTitle();
		System.out.println(title);
		
		By fname = By.id("input-firstname");
		By lname = By.id("input-lastname");
		By email = By.id("input-email");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(fname, "Ankita");
		eleUtil.doSendKeys(lname, "George");
		eleUtil.doSendKeys(email, "ankita@gmail.com");
		Thread.sleep(5000);
		
		brUtil.doClose();
		

		

		
	}

}
