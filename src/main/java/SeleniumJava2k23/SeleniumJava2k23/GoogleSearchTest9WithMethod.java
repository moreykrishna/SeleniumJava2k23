package SeleniumJava2k23.SeleniumJava2k23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest9WithMethod
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Naveen automation Labs");
		Thread.sleep(5000);
		By googleSuggListLocator=By.xpath("//div[@class='wM6W7d']/span");
		doSearch(googleSuggListLocator,"naveen automation labs github");
		
		}
	public static void doSearch(By suggListLocator,String suggName)
	{
	List<WebElement> langLinks=driver.findElements(suggListLocator);
	
	System.out.println(langLinks.size());
	for(WebElement e : langLinks)
	{
		String text=e.getText();
		System.out.println(text);
		if(text.contains("naveen automation labs github"))
		{
			e.click();
			break;
		}
	}

	}}
