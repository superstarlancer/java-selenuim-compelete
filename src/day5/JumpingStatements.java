package day5;

public class JumpingStatements {

	public static void main(String[] args) {
		//Jump Statement
		//It jumps become it comes out and breaks 
		//First check if i<5 if true, then go to 2nd if statement, if true break if not increment by 1
		//as soon as i becomes 3, break is executed and it will not print 3
		/*for(int i=1; i<=5; i++)
		{
			if(i==3)
			{
			break;
			}
		
			System.out.println(i);
		}*/
		
		
		//Continue Statement
		//3 gets skipped because it doesn't tell it to print when i==3
		/*for(int i=1; i<=5; i++)
		{
			if(i==3)
			{
			continue;
			}
		
			System.out.println(i);
		}*/
		
		
		
		
		
		//skip either 5,10,15 and print 1-20
		//can't use && operator returns true if ALL conditions are true, there is no scenario where i is 5 10 and 15 at the SAME time
		for(int i=1; i<=20; i++)
		{
			if(i==5 || i==10 || i==15)
			{
			continue;
			}
		
			System.out.println(i);
		}
		
		
		
	}

}
