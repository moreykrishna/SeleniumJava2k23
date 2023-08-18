package SeleniumJava2k23.SeleniumJava2k23;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriverMethods {
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("amazon.com"))
		{
			System.out.println("PASS");
		}
		String pgsrc=driver.getPageSource();
		System.out.println(pgsrc);
		if(pgsrc.contentEquals("navyaan"))
				{
			System.out.println("PASS");
				}
		        driver.quit();
	}
}