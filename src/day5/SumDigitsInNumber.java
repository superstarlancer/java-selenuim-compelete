package day5;

public class SumDigitsInNumber {

	public static void main(String[] args) {
		//Extract last digit of number and then eliminate it ffrom num
		int num=123456789;
		int sum=0;
		
		while(num>0) //as soon as num becomes 0 condition becomes false and loop ends
		{
			sum= sum+num%10; //returns last digit, then we need to add to sum variable
			num=num/10;		
		}
		System.out.println("Sum is of Digits in a number is\s"+sum);

	}

}
