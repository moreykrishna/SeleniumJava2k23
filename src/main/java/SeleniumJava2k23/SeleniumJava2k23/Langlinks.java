package SeleniumJava2k23.SeleniumJava2k23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Langlinks 
{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement> langLinks=driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		
		System.out.println(langLinks.size());
		for(WebElement e : langLinks)
		{
			String text=e.getText();
			if(text.equals("English"))
			{
				e.click();
				break;
			}
		}
	}
	//Assignment 1.Click on a specific lang
	//2.return list of lang links
	//3.capture the list of google footer links

}
