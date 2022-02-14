package day11;


//Hierarchy Inheritance, whatever method we create in parent we can override in child by extending the class
class Bank 
{	
	 double roi() 
	 {
		 return 0;
	 }
}

class ICICI extends Bank 
{
	 double roi() 
	 {
		 return 10.5; //verriding roi method
	 }
}

class SBI extends Bank 
{
	 double roi() 
	 {
		 return 9.5; //overriding roi method
	 }	
} 


public class OverridingDemo {

	public static void main(String[] args)
	{
		ICICI ic=new ICICI();
		System.out.println(ic.roi()); //10.5
		
		SBI sb=new SBI();
		System.out.println(sb.roi()); //9.5
 
	}

}
