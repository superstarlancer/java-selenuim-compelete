package day5;

public class WhileloopDemo {

	public static void main(String[] args) 
	{
	//Example1: Print 1....10 numbers i is the incrementation value
		
//	int i =1; //initialization
//	
//	while(i<=10) //condition
//	{
//		System.out.println(i);
//		i++; //incrementation because if we don't i value remains the same
//	}
	
	
	//Example3: Print even numbers between 1...10 (2,4,6,8,10)
//	int i =2;
//	
//	while(i<=10)
//	{
//		System.out.println(i);
//		i=i+2;
//	}

	int i=2;
	while(i<=10) 
	{
		if(i%2==0) 
		{
			System.out.println(i);	
		}
		i++;
		
	}
	
	

	}

}
