package day9;

public class ThisKeyword {

	int x,y; //Global variables/ instance variables
	
	void setData(int a, int b)  //Local variables, access within method only
	{
		x=a;
		y=b;
	}
	
	void display() 
	{
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args)
	{
		
		ThisKeyword th= new ThisKeyword(); //object creation
		th.setData(10, 20); //assigning data to the variables
		th.display(); //printing this in the console
	}

}
