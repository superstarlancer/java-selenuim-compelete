package day5;

public class JumpingStatements {

	public static void main(String[] args) {
		//It jumps become it comes out and breaks 
		//First check if i<5 if true, then go to 2nd if statement, if true break if not increment by 1
		//as soon as i becomes 3, break is executed and it will not print 3
		for(int i=1; i<=5; i++)
		{
		
			if(i==3)
			{
			break;
			}
		
			System.out.println(i);
		}
		
		
	}

}
