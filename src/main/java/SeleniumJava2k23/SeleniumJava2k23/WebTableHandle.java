package SeleniumJava2k23.SeleniumJava2k23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		
		driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com");
		driver.findElement(By.name("username")).sendKeys("naveenautomation");
		driver.findElement(By.name("password")).sendKeys("selenium@12345");
		driver.findElement(By.xpath("//input[@value='login']")).click();
		Thread.sleep(4000);
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		Thread.sleep(4000);
		selectUser("deepti gupta");
		
		selectUser("Ali khan");
		String cNmae=getUserCompanyName("Ali Khan");

	}
////a[text()='Ali Khan']/parent::td/preceding-sibling::td/input[@type='checkbox']
	public static void selectUser(String userName)
	{
		driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	}
	////a[text()='Ali khan']/parent::td/following-sibling::td/a[@context='company']
	public static String getUserCompanyName(String userName)
	{
		return driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td/a[@context='company']")).getText();
	}
}
