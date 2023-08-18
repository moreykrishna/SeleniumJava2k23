package SeleniumJava2k23.SeleniumJava2k23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alert {
WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//no alert prsnt exception
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(4000);
		//Alert Pop Op
		org.openqa.selenium.Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		alert.accept();
		//alert.dismiss();
		
		//Confirm Pop Op
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Thread.sleep(4000);
//		//Alert Pop Op
//		org.openqa.selenium.Alert alert=driver.switchTo().alert();
//		String text=alert.getText();
//		System.out.println(text);
//		alert.accept(); click on ok
//		alert.dismiss();click on cancel
		
		//promt
		driver.findElement(By.xpath("//button[text()='Click for JS promt']")).click();
	Thread.sleep(4000);
	
		org.openqa.selenium.Alert alert1=driver.switchTo().alert();
		alert1.sendKeys("naveen");
		
		alert1.accept(); //click on ok
		alert1.dismiss();//click on cancel
		
		//practce go to mail.rediff.com without username and click on sign in
		
	}
}
