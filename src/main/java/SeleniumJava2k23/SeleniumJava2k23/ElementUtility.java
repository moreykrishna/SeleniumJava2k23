package SeleniumJava2k23.SeleniumJava2k23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ElementUtility 
{
	private static WebDriver driver;
	public ElementUtility(WebDriver driver)
	{
		this.driver=driver;
	}
	public  WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	public  void doSendKeys(By locator,String value)
	{
		getElement(locator).sendKeys(value);
	}
}
