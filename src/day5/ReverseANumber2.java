package day5;

import java.util.Scanner;

public class ReverseANumber2 {

	public static void main(String[] args) {
		//Using StringBuffer class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:\s");
		
		int num=sc.nextInt();
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		System.out.println("Reverse Number is:\s"+rev);

	}

}
