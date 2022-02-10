package day10;

public class StaticExample {
	
	
	
	static int a=10; //static
	int b=20; //non-static
	
	static void m1() 
	{
		System.out.println("this is a m1 static method");
	}
	
	void m2() 
	{
		System.out.println("this is an m2 non-static method");
	}	
	
	
	
	
	
	

	public static void main(String[] args) {

		System.out.println(a); //can access directly because it is a static variable
		m1(); //static variable
		
		//System.out.println(b); //incorrect, b is non-static, cannot access it directly
		//m2(); //non-static method, cannot access it directly
		
		StaticExample se=new StaticExample(); //this is how we create an object
		System.out.println(se.b);
		se.m2();
		
	}

}
