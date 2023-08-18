package SeleniumJava2k23.SeleniumJava2k23;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SVG17
{
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		String svgXpath="//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']";
		List<WebElement> statesList=driver.findElements(By.xpath(svgXpath));
		System.out.println(statesList.size());
		for(WebElement e : statesList)
		{
			String stateName=e.getAttribute("name");
			System.out.println(stateName);
			if(stateName.equals("mariland"))
					{
				e.click();
				break;
						
					}
		}	
	}
}
//svg xpath
//*[localname()='svg']//*[name()='g' and @fill-rule='evenodd']