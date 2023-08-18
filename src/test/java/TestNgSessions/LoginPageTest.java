package TestNgSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//BS - StartDBConnection
//BT - CreateUser
//BC - lauvhBrowser

//BM -- LoginToApp\
//homepagesearch
//BC -- LauchBrowser

//BM -- LOGINTOAPP
//homepagetitletest
//AM-- LOGOUT

//BM--loginto aP
//HOMEPAGETITLETEST
//AM--logout

//AC -- CLOSEBROWSER
// AT --deleteuser
//AS -- DISCONNECT with DB


public class LoginPageTest
{
	//global pre condition
	//pre condition
	//test cases>> test steps -->act vs exp result -- Assesrtion
	//Post steps
	//post global steps
	//1
	@BeforeSuite
	public void startDBConnection()
	{
		System.out.println("BS-startDBConnection");
	}
	//2
	@BeforeTest
	public void createUser()
	{
		System.out.println("BT - createUser");
	}
	//3
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("BC -- launchBrowser");
	}
	
	//4 7 10
	@BeforeMethod
	public void loginToApp()
	{
		System.out.println("BM -- loginToApp");
	}
	//8
	@Test
	public void homePageTitleTest()
	{
		System.out.println("home page title test");
	}
	//11
	@Test
	public void homePageURLTest()
	{
		System.out.println("home page URL test");
	}
	//5
	@Test
	public void homePageSearchTest()
	{
		System.out.println("home page Search test");
	}
	//6 9
	@AfterMethod
	public void logout()
	{
		System.out.println("AM -- Logout");
	}
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("AM -- closeBrowser");
	}
@AfterTest
public void deleteUser()
{
	System.out.println("AT -- DELETEUSER");
}
@AfterSuite
public void disConnectWithDB()
{
	System.out.println("AS-DissconnectWithDB");
}
	
}
