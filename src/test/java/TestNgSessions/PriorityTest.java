package TestNgSessions;

import org.testng.annotations.Test;

public class PriorityTest 
{
	@Test(priority=1)
	public void a_test()
	{
		System.out.println("a test");
	}
	@Test(priority=2)
	public void b_test()
	{
		System.out.println("a test");
	}
	@Test(priority=3)
	public void c_test()
	{
		System.out.println("a test");
	}
	@Test(priority=1)
	public void d_test()
	{
		System.out.println("a test");
	}

}
//Always non priority test will run then priority
//