package SeleniumJava2k23.SeleniumJava2k23;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopupHandle {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://cgi-lib.bereley.edu/ex/fup.html");
		driver.findElement(By.name("upfile")).sendKeys("/users/naveenautomationlabs/Downloads/AgileDecOps.jpeg");
		//<tag type="file">--this is mandatory attribute
		//autoIT/Sikuli-not recommended support only window if you want to run other thean its difficult
		// TODO Auto-generated method stub

	}

}
