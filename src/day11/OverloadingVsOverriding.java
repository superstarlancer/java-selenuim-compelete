package day11;


class ABC 
{
	void m1(int a) 
	{
		System.out.println(a);
	}
	
	void m2(int b) 
	{
		System.out.println(b);
	}
}




class XYZ extends ABC 
{
	void m1(int a) //overriding methods
	{
		System.out.println(a*a);
	}
	
	void m2(int a, int b) //overloading methods
	{
		System.out.println(a+b);
	}

}



public class OverloadingVsOverriding {

	public static void main(String[] args)
	{
		//class name = XYZ ob = object name
		XYZ ob=new XYZ();
		
		ob.m1(10); //100 1st method
		ob.m2(100); //100 //can use method from parent or child
		ob.m2(10,20); //30 //can use method from parent or child

	}

}
