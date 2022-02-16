package day12;

public class FinalVariableDemo 
{

	int speed=100;
	
	public static void main(String[] args) 
	{
		FinalVariableDemo fm=new FinalVariableDemo();
		fm.speed=200;
		
		System.out.println(fm.speed);

	}

}
