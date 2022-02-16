package day12;

//super keyword refers to immediate parent class
//here the test super file overrides the parent so we need to specify super
public class Animal {
	String color="white";
	
	void eat() 
	{
		System.out.println("eating...");
	}

}

class Dog extends Animal
{
	String color="black";
	
	void displayColor() 
	{
		System.out.println(super.color);
	}
	
	void eat() 
	{
		//System.out.println("eating bread...");
		super.eat(); //parent class method executed
	}
}
