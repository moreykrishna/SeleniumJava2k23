package SeleniumJava2k23.SeleniumJava2k23;

import java.awt.Desktop.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ActionClickSendKeys 
{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account");
		By fn=By.id("input-firstname");
		By ln=By.id("input-lastname");
		By continueBtn=By.cssSelector("input[type='submit']");
		Actions act =new Actions(driver);
		act.sendKeys(driver.findElement(fn),"naveen").build().perform();
		act.sendKeys(driver.findElement(fn),"automation").build().perform();
		act.click(driver.findElement(continueBtn)).build().perform();
		
		//ElementNotInteractrableException
		//ElementNotInterceptedException
		doActionsSendKeys(fn, "Naveen");
		doActionsSendKeys(ln, "Automation");
		doActionsClick(continueBtn);
		
	}
		public static WebElement getElement(By locator)
		{
			return driver.findElement(locator);
		}
		public static void doActionsSendKeys(By locator,String value)
		{
			Actions act =new Actions(driver);
			act.sendKeys(getElement(locator),value).build().perform();
		}
		public static void doActionsClick(By locator)
		{
			Actions act =new Actions(driver);
			act.click(getElement(locator)).build().perform();
		}
	}


