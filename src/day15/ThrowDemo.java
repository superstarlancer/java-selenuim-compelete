package day15;

public class ThrowDemo {

	void checksum(int num)
	{
		if(num<1)
		{
			throw new ArithmeticException("Number is negitive, cannot calculate square..");
		}
		else
		{
			System.out.println("Squre of num is:"+ (num*num));
		}
	}
	
	
	
	public static void main(String[] args) 
	{
	
		ThrowDemo td=new ThrowDemo();
		try
		{
		td.checksum(0); // invalid input
		}
		catch(Exception e)
		{
			System.out.println("invalid input provided...");
		}
	
		}
	}
