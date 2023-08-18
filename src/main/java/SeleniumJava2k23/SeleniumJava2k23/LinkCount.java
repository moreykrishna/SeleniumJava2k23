package SeleniumJava2k23.SeleniumJava2k23;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LinkCount
{
static WebDriver driver;
	public static void main(String[] args)
	{
		 driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
List<WebElement> linklist=driver.findElements(By.tagName("a"));
int linkcount=linklist.size();
System.out.println(linkcount);
//for(int i=0;i<linkcount;i++)
//{ 
//	String text=linklist.get(i).getText();
//	{
//		if(text.length()>0)
//		{
//			System.out.println(i+" "+text);		}
//	}
int count=0;
	for(WebElement e:linklist)
	{
		String text=e.getText();
		if(text.length()>0)
		{
			System.out.println(count+": "+text);
		}
		count++;
	}
}
	}
