package SeleniumJava2k23.SeleniumJava2k23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ElementIsDisplayed 
{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		 driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By search=By.xpath("//*[@id='search']/input");
		By search1=By.xpath("//*[@id='search']/span/button");
		if(doElementIsDisplayed(search))
				{
			System.out.println("serach is present");
			dosendKeys(search, "amacnook");
			doClick(search1);
			}
	}
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	public static boolean doElementIsDisplayed(By locator)
	{
		return getElement(locator).isDisplayed();
	}
	public static void dosendKeys(By locator,String value)
	{
		getElement(locator).sendKeys(value);
	}
	public static void doClick(By locator)
	{
		getElement(locator).click();
	}
}
