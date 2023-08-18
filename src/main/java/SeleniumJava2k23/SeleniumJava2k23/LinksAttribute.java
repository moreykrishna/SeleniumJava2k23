package SeleniumJava2k23.SeleniumJava2k23;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LinksAttribute {
		 static WebDriver driver;
			public static void main(String[] args) 
			{
				driver=new ChromeDriver();
				driver.get("https://www.amazon.com/");
			By links=By.tagName("a");
			By img=By.tagName("img");
//          List<WebElement> linklist=getElements(links);		
//          System.out.println("total links"+linklist.size());
//          for(WebElement e:linklist)
//          {
//        	  String href=e.getAttribute("href");
//        	  String linktext=e.getText();
//        	  System.out.println(href +" "+ linktext);
//          }	
			List<WebElement> imglist=getElements(img);		
	          System.out.println("total links"+imglist.size());
	          for(WebElement e:imglist)
	          {
	        	  String imglist1=e.getAttribute("src");
	        	  //String linktext=e.getText();
	        	  System.out.println(imglist1);
	          }	
			}
			public static List<WebElement> getElements(By locator)
			{
				return driver.findElements(locator);
			}
	}