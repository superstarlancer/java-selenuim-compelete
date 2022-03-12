package day7Assignments;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {4,2,1,5,3};
		System.out.println("Array before sorting:\s"+Arrays.toString(a));

		int n=a.length; //we use < a.length because we are starting from 0, when we start from 1 we use <=a.length
		
		for(int i=0; i<n-1;i++) //Number of passes , executes 4 times
		{
			for(int j=0;j<n-1;j++) //Iterations in each pass, executes 5 times
			{
				if(a[j]>a[j+1]) 
				{
					int temp=a[j];
					a[j] = a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("Array after sorting:\s"+Arrays.toString(a));
		
	} 

}
