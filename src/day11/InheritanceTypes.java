package day11;

//Single level
	//A extends B 1 Parent, 1 child
	class A
	{
		int a=100;
		
		void display() 
		{
			System.out.println(a);
		}
	}
	
	class B extends A
	{
		int b=200;
		
		void show() 
		{
			System.out.println(b);
		}
	}
	
	//Multi-level
	class c extends B
	{
		int c=300;
		
		void print()
		{
			System.out.println(c);
		}
	}

public class InheritanceTypes {

	
	
	public static void main(String[] args)
	{
		
		/*b bobj= new b();
		bobj.display();  //calling from class A
		bobj.show(); //calling from class B*/
		
		c cobj=new c();
		cobj.display();
		cobj.show();
		cobj.print();
	}

}
