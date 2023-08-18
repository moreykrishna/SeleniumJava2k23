package SeleniumJava2k23.SeleniumJava2k23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitvsClose {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();//it will give invalid session id
		driver.getTitle();
		driver.quit();//it will give session id is null
		driver.getTitle();

	}
}
