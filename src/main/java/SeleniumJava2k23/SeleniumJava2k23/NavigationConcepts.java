package SeleniumJava2k23.SeleniumJava2k23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcepts 
{
	WebDriver driver;
	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.google.com");
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		//diff btw navigate().to and get method
		//driver.navigate().to() internally use  get method
	}

}
