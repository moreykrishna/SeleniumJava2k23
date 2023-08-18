package TestNgSessions;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class AmazonTest extends BaseTest
{
//	WebDriver driver;
//	
//	@BeforeTest
//	public void setUp()
//	{
//		driver =new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		//driver.get("https://www.amazon.com");
//	}
	@Test
	public void titleTest()
	{
		String title = driver.getTitle();
		System.out.println("page title : " +title);
		Assert.assertEquals(title, "Amazon.com. Spend less. smile more.");
	}
	@Test
	public void searchExistTest()
	{
		boolean flag = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		Assert.assertTrue(flag);
				
	}
	@Test
	public void isHelpExistTest()
	{
		boolean flag= driver.findElement(By.linkText("Help")).isDisplayed();
		Assert.assertTrue(flag);
		
	}
@AfterTest
public void tearDown()
{
	driver.quit();
}
}
