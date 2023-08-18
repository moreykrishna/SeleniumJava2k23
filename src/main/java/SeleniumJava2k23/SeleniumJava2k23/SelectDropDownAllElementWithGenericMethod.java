package SeleniumJava2k23.SeleniumJava2k23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllElementWithGenericMethod {
//8th Video b
	
	static WebDriver driver;
	public static void main(String[] args) 
		{
		driver=new ChromeDriver();
driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
By country=By.id("Form_getForm_Country");
selectDropDownValue(country, "india");
if(getTotalDropDownOptions(country)-1==232)
{
	System.out.println("country dropdown is correct");
}
if(getDropDownOptionsTextList(country).contains("India"))
{
	System.out.println("India is prsnt");
}
List<String> expCountryList=Arrays.asList("India","Brazil","Belgium");
if(getDropDownOptionsTextList(country).containsAll(expCountryList))
{
	System.out.println("Pass");
}
}
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	public static List<WebElement> getDropDownOptionsList(By locator)
	{
		Select select=new Select(getElement(locator));
		return select.getOptions();
	}
	public static List<String> getDropDownOptionsTextList(By locator)
	{
		List<WebElement> optionsList=getDropDownOptionsList(locator);
		List<String> optionsTextList=new ArrayList<String>();
		for(WebElement e : optionsList)
			
		{
			String text=e.getText();
			optionsTextList.add(text);
		}
		return optionsTextList;
	}
	
	public static int getTotalDropDownOptions(By locator)
	{
		return getDropDownOptionsList(locator).size();
	}
	public static void selectDropDownValue(By locator,String expValue)
	{
		List<WebElement> optionsList= getDropDownOptionsList(locator);
		for(WebElement e : optionsList)
		{
			String text=e.getText();
			System.out.println(text);
			
			if(text.equals(expValue))
			{
				e.click();
				break;
			}
		}
	}
	
}
