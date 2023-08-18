package SeleniumJava2k23.SeleniumJava2k23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class RegPageTest {
	public static void main(String[] args) {
String browserName="chrome";
BrowserUtil brUtil=new BrowserUtil();
WebDriver driver=brUtil.initDriver(browserName);
brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
String title=brUtil.getPageTitle();
System.out.println(title);
//by locator
By firstName=By.id("input-firstname");
By lastName=By.id("input-lastname");
By email=By.id("input-email");
By telephone=By.id("input-telephone");
By password=By.id("input-password");
By confirmpassword=By.id("input-confirm");
ElementUtility eleutil=new ElementUtility(driver);
eleutil.doSendKeys(firstName, "Amri");
eleutil.doSendKeys(lastName, "singh");
eleutil.doSendKeys(email, "morey@gmail.com");
eleutil.doSendKeys(password, "kri@123");
eleutil.doSendKeys(confirmpassword, "kri@123");
	}

}
