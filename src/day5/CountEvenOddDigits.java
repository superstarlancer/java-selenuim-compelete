package day5;

public class CountEvenOddDigits {

	public static void main(String[] args) {
		int num=123457;
		int even_count=0;
		int odd_count=0;
		
		while(num>0) 
		{
			int rem= num%10; //this contains the last digit we extract, we will then %2 to determine if it is even/odd and store it in a count variable
			if(rem%2==0) 
			{
				even_count++;
			}
			else 
			{
				odd_count++;
			}
			num=num/10; //this eliminates the last digit so that in next iteration it evaluates 123
			
		}
		System.out.println("Number of Even numbers:\s"+even_count);
		System.out.println("Number of Odd numbers:\s"+odd_count);

	}

}
