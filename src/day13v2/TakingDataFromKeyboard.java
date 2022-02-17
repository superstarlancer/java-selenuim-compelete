package day13v2;

import java.util.Scanner;

public class TakingDataFromKeyboard {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		/*System.out.println("Enter a number:");
		int x=sc.nextInt(); //nextInt() only for integers without decimals
		System.out.println(x+10);*/
		
		/*System.out.println("Enter a decimal number:");
		double d=sc.nextDouble();
		System.out.println(d);*/
		
		/*System.out.println("Enter a string value:");
		String s=sc.next();
		System.out.println(s.length());*/
		
		//Taking multiple inputs
			/*System.out.println("Enter first number");
			int x=sc.nextInt();
			
			System.out.println("Enter a second number:");
			int y=sc.nextInt();
			
			System.out.println("Enter a third number");
			int z=sc.nextInt();
			System.out.println("Sum of three numbers is:\s"+(x+y+z));*/
		
		//Taking input into an array
			/*int a[]=new int[5];
			
			System.out.println("Enter first value");
			a[0]=sc.nextInt();
			
			System.out.println("Enter second value");
			a[1]=sc.nextInt();
			
			System.out.println("Enter third value");
			a[2]=sc.nextInt();
			
			System.out.println("Enter fourth value");
			a[3]=sc.nextInt();
			
			System.out.println("Enter fifth value");
			a[4]=sc.nextInt();*/
		
		
		
		//Taking many values into array by using looping statement
		
		int a[]=new int[10];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter Value");
			a[i]=sc.nextInt();
		} 
		 //here we print the values into an array
		for(int x:a) 
		{
			System.out.println(x);
		}

	}

}
