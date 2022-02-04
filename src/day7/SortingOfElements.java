package day7;

import java.util.Arrays;

public class SortingOfElements {

	public static void main(String[] args) {
		int a[]= {30,10,50,40,20};
		
		/*for(int i=0; i<a.length;i++) 
		{
			System.out.println(a[i]);
		}*/
		
		
		
		//Single command will print into a list Arrays is a class toString is a method
		System.out.println("Before sorting:"+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After sorting:"+Arrays.toString(a));
	}

}
