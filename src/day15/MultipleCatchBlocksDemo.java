package day15;

import java.util.Scanner;

public class MultipleCatchBlocksDemo {

	public static void main(String[] args) 
	{
		//Arithmetic Exception
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number:");
			int num=sc.nextInt();
			/*try 
			{
			System.out.println(100/num);
			}
			catch(NumberFormatException e)
			{
				System.out.println("you entered an invalid input");
			}
			catch(IndexOutOfBoundsException e)
			{
				System.out.println("you entered an invalid input");
			}
			catch(ArithmeticException e)
			{
				System.out.println("you entered an invalid input");
			}*/
			
			
			try 
			{
			System.out.println(100/num);
			}
			catch(Exception e)
			{
				System.out.println("Invalid input...");
			}
				
			System.out.println("Program is completed");
			System.out.println("Program is exited");

	}

}
