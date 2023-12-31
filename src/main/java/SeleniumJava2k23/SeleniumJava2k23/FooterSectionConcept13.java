package SeleniumJava2k23.SeleniumJava2k23;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FooterSectionConcept13 
{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		List<String> accList=getFooterSectionList("Information");
		System.out.println(accList);
	}
	public static List<String> getFooterSectionList(String sectionName)
	{
		List<WebElement> secList=
		driver.findElements(By.xpath("//h5[text()='"+sectionName+"']/following-sibling::ul//a"));
		System.out.println(secList.size());
		List<String> secValList=new ArrayList<String>();
		for(WebElement e : secList)
		{
			String text=e.getText();
			secValList.add(text);
		}
		return secValList;
	}
}
