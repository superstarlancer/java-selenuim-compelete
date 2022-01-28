package day5;

public class ForLoopDemo {

	public static void main(String[] args) {
		//Print 1...10 using For Loop
		
		/*for(int i=1; i<=10; ++i)
		{
			System.out.println(i);
		}*/
		
		
		
		
		
		//Even Numbers between 1...10
		//i=i+2 use shorthande operator, shortcut way i+=2
		/*for(int i=2;i<=10;i+=2)
		{
			System.out.println(i);
		}*/
		
		
		
		/*for(int i=1;i<=10;i++) 
		{
			if(i%2==0) //if condition true only print this value if false don't print stmt and increment the value by 1
			System.out.println(i);
		}*/
		
		
		
		
		
		//Odd Numbers
		
		/*for(int i=1;i<=10;++i) 
		{
			if(i%2!=0) //if condition true only print this value if false don't print stmt and increment the value by 1
			System.out.println(i);
		}*/
		
		
		//Descending 10 9 8 7 6 5 4 3 2 1 
		
		//initialization, if true print, then decrement
		for(int i=10; i>0; --i) 
		{
			System.out.println(i);
		}
			
		
		
	}

}
