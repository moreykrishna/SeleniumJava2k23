package SeleniumJava2k23.SeleniumJava2k23;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriverBasics {
	public static void main(String[] args) {
		WebDriver driver=null;
		String browser="firefox";
		driver=new ChromeDriver();
		driver.get("https://firefox.com");
		String title=driver.getTitle();
		System.out.println(title);
		if(browser.equals("chrome"))
		{
			System.out.println("chrome");
		}
		else if(browser.equals("firefox"))
		{
			System.out.println("firefox");
		}
		else if(browser.equals("opera"))
		{
			System.out.println("opera");
		}
		else
		{
			System.out.println("pass correct browser "  + browser);
		}
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}
}