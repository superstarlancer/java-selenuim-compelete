package day15;

public class CheckedExceptionsDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Program is started...");
		System.out.println("Program is progress...");
		
		//Thread.sleep(5000); //can't execute, this is an exception, can surround with try catch
		
		/*try 
		{
			Thread.sleep(5000);
		} 
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		} */
		
		
		Thread.sleep(5000); //throws InterruptedExcception at the method level
		
		
		
		System.out.println("Program is completed...");
		System.out.println("Program exited...");

	}

}
