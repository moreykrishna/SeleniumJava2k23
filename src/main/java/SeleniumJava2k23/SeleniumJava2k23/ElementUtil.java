package SeleniumJava2k23.SeleniumJava2k23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ElementUtil 
{
	static WebDriver driver;
	public static void main(String[] args) {
	driver=new ChromeDriver();
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//	driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//	driver.findElement(By.id("input-password")).sendKeys("naveen@123");
	//2nd Approach
//	WebElement email=driver.findElement(By.id("input-email"));
//	WebElement password=driver.findElement(By.id("input-password"));
//	email.sendKeys("naveen@gmail.com");
//	password.sendKeys("naveen@123");
	
	//3rd Approach
//	By email1=By.id("input-email");
//	By pwd=By.id("input-password");
//	WebElement eid=driver.findElement(email1);
//	WebElement pwdd=driver.findElement(pwd);
//	eid.sendKeys("naveen@gmail.com");
//	pwdd.sendKeys("kri");
	//4th Approach
	//By email1=By.id("input-email");
	//By pwd=By.id("input-password");
//	getElement(email1).sendKeys("kri@123");
//	getElement(pwd).sendKeys("kri@123");
//	}
//	public static WebElement getElement(By locator)
//	{
//	return driver.findElement(locator);
	//5th Approach
//	doSendKeys(email1, "kri@123");
//	doSendKeys(pwd, "kri@123");
	//6th Approach
	
	By email1=By.id("input-email");
	By pwd=By.id("input-password");
	
	ElementUtility eleUtil=new ElementUtility(driver);
	eleUtil.doSendKeys(email1, "kri@gmai.com");
	eleUtil.doSendKeys(pwd, "kri@123");
	}}
//	public static WebElement getElement(By locator)
//	{
//	return driver.findElement(locator);
//}	
//	public static void doSendKeys(By locator,String Value)
//	{
//	    getElement(locator).sendKeys(Value);
