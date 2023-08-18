package SeleniumJava2k23.SeleniumJava2k23;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GoogleSearchTest9 {
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException 
		{
			driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.findElement(By.name("q")).sendKeys("Naveen automation Labs");
			Thread.sleep(5000);
			List<WebElement> langLinks=driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
			
			System.out.println(langLinks.size());
			for(WebElement e : langLinks)
			{
				String text=e.getText();
				System.out.println(text);
				if(text.contains("naveen automation labs github"))
				{
					e.click();
					break;
				}
			}
		}
	}


