package day15;

public class ThrowDemo {

	public static void main(String[] args)
	{
		void checksum(int num) 
		{
			if(num<1)
			{
				throw new ArithmeticException("Number is negative, cannot calculate square");
			}
			else 
			{
				System.out.println("Square of num is:"+ (num*num));
			}
		}
		
		
		public static void main(String[] args) 
		{
			ThrowDemo td=new ThrowDemo();
			try 
			{
				td.checksum(10);
			}
			catch(Exception e)
			{
				System.out.println("iii");}
			}
			
		}


}
