package SeleniumJava2k23.SeleniumJava2k23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementException 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement fn=driver.findElement(By.id("input-email"));//v1
		fn.sendKeys("kris");//v1
		driver.navigate().refresh();//dom v2
		//stale element exception
		 fn=driver.findElement(By.id("input-email"));
		fn.sendKeys("kris");
		
	}

}
