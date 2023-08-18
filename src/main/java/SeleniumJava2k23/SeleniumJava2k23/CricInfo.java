package SeleniumJava2k23.SeleniumJava2k23;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CricInfo 
{
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException
		{
			driver=new ChromeDriver();
			driver.get("http://www.espncricinfo.com");
			String wkName=getWicketTakerName("Will Jacks");
			System.out.println(wkName);	
			List<String> willJKScoreList=getScoreCardList("Will Jacks");
	}
		public static String getWicketTakerName(String batsmanName)
		{
			return driver.findElement(By.xpath("//span[text()='"+batsmanName+"']/ancestor::td/following-sibling::td//span/span")).getText();
		}
		public static List<String> getScoreCardList(String PlayerNmae)
		{
			List<WebElement> scoreList=
					driver.findElements(By.xpath("//span[text()='"+PlayerNmae+"')/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
					List<String> playerScoreList=new ArrayList<String>();
			for(WebElement e: scoreList)
			{
				String text=e.getText();
				playerScoreList.add(text);
			}
			return playerScoreList;
		}
}
