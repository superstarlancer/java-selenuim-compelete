package day10;

public class StaticMain 
{
	public static void main(String[] args) {

		System.out.println(StaticExample.a); //can access directly because it is a static variable
		StaticExample.m1(); //static variable
		
		//need to specify what the name class is if you put these static variables in a main method with a different name StaticMain
		
		
		
		//System.out.println(b); //incorrect, b is non-static, cannot access it directly
		//m2(); //non-static method, cannot access it directly
		
		StaticExample se=new StaticExample(); //this is how we create an object
		System.out.println(se.b);
		se.m2();
		
		se.m();
		
	}

}
