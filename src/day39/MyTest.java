package day39;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(day39.MyListener.class) //which ones you want to trigger and use for test case, with this we don't need XML file to run the cases, don't use this often
public class MyTest 
{
	@Test(priority=1)
	void test1()
	{
		Assert.assertEquals("A","A");
	}
	
	@Test(priority=2)
	void test2()
	{
		Assert.assertEquals("A","B");
	}
	
	@Test(priority=3,dependsOnMethods= {"test2"})
	void test3()
	{
		Assert.assertEquals("A","A");
	}
}
