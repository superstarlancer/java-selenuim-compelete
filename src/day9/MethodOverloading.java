package day9;

public class MethodOverloading {

	
	int x,y,z;
	double d;
	
	void sum() //1
	{
		x=10;
		y=20;
		System.out.println(x+y);
	}	
	
	void sum(int a, int b) //2
	{
		x=a;
		y=b;
		System.out.println(x+y);
	}
	

	
	void sum(int a, double b) //3
	{
		x=a;
		d=b;
		System.out.println(x+d);
	}
	
	void sum(int a, int b, double c) //4
	{
		x=a;
		y=b;
		d=c;
		System.out.println(x+d);
	}
	
	
	
	
	public static void main(String[] args) 
	{
		MethodOverloading mo = new MethodOverloading();
		//mo.sum(); //not passing arguments, java executes one with variables, method 1//
		//mo.sum(100, 200); //java checks method with 2 arguments, method 2//
		//mo.sum(10, 20, 10.5); //4
		//mo.sum(10, 10.5); //3
		
		//can also print all methods at same time
	}

}
