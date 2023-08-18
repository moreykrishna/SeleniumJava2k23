package SeleniumJava2k23.SeleniumJava2k23;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetElementsFromPageSectionWithMethods {
//7th Video
			static WebDriver driver;
			public static void main(String[] args) { 
				{
				driver=new ChromeDriver();
				driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
				By panelLinkLists=By.xpath("//aside[@id='column-right']//a");
				List<String> str=getElemetsTextList(panelLinkLists);
				System.out.println(str.contains("Login"));
				}
			}
				public static List<String> getElemetsTextList(By locator)
				{
					List<String> eleTextList=new ArrayList<String>();
					List<WebElement> eleList=getElements(locator);
					for(WebElement e : eleList)
						{
						String text = e.getText();
						eleTextList.add(text);
						}
					return eleTextList;
				}
			
				public static  List<WebElement> getElements(By locator)
				{
					return driver.findElements(locator);
	}		
}
