package SeleniumJava2k23.SeleniumJava2k23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
		public static void main(String[] args)
		{
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
			driver.findElement(By.xpath("//img[@title='vehicle-registration-forms-and-templates')")).click();
			driver.switchTo().frame(driver.findElement(By.xpath("iframe[contains(@id,'frame-one')]")));
			driver.findElement(By.id("RESULT_TextField-7")).sendKeys("India-9090");
			driver.switchTo().defaultContent();
		

	}

}
