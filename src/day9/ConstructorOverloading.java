package day9;

public class ConstructorOverloading {

	int x,y,z;
	double d;
	
	ConstructorOverloading() //1
	{
		x=10;
		y=20;
		System.out.println(x+y);
		
	}
	
	ConstructorOverloading(int a, int b) //2
	{
		x=a;
		y=b;
		System.out.println(x+y);
		
	}
	
	ConstructorOverloading(int a, int b, double dec) //3
	{
		x=a;
		y=b;
		d=dec;
		System.out.println(x+y+d);
		
	}
	
	public static void main(String[] args) 
	{
		
		//Can't invoke all constructors
		//Constructor overloading is invoked at time of object creation
		//ConstructorOverloading co=new ConstructorOverloading(); //1
		//ConstructorOverloading co=new ConstructorOverloading(100,200); //2
		ConstructorOverloading co=new ConstructorOverloading(100,200,15.5); //3
	}

}
