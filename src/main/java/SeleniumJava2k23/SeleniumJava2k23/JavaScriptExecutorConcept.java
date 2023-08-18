package SeleniumJava2k23.SeleniumJava2k23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JavaScriptExecutorConcept 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		JavaScriptUtil jsUtil=new JavaScriptUtil(driver);
		String title = jsUtil.getTitleByJS();
		System.out.println(title);
		jsUtil.generateAlert("this is my js alert .... we are on amazon home page");
		
		
	}

}
