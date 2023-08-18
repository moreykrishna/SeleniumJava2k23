package SeleniumJava2k23.SeleniumJava2k23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DragAndDropConcept {
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement srcFile=driver.findElement(By.id("draggable"));
		WebElement targetEle=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.clickAndHold(srcFile).moveToElement(targetEle).release().perform();
		act.dragAndDrop(srcFile,targetEle).build().perform();
	}
}
