package day5;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string:\s");
		String str=sc.next(); //sc object and next method will get string from user and store in str variable
		String org_str=str;
		
		String rev ="";
		
		int len=str.length();
		for(int i=len-1;i>=0;i--) 
		{
			rev=rev+str.charAt(i);
		}
		// ^ we print the reverse of the string
		
		//Here we evaluate if it is a palindrome
		
		if(org_str.equals(rev))
		{
			System.out.println(org_str+"\sString is a Palindrome");
		}
		else
		{
			System.out.println(org_str+"\sString is not a Palindrome");
		}
		
		

	}

}
