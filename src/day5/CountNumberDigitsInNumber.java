package day5;

public class CountNumberDigitsInNumber {

	public static void main(String[] args) {
		//num will be divided by 10 and that eliminates the last digit of the number then stores the new number in the num variable
		//count then counts the number of iterations the loop is doing it and stores it in the count variable, then after loop is done it prints count
		int num=987654321;
		int count=0;
		
		while(num>0) 
		{
			num=num/10;
			count++;
		}
		System.out.println("Number of Digits:" +count);
		
	}

}
