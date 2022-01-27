package day4;

/*
 if a>b && a>c    —> a is largest
if b>a && b>c  —> b is largest
if c>a && c>b —> c is largest
 */

public class LargestOf3NumbersUsingLogicalOperators {

	public static void main(String[] args) {
		int a=300, b=700, c=100;
		
		if(a>b && a>c) 
		{
			System.out.println("a is largest number"+a);
		}
		else if(b>a && b>c) 
		{
			System.out.println("b is largest number"+b);
		}
		else if (c>a && c>b)
		{
			System.out.println("c is largest number"+c);
		}
		else 
		{
			System.out.println("None compare");
		}
		

	}

}
