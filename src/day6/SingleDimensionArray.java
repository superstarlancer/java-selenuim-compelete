package day6;

public class SingleDimensionArray {

	public static void main(String[] args) 
	{
	
		//1)Declare an array
		
		
		//Approach 1
		/*int a[]=new int[5]; //array declaration, specify the size of items in an array
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500; */
		
		//Approach 2
		int a[]={100,200,300,400,500};
		
		//2)Find size of array
		//System.out.println(a.length);
		
		//3)Print single value of an array
		//System.out.println(a[3]); //400
		
		//4)Print all the data in the array, need a loop, specify length of array so 5 items
		//i <=a.length-1 because we have 5 items but the index only goes to 4 so we subtract 5items -1 to get the index number or size of the array 
		//i is the index (every value) , a is the whole array
		
		/*for(int i=0;i<a.length-1;i++) //when it becomes 5, condition becomes false and loop stops
		{
			System.out.println(a[i]);
		}*/
		
		
		
		//Enhanced for loop/for each loop
		for(int x:a) //a represents all array values with one variable
		{
			System.out.println(x);
		}
		
		
		
		

	}

}
