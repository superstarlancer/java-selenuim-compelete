package day11;


class Parent
{
		
	void display(int a) 
	{
		System.out.println(a);
	}
}
	
class Child1 extends Parent 
{
	void show(int b) 
	{
		System.out.println(b);	
	}
}

class Child2 extends Parent 
{
	void print(int c) 
	{
		System.out.println(c);	
	}
}




public class HierarchyInheritanceDemo {

	public static void main(String[] args)
	{
		/*Child1 c1=new Child1();  //object creation
		c1.display(10); //Parent
		c1.show(20); //child */
		
		Child2 c2=new Child2(); //object creation
		c2.display(100); //Parent
		c2.print(200); //Child

	}

}
