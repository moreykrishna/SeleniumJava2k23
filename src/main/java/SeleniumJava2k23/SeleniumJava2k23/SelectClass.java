package SeleniumJava2k23.SeleniumJava2k23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SelectClass 
//8th Video
{
	static WebDriver driver;
	public static void main(String[] args) { 
		{
		driver=new ChromeDriver();
driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
By country=By.id("Form_getForm_Country");
//WebElement country_ele=driver.findElement(country);
//Select select=new Select(country_ele);
//select.selectByIndex(5);
//select.selectByValue("Belgium");
//select.selectByVisibleText("India");
doSelectDropDownByIndex(country, 7);
		}
}
		public static WebElement getElement(By locator)
		{
			return driver.findElement(locator);
		}
		public static  void doSelectDropDownByIndex(By locator,int index)
		{
			Select select=new Select(getElement(locator));
			select.selectByIndex(index);
			
		}
		public static  void doSelectDropDownByValue(By locator,String Value)
		{
			Select select=new Select(getElement(locator));
			select.selectByValue(Value);	
		}
		public static  void doSelectDropDownByVisibleText(By locator,String text)
		{
			Select select=new Select(getElement(locator));
			select.selectByValue(text);	
		}
}
