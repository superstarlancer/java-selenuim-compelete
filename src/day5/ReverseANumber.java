package day5;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:\s");
		
		int num=sc.nextInt(); //1234
		//1. Using algorithm to reverse a number
		//Using the power of multiplying by 10 to leverage a reversal
		
		int rev=0;
		
		while(num!=0) //check if num not equal to 0
		{
			rev=rev*10 + num%10; //rev value is 0 so 0*10 + 1234%10 --> returns last digit --> rev =4
			num=num/10; //num becomes 123
		}
		
		System.out.println("Reverse Number is:\s"+ rev);
	}

	//rev steps 0+1234%10=4   40+3=43  430+2=432 4320+1=4321
	//num ste[s 1234/10=123   123/10=12  12/10=1 1/10=0
}
