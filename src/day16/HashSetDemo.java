package day16;

import java.util.HashSet;
import java.util.Set;

/*1)Heterogeneous data is allowed
2)Insertion order NOT preserved, stored in random order (Index not supported)
3)Duplicate elements not allowed
4)Multiple nulls not allowed/only single null is allowed*/

public class HashSetDemo {

	public static void main(String[] args) 
	{
		//declaration
		HashSet myset=new HashSet();
		//Set myset=new HashSet();
		//Set <Integer> myset=new HashSet<Integer>(); //only integers
		
		//add elements in set
		myset.add(100);
		myset.add(10.5);
		myset.add("Welcome");
		myset.add(true);
		myset.add(null);
		myset.add(100); //duplicates not allowed
		myset.add(null); //we added multiple nulls, only will print 1 null 
		 
		System.out.println(myset);
		
		//remove value from set
		
		
		

	}

}
