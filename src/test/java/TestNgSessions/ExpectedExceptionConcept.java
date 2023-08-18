package TestNgSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept 
{
	@Test(expectedExceptions=NullPointerException.class)
	public void loginTest()
	{
		System.out.println("login Test");
		int i=9/0;
	}

}
