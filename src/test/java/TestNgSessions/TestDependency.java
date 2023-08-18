package TestNgSessions;

import org.testng.annotations.Test;

public class TestDependency 
{
	@Test
	public void searchTest()
	{
		System.out.println("search test");
		int i =9/0;
	}
	@Test(dependsOnMethods="searchTest")
	public void addToCart()
	{
		System.out.println("add to cart test");
		int i =9/0;
	}
	@Test(dependsOnMethods="addToCart")
	public void makePayment()
	{
		System.out.println("make payment test");
		int i =9/0;
	}

}
