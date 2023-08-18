package SeleniumJava2k23.SeleniumJava2k23;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TotalImages {
	static WebDriver driver;
	public static void main(String[] args) 
	{
	driver=new ChromeDriver();
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	List<WebElement> imglist=driver.findElements(By.tagName("img"));
	int linkcount=imglist.size();
	System.out.println(linkcount);
	}
}
