package day3;

public class IncrementOperator 
{

	public static void main(String[] args) 
	{
		// ++ increment operator
		
		int a=10;
		
		//a=a+1;
		//a++; //post increment 11
		//++a; //pre-increment 11
		//System.out.println(a); //11
		
		
		//scenario 2
		//int res=a++; //post increment 10 //assignment happens first then incrementation 10
		int res=++a; //pre increment   11 //first increases value of a then assignment happens
		System.out.println(res); //10
		System.out.println(a);
		
	}
	
}
