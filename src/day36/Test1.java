package day36;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 
{
	@Test(priority=1)
	void test1() 
	{
		Assert.assertEquals(1, 2);
	}
	
	@Test(priority=2)
	void test2() 
	{
		Assert.assertEquals(2, 2);
	}
	
	@Test(priority=3)
	void test3() 
	{
		Assert.assertEquals(3, 3);
	}
	
	
	
	
	
}
