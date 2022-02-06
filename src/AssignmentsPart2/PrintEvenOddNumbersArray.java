package AssignmentsPart2;

public class PrintEvenOddNumbersArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		
		//How many times do we repeat array? Depends on number of values
		//Extracting even numbers
		/*System.out.println("Even numbers in array.......");
		for(int i=0;i<a.length;i++) //a.length = 6 loop repeats 5 times
		{
			if(a[i]%2 ==0) 
			{
				System.out.println(a[i]);
			}	
		}
		
		System.out.println("Odd numbers in array.......");
		for(int i=0;i<a.length;i++) //a.length = 6 loop repeats 5 times
		{
			if(a[i]%2 !=0) 
			{
				System.out.println(a[i]);
			}	
		}*/
		
		
		
		//Enhanced for loop
		System.out.println("Even Numbers in an array.....");
		for(int even:a)
		{
			if(even%2==0) 
			{
				System.out.println(even);
			}
		}

		
		System.out.println("Odd Numbers in an array.....");
		for(int odd:a)
		{
			if(odd%2!=0) 
			{
				System.out.println(odd);
			}
		}
		
		
		
		
	}

}
