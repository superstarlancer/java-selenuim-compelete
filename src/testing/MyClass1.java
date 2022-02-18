package testing;

import java.util.Scanner; //built-in

import testing.pack1.Sample;

public class MyClass1 
{
	public static void main(String[] args) {
	
		Sample s=new Sample();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int z=sc.nextInt();
		System.out.println(z);
	}
}
