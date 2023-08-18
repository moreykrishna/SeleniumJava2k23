package SeleniumJava2k23.SeleniumJava2k23;
import java.util.Set;
import javax.swing.text.html.HTMLDocument.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserWindowHandle
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement twEle=driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		twEle.click();
		//get the window ids
		Set<String> handles=driver.getWindowHandles();
		java.util.Iterator<String> it=handles.iterator();
		String parentWindowId=it.next();
		System.out.println("parent window id : "+parentWindowId);
		String childWindowId=it.next();
		System.out.println("child window id : "+childWindowId);
		//Switching to window
		driver.switchTo().window(childWindowId);
		System.out.println("child window url : "+driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window url : "+driver.getCurrentUrl());
	}
}
