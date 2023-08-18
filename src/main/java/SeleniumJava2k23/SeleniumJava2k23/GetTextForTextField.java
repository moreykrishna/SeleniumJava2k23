package SeleniumJava2k23.SeleniumJava2k23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetTextForTextField {
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement fn=driver.findElement(By.id("input-firstname"));
		fn.sendKeys("krisjms");
		//fn.sendKeys(null);throw Illegal Arg Exc
		String name=fn.getAttribute("value");
		//getText not work for enter text
		System.out.println(name);
	}
}
