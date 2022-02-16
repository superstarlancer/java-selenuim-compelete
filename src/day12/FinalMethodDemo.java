package day12;


class Temp  //apply final keyword in beginning, cannot override class
{

	void m1() //apply final keyword in beginning, cannot override method
	{
		System.out.println("this is m1...");
	}
	
		
}

class TempChild extends Temp  //incorrect bc Temp is final class, we cannot extend when add final keywords in method and class
{
	void m1() 
		{
		System.out.println("this is overrided method from Temp....");
		}

}


public class FinalMethodDemo {

	public static void main(String[] args) {
	

	}

}
