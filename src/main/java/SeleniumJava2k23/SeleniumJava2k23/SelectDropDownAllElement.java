package SeleniumJava2k23.SeleniumJava2k23;

import java.util.List;
//*********************************************In
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllElement 
{//8th video a
		static WebDriver driver;
		public static void main(String[] args) 
			{
			driver=new ChromeDriver();
	driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	By country=By.id("Form_getForm_Country");
	Select select=new Select(driver.findElement(country));
	List<WebElement>countryList=select.getOptions();
	System.out.println(countryList.size());
	for(WebElement e : countryList)
	{
		String str=e.getText();
		System.out.println(str);
		if(str.equals("Laos"))
		{
			e.click();
			break;
		}
	}

}
		
			}
		

		
		

