package day9;
//different ways to create a method
public class Calculator 
{
	int x=10, y=20;
	
	//1)No Params No return value
	/*void add() 
	{
		System.out.println(x+y);
	}*/
	
	
	
	//2)No Params Return value
	//have to capture output in some other variable in main
	//when you return something must store in variable and print that variable out
	/*int add() 
	{
		return (x+y);
	}*/
	
	//3)Take params No Return
	/*void add(int a, int b)
	{
		System.out.println(a+b);
	}*/
	
	//4)Take params Return a value
	int add(int a, int b) 
	{
		return(a+b);
	}
}
