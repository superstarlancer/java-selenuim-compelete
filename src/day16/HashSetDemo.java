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
		myset.remove("Welcome"); //we don't have an index concept, have to specify value
		System.out.println(myset);
		
		//inserting values - not possible
		//myset.add(2,"welcome"); //incorrect, there is no insertion possible, no index value
		
		//retrieve the value from the hashset - not possible
		//hashset.get(); //this method is not avail in hashset so it's incorrect
		
		//reading data from hashset
		for(Object x:myset) 
		{
			System.out.println(x);
		}

	}

}
