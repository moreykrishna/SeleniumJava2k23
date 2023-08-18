package SeleniumJava2k23.SeleniumJava2k23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SelectDropDownWithXpath12 {
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException
		{
			driver=new ChromeDriver();
			driver.get("https://www.microchip.com/prochiplicensing");
			WebElement design=driver.findElement(By.xpath("//label[text()='when is your design planned for production?']/preceding-sibling::select"));
			Select select= new Select(design);
			select.selectByVisibleText("2023");
	}
}
