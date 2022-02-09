package day9;

public class ConstructorDemo {
	
	int x,y;
	String s;
	
	//Default Constructor don't really use this, doesn't take parameters
	ConstructorDemo()
	{
		System.out.println("Default constructor is executed...");
	}
	
	//Parameterized assigns data into the variable, takes three arguments
	ConstructorDemo(int a, int b, String str)
	{
		x=a;
		y=b;
		s=str;
	}
	
	void display()
	{
	
	System.out.println(x+"  "+y+"  "+s);
	}


	public static void main(String[] args) 
	{
		//ConstructorDemo cd=new ConstructorDemo();
		
		//Java prints Default constructor is executed...
		//because we didn't pass any arguments into the parameterized
		
		
		//Now we pass in the arguments
		ConstructorDemo cd=new ConstructorDemo(100,200,"Welcome");
		cd.display(); //we need to call methods explicitly through display() method
	
	}

}
