package SeleniumJava2k23.SeleniumJava2k23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UtilityMethod 
{
	static WebDriver driver;
	public   void getElementAttributes(By locator,String attrName)
	{
		List<WebElement> eleList=getElements(locator);		
	    for(WebElement e : eleList)
	    {
	  	  String attrVal = e.getAttribute(attrName);
	  	  System.out.println(attrVal);
	    }
	}
		public   List<WebElement> getElements(By locator)
			{
				return driver.findElements(locator);
		}
}
