package SeleniumJava2k23.SeleniumJava2k23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		int totalfrmes=driver.findElements(By.xpath("//frame")).size();
		System.out.println(totalfrmes);
		//driver.switchTo().frame(2);
		//driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")));
		
		String header=driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
		driver.switchTo().defaultContent();
		
		
	}

}
