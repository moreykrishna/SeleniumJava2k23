package SeleniumJava2k23.SeleniumJava2k23;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ListAttributes {
private static final By links = null;
static WebDriver driver;
	public static void main(String[] args) {
			driver=new ChromeDriver();
			driver.get("https://www.amazon.com/");
		By links=By.tagName("a");
		By img=By.tagName("img");
		getElementAttributes(links, "href");
	}
	 	
public static  void getElementAttributes(By locator,String attrName)
{
	List<WebElement> eleList=getElements(locator);		
    for(WebElement e : eleList)
    {
  	  String attrVal = e.getAttribute(attrName);
  	  System.out.println(attrVal);
    }
}
	public static  List<WebElement> getElements(By locator)
		{
			return driver.findElements(locator);
	}

}