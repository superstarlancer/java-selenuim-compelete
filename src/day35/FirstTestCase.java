package day35;

import org.testng.annotations.Test;

/*Test Case
-----
1)Open application
2)Login
3)Logout
4)Close Application
*/

public class FirstTestCase 
{
	@Test(priority=1) //this is called an annotation
	void openApp() 
	{
		System.out.println("Opening application...");
	}
	@Test(priority=2)
	void login() 
	{
		System.out.println(" Login");
	}
	@Test(priority=3)
	void logout() 
	{
		System.out.println("Logout");
	}
	@Test(priority=4)
	void closeApp() 
	{
		System.out.println("Closing application....");
	}
	
	
}
