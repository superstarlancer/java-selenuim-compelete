package day9;

public class ThisKeyword {

	int x,y; //Global variables/ instance variables
	
	void setData(int x, int y)  //Local variables, access within method only
	{
		this.x=x; //refers to the class, x belongs to class
		this.y=y; //representing the class, y belongs to class, if not method will be confused on what x y variables belong to class or method
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
