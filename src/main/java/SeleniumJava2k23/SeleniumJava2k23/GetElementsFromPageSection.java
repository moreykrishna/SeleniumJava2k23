package SeleniumJava2k23.SeleniumJava2k23;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetElementsFromPageSection
{
	static WebDriver driver;
	public static void main(String[] args) { 
		{
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		List<WebElement>panelLinkLists=driver.findElements(By.xpath("//aside[@id='column-right']//a"));
		System.out.println(panelLinkLists.size());
		for(WebElement e : panelLinkLists)
		{
			String text = e.getText();
			System.out.println(text);
		}}
	}
		public static  List<WebElement> getElements(By locator)
		{
			return driver.findElements(locator);
	}
}