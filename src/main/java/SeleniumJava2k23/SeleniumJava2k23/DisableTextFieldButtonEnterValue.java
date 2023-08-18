
package SeleniumJava2k23.SeleniumJava2k23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableTextFieldButtonEnterValue 
{
	public static void main(String[] args) 
	{
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
//		WebElement pwd=driver.findElement(By.id("pass"));//this is disabled
//		pwd.sendKeys("test@123");
//		//ElementNotInteractableException : element not interactable
//		
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://classic.freecrm.com/register/");
//		WebElement submit_btn=driver.findElement(By.id("submitButton"));
//		String disableText=submit_btn.getAttribute("disabled");
//		System.out.println(disableText);
//		submit_btn.click();//element click intercepted exception
		//Invalid locator
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.findElement(By.xpath("////input[@@id,'name']")).sendKeys("testing");
		//invalid selector exception
		
		driver.findElement(By.xpath("//input[@id='namenaveen']")).sendKeys("testing");
		//Nosuch element exception
		//NoAlertException
		
		
	}

}
