0package SeleniumJava2k23.SeleniumJava2k23;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserUtil 
{
	private WebDriver driver;
	public WebDriver initDriver(String browserName)
	{
		System.out.println("browser name "+ browserName);
		switch(browserName.toLowerCase().trim())
		{
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "firefox":
			driver=new ChromeDriver();
			break;
		case "edge":
			driver=new ChromeDriver();
			break;
		case "safari":
			driver=new ChromeDriver();
			break;
			default:
				System.out.println("plz pass teh right browser "+browserName);
				break;
		}
		return driver;
	}
	public void launchURL(String url)
	{
		if(url==null)
		{
			System.out.println("url can not be null");
		}
		if(url.indexOf("https")==0)
		{
			driver.get(url);
		}
	}
	public String getPageTitle()
	{
		String title=driver.getTitle();
		System.out.println("page title"+title);
		return title;
		
	}
	public String getPageURL()
	{
		String title=driver.getCurrentUrl();
				System.out.println("page title : "+ title);
		return title;
		
	}
	public void quitBrowser() {
		// TODO Auto-generated method stub
		if(driver !=null) {
			driver.quit();
		}
	}
}
