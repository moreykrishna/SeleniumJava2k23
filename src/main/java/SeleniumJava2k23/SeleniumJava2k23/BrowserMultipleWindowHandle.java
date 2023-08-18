package SeleniumJava2k23.SeleniumJava2k23;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class BrowserMultipleWindowHandle 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String parentWindow=driver.getWindowHandle();
		
		WebElement twEle=driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		WebElement fbEle=driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement yte=driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		WebElement leEle=driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
	
		twEle.click();
		fbEle.click();
		yte.click();
		leEle.click();
		Set<String> handles=driver.getWindowHandles();
		java.util.Iterator<String> it=handles.iterator();
		while(it.hasNext())
		{
			String windowId=it.next();
			driver.switchTo().window(windowId);
			System.out.println(driver.getCurrentUrl());
			if(!windowId.equals(parentWindow))
			{
			driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getCurrentUrl());
	}

}
