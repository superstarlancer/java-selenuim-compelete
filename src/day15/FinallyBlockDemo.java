package day15;

import java.util.Scanner;

public class FinallyBlockDemo {

	public static void main(String[] args) {
		//ArrayIndexOutOfBoundsException
		int a[]=new int[5]; //loc 0 1 2 3 4
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		int num=sc.nextInt();
		System.out.println("Enter a position");
		int pos=sc.nextInt();
		
		try
		{
			a[pos]=num;
			System.out.println();
		}
		catch(Exception e) 
		{
			System.out.println("Exception ocurred and handled...");
		}
		finally 
		{
			System.out.println("Enterred in to finally block");
		}
			System.out.println("Proram completed");
			System.out.println("Program exited");
		

	}

}
