package SeleniumJava2k23.SeleniumJava2k23;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AuthPopUpHandle {
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		String username="admin";
		String password="admin";
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		
		//authPopUp
		//"https://admin:admin@url"
	}

}
