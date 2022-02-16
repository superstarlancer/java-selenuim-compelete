package day12.interfaceconcept;

interface Shape 
{
	
	int length=10; //final & static, don't need to specify, they are by default
	int width=10;
	
	void circle(); //abstract method, all methods public by default
	
	default void square() //default method
	{
		System.out.println("I'm a Square default method...");
	}
	
	static void rectangle() //static method
	{
		System.out.println("I'm a Rectangle static method");
	}
	
	
}


public class InterfaceDemo {

	public static void main(String[] args)
	{
		

	}

}
