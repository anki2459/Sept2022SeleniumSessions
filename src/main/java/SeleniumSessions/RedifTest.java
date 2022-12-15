package SeleniumSessions;

public class RedifTest {

	public static void main(String[] args) 
	{

		BrowserUtil br = new BrowserUtil();
		br.launchBrowser("Safari");
		br.getUrl("http://www.rediff.com");
		
		String rediffTitle = br.getTitle();
		System.out.println(rediffTitle);
		if(rediffTitle.contains("Rediff"))
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
