package day37;

import org.testng.annotations.Test;

/*
loginByEmail - sanity & regression
loginByfacebook - sanity
loginBytwitter - sanity

signUpemail - sanity & regression
signUpFacebook - regression
signUptwitter - regression

paymentInRupees - sanity & regression
paymentIndollar - sanity
paymentReturnByBank - regression
 */


public class GroupingDemo 
{
	@Test(priority=1, groups = {"sanity","regression"})
	void loginByEmail() 
	{
		System.out.println("this is login by email");
	}
	
	@Test(priority=2, groups= {"sanity"})
	void loginByfacebook() 
	{
		System.out.println("this is login by email");
	}
	
	@Test(priority=3, groups= {"sanity"})
	void loginBytwitter() 
	{
		System.out.println("this is login by twitter");
	}
	
	@Test(priority=4, groups = {"sanity","regression"})
	void signUpemail() 
	{
		System.out.println("this is sign up by email");
	}
	
	@Test(priority=5, groups= {"regression"})
	void signUpFacebook() 
	{
		System.out.println("this is sign up by facebook");
	}
	
	@Test(priority=6, groups= {"regression"})
	void signUptwitter() 
	{
		System.out.println("this is sign up by twitter");
	}
	
	@Test(priority=7, groups = {"sanity","regression"})
	void paymentInRupees() 
	{
		System.out.println("payment by rupees method");
	}
	
	@Test(priority=8, groups= {"sanity"})
	void paymentIndollar() 
	{
		System.out.println("paymeny by dollar method");
	}
	
	@Test(priority=9, groups= {"regression"})
	void paymentReturnByBank() 
	{
		System.out.println("payment return by bank");
	}
}
