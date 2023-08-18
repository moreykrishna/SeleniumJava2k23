package SeleniumJava2k23.SeleniumJava2k23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementAttributeConcept {
       static WebDriver driver;
	public static void main(String[] args) 
	{
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		String ph=driver.findElement(By.name("firstname")).getAttribute("placeholder");
//		System.out.println(ph);
//		String srcVal=driver.findElement(By.className("ing-responsive")).getAttribute("src");
//		String TitleVal=driver.findElement(By.className("ing-responsive")).getAttribute("title");
//		System.out.println(srcVal + " "+ TitleVal);
		
		By fname=By.name("firstname");
		By classNmae=By.className("ing-responsive");
		//String ph=getElementAttribute(classNmae, "placeholder");
		String src=getElementAttribute(fname, "src");
		//System.out.println(ph);
		System.out.println(src);
	}
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	public static String getElementAttribute(By locator,String attrName)
	{
		return getElement(locator).getAttribute(attrName);
	}
}
