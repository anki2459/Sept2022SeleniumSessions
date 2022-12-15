package SeleniumSessions;

public class AmazonTest {

	public static void main(String[] args) 
	{

		BrowserUtil br = new BrowserUtil();
		br.launchBrowser("Chrome");
		br.getUrl("http://www.amazon.com");
		
		String amazonTitle = br.getTitle();
		System.out.println(amazonTitle);
		if(amazonTitle.contains("Amazon"))
		{
			System.out.println("Correct title of page");
		}
		else
		{
			System.out.println("Incorrect title of page");
		}
		
		String curUrl = br.getAppCurrentURL();
		System.out.println(curUrl);
		
		br.doClose();
	}

}
