package SeleniumJava2k23.SeleniumJava2k23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTableHandling12 {
static WebDriver driver;
	public static void main(String[] args)
	{
		driver=new ChromeDriver();
		// TODO Auto-generated method stub
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		int headerCount=getTableHeaderCount();
		System.out.println(headerCount);
		//table[@id="customers"]/tbody/tr[2]/td[1]
		//table[@id="customers"]/tbody/tr[3]/td[1]
		//table[@id="customers"]/tbody/tr[4]/td[1]
		String beforeXpath="//table[@id=\"customers\"]tbody/tr";
		String afterXpath="]/td[1]";
		for(int row=2;row<=7;row++)
		{
			String xpath=beforeXpath+ row + afterXpath;
			String val=driver.findElement(By.xpath(xpath)).getText();
			System.out.println(val);
					
		}

	}
	public static int getTableHeaderCount()
	{
		return driver.findElements(By.xpath("//table[@id='customers']//th")).size();
	}

}
