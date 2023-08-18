package SeleniumJava2k23.SeleniumJava2k23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class RightClickHandle 
{
	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		driver.get("http://Swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement ele= driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act=new Actions(driver);
		act.contextClick(ele).build().perform();
		List<WebElement> rightEles=driver.findElements(By.cssSelector("ul.context-menu-list span"));
		System.out.println(rightEles.size());
		for(WebElement e : rightEles)
		{
			String text=e.getText();
			System.out.println(text);
			if(text.equals("copy"))
			{
				e.click();
				org.openqa.selenium.Alert alert=driver.switchTo().alert();
              System.out.println(alert.getText());
             alert.accept();
          break;
}
		}
	}

}
