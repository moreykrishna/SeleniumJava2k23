package SeleniumJava2k23.SeleniumJava2k23;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefExceptionWithFEs 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		List<WebElement> linkList=driver.findElements(By.xpath("(//ul[@class='footer-nav'])[1])//a"));//v1
		for (int i = 0; i < linkList.size(); i++) {
			linkList.get(i).click();
			driver.navigate().back();
			linkList=driver.findElements(By.xpath("(//ul[@class='footer-nav'])[1])//a"));//v2
		}
		
	}

}
