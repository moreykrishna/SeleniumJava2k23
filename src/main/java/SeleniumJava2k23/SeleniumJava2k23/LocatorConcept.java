package SeleniumJava2k23.SeleniumJava2k23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.collect.DiscreteDomain;
public class LocatorConcept
{
	static WebDriver driver;
public static void main(String[] args) 
{
	By emailid=By.id("input.email");
	By password=By.id("input-password");
}
public static WebElement getElement(By locator)
{
	return driver.findElement(locator);
}
public static void doSendKeys(By locator,String value)
{
	getElement(locator).sendKeys(value);
}
}