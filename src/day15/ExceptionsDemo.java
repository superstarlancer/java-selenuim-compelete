package day15;

import java.util.Scanner;

public class ExceptionsDemo 
{
	public static void main(String[] args) {
		System.out.println("Program is started...");
		System.out.println("Program is in progress...");
		
		//Arithmetic Exception
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println(100/num);*/
		

		//ArrayIndexOutOfBoundsException
		/*int a[]=new int[5];  //0...4 is a position
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		System.out.println("Enter a position");
		int pos= sc.nextInt();
		
		a[pos]=num;
		System.out.println(a[pos]);*/
		
		
		// Exception
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		sc.next();
		
		
		
		System.out.println("Program is completed");
		System.out.println("Program is exited");
	}
}
