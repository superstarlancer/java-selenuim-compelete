package day15;

public class CheckedExceptionsDemo {

	public static void main(String[] args) 
	{
		System.out.println("Program is started...");
		System.out.println("Program is progress...");
		
		Thread.sleep(5000); //not a syntax error, may throw exception
		
		System.out.println("Program is completed...");
		System.out.println("Program exited...");

	}

}
