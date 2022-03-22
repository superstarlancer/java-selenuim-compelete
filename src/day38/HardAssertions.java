package day38;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions 
{
	@Test
	void test() 
	{
	//Assert.assertTrue(true);
	//Assert.assertTrue(10>5);
	//Assert.assertTrue(5>10);
	
	//Assert.assertFalse(false); //expect false and pass in false
	//Assert.assertFalse(10>5); //expect false, return true, condition will fail
	//Assert.assertFalse(5>10); //expect false, return false, will pass
	
	int a=10;
	int b=20;
	int c=30;
	
	//Assert.assertEquals(a>b, true); //makes test pass if both values equal, (false, true(what you are expecting condition to be)) test fails
	//Assert.assertNotEquals(a>b, true); //makes test pass if both values not equal (false, true (condition to meet)) so test passes because they are not equal
	//Assert.assertEquals(a>b && a>c, false); (false, false, expecting false) passes test
	//Assert.assertEquals(a<b && a<c, true); (true, true, expecting true to be met) passes test
	
	//Assert.fail();
		
	}
}
