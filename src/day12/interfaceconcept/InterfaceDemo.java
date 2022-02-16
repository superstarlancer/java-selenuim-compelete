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


public class InterfaceDemo implements Shape
{

	public void circle()
	{
		System.out.println("This is a Circle abstract method");
	}
	
	public static void main(String[] args)
	{
		//Shape s=new Shape(); //incorrect, bc we cannot instantitate interface, cannot create memory location
		Shape s=new InterfaceDemo(); //correct, whichever class is
		//InterfaceDemo s=new InterfaceDemo(); //correct
		s.circle();
		s.square();
		Shape.rectangle(); //don't need object to access rectangle, bc it is static

		System.out.println(Shape.length); //can access, static
		System.out.println(Shape.width); //can access, static
	}

}
