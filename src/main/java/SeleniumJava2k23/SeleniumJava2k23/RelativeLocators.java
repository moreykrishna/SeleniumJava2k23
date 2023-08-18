package SeleniumJava2k23.SeleniumJava2k23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		WebElement ele=driver.findElement(By.linkText("Kent Canada"));
		String rightIndex = driver.findElement(with(By.tagName("P")).toRightOf(ele)).getText();
		System.out.println(rightIndex);
		
		String leftrank = driver.findElement(with(By.tagName("P")).toLeftOf(ele)).getText();
		System.out.println(leftrank);
		
		String abovecity = driver.findElement(with(By.tagName("P")).above(ele)).getText();
		System.out.println(abovecity);
		
		String belowCity = driver.findElement(with(By.tagName("P")).above(ele)).getText();
		System.out.println(belowCity);
		
		String nearCity = driver.findElement(with(By.tagName("P")).above(ele)).getText();
		System.out.println(nearCity);
		
		
		
	}

	

}
