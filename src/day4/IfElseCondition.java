package day4;

public class IfElseCondition {

	public static void main(String[] args) {
		int person_age =15;
		
		/*if(person_age>=18) 
		{
		System.out.println("Eligible to vote");	
		}
		else 
		{
			System.out.println("Not Eligible to vote");
		}
		System.out.println("Program is finished"); */
		
		//Using Ternary Operator
		System.out.println(person_age>=18 ? "Eligible for vote" : "Not eligible for vote");

	}

}
