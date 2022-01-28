package day5;

public class WhileVsDoWhile {

	public static void main(String[] args) {
		
		/*int i =10;
		
		while(i<=5) //first checks the condition true or false, if false stmts never execute
		{
			
		System.out.println(i);
		i++;
		}*/
		
		
		int i=10;
		
		do 
		{
			System.out.println(i);
			i++;
		}while(i<=5); //statement not true, however the statement will execute at least once
		
		

	}

}
