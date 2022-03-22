package day38;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions 
{
	/*@Test
	void test_hardassertion()
	{
		Assert.assertEquals(1, 2);
		System.out.println("Hard assertion is executed.....");
	}*/
	
	@Test
	void test_softassertion()
	{
		SoftAssert sa=new SoftAssert(); //create an object first of SoftAssert and import
		sa.assertEquals(1,1);
		System.out.println("softassertion is executed.....");
		
		sa.assertAll(); //have to add to get accurate result of session despite all actions executing
	}
}
