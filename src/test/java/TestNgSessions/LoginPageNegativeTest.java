package TestNgSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class LoginPageNegativeTest 
{
	public WebDriver driver;
	
	public boolean doLogin(String userName, String password)
	{
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(userName);
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='login'")).click();
		String errorMsg=
		driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible")).getText();
		System.out.println(errorMsg);
		if(errorMsg.contains("No match for E-mail Address and /or password"))
				{
			return true;
				}
		return false;

	}
	@DataProvider
	public Object[][] getLoginNegativeData()
	{
	return new Object[][]
			{
		{"abc@gmail.com","test@123"},
		{"ac@gmail.com","test@123"},
		{"abc@gmail.com","tt@123"},
		{"abc@gmail.com","test@12"},
			};
}
	@Test(dataProvider = "getLoginNegativeData")
	public void loginTest(String userName, String password)
	{
		boolean flag=doLogin(userName,password);
		Assert.assertTrue(flag);
	}
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	@Test
	public void LoginTest()
	{
		doLogin("abs@gmail.com", "test@123");
	}
}
//
//@DataProvider
//public Object[][] getRegTestData()
//{
//	return new Object[][]
//			{
//		{"HEENA","VARHELA","HEE@GAMIL.COM","9400404","JJ4@GMAIL.COM"},
//		{"HEENA","VARHELA","HEE@GAMIL.COM","9400404","JJ4@GMAIL.COM"},
//			};
//}

//@Test(dataProvider="getRefTestData")
//public void registerTest(String fn,String ln,String email, String Phone,String password)
//{
//	System.out.println(fn + ln + email _+ phone + password);
//}










