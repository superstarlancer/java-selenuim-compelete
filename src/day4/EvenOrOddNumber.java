package day4;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		int number =5;
		
		/*if(number %2==0)
		{
			System.out.println("Even Number");
		}
		else 
		{
			System.out.println("Odd Number");
		} */
		
		//using ternary
		System.out.println(number%2==0 ? "Even Number" : "Odd Number");

	}

}
