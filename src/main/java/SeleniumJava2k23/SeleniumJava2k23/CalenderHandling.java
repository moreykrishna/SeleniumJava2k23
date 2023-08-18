package SeleniumJava2k23.SeleniumJava2k23;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CalenderHandling 
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		//selectCalendarDate("14");
		selectFutureDate("March 2023", "32");
	
		//String actMonthYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		//System.out.println(actMonthYear);
		//while(!actMonthYear.equalsIgnoreCase("march 2025"))
//		{
//			//click on next icon
//			driver.findElement(By.xpath("//span[text()='Next'")).click();
//		actMonthYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
//		System.out.println(actMonthYear);
//	}
		//selectDate("23");
		//selectCalendarDate("14");
	}
	
	
	public static void selectFutureDate(String expMonthYear,String day)
	{
		if(expMonthYear.contains("Fabruary")&& Integer.parseInt(day)>29)
		{
			System.out.println("wrong day/date passed...please pass the right day/date for feb month..."+ day);
		}
		if(Integer.parseInt(day)>31)
		{
			System.out.println("wrong day/date passed... plz pass the right day/date.."+ day);
			return;
		}
		String actMonthYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(actMonthYear);
		while(!actMonthYear.equalsIgnoreCase(expMonthYear))
		{
			//click on next icon
			driver.findElement(By.xpath("//span[text()='Next'")).click();
		actMonthYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(actMonthYear);
	}
		selectDate(day);
		//selectCalendarDate(
	}
	//12Months
	//1 feb
	//6(31)+5(30)
	public static void selectCalendarDate(String day)
	{
		List<WebElement> dayList=
		driver.findElements(By.cssSelector("table.ui-datepicker-calendar a"));
		System.out.println(dayList.size());
		for(WebElement e: dayList)
		{
			String text=e.getText();
			if(text.equals(day))
			{
				e.click();
				break;
			}
		}
	}
	public static void selectDate(String day)
	{
		driver.findElement(By.xpath("//a[text()='"+day+"')")).click();
	}
}
//div.DayPicker-Month div.DayPicker-Day--disabled:not(.DayPicker-Day--outside)--15
//div.DayPicker-Day--selected - current date
//div.DayPicker-Day:not(.DayPicker-Day--outside) --dates from the months
//div.DayPicker-Day:not(.DayPicker-Day--outside):not(.DayPicker-Day--disabled)--only enabled dates from both the months
//div.DayPicker-Month div.