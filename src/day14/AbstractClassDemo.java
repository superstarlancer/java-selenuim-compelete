package day14;



abstract class Animal
{
	abstract void eat(); //abstract method/un-implemented
	
	void run() //non-abstract/normal/default method
	{
		System.out.println("Runs fast...");
	}
	
	void run() //non-abstract/normal/default method
	{
		System.out.println("Runs fast...");
	}
	
	static void sleep()  //static method
	{
		System.out.println("sleeps...");
	}
	
	Animal() //constructor w/name as same as class
	{
		System.out.println("this is constructor...");
	}
	
}

class Horse extends Animal 
{
	void eat() 
	{
		System.out.println("Eating grass");
	}
}





public class AbstractClassDemo {

	public static void main(String[] args)
	{
		//Animal obj=new Animal(); //not correct we cannot instantiate abstract class

		//Animal obj=new Horse(); //parent abstract variable can hold child class 
		
		Horse obj=new Horse();
		
		obj.eat(); //abstract
		obj.run(); //non static/default/abstract
		Animal.sleep(); //invoke static method by using class method
	}

}
