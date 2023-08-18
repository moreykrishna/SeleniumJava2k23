package SeleniumJava2k23.SeleniumJava2k23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MoveToElementConcept {
	public static void main(String[] args)
	{
	WebDriver driver=new ChromeDriver();
	driver.get("http://mrbool.com/search/?ttxtsearch=how=to-create-menu-with-submenu-using-css-html");
	WebElement menu= driver.findElement(By.cssSelector("a.menulink"));
	Actions act=new Actions(driver);
	act.moveToElement(menu).build().perform();
	driver.findElement(By.linkText("COURSES")).click();
	}
}
