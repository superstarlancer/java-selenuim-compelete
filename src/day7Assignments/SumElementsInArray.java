package day7Assignments;

public class SumElementsInArray {

	public static void main(String[] args) {
		int a[]= {5,2,7,9,6}; //5 elements  n-1=4 if don't know how many items in array use i<=a.length-1 or 5-1=4
		int sum=0;
		
		/*for(int i=0;i<=a.length-1;i++) //as soon as i becomes 4, stop loop a.length=5 items
		{ 
			sum= sum+a[i]; //5
		}*/
		
		
		//Enhanced for loop: don't initialize variable, condition, and incrementation
		
		for(int value:a) 
		{
			sum=sum+value;
		}
		
		System.out.println("Sum of Array elements:\s"+sum);
		
	}
 
}
