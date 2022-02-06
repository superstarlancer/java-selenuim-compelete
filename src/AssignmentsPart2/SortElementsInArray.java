package AssignmentsPart2;

import java.util.Arrays;
import java.util.Collections;

public class SortElementsInArray {

	public static void main(String[] args) {
		
		//Approach 1 using Arrays.parallelSort Arrays.toString method prints array elements in form of a string
		int a[]= {30,50,20,10};
		System.out.println("Array elements before sorting:\s"+Arrays.toString(a));
		
		Arrays.parallelSort(a);
		System.out.println("Array elements after sorting\s"+Arrays.toString(a));
		
		
		//Approach 2 using sort method
		int b[]= {60,30,40,100,10,15};
		System.out.println("Array elements before sorting:\s"+Arrays.toString(b));
		
		Arrays.sort(b);
		System.out.println("Array elements after sorting\s"+Arrays.toString(b));
		
		//Sort in descending order using sort() method
		//Collections.reverseOrder() method does not support primitive data types
		Integer c[]= {60,30,40,100,10,15};
		System.out.println("Array elements before sorting:\s"+Arrays.toString(c));
		
		Arrays.sort(c,Collections.reverseOrder());
		System.out.println("Array elements after sorting\s"+Arrays.toString(c));
		
	}

}
