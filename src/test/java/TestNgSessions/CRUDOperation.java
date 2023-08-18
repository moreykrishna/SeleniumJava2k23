package TestNgSessions;

import org.testng.annotations.Test;

public class CRUDOperation
{
	public void createUser()
	{
		System.out.println("create user");
	}
	public void getUser()
	
	{
		
	}
public void updateUser()
	
	{
		
	}
public void deleteUser()

{
	
}
@Test
public void createUserTest()
{
	createUser();
	
}
@Test
public void getUserTest()
{
	createUser();
	getUser();
}
@Test
public void updateUserTest()
{
	createUser();getUser();deleteUser();
}
//best to use

}
