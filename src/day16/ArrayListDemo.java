package day16;

import java.util.ArrayList;

//ArrayList is a class which is implemented in List interface
//
//1)Heterogeneous data is allowed
//
//2)Insertion order —> preserved (Index)
//
//3)Duplicate elements- allowed
//
//4)Multiple nulls - allowed

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		//declaration
		ArrayList mylist=new ArrayList();
		//List mylist=new ArrayList();
		
		//ArrayList <Integer> mylist=new ArrayList<Integer>(); //only integers are allowed
		//ArrayList <String> mylist=new ArrayList<String>();
		
		//Add data elements into arraylist
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("Welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		//size of arraylist
		System.out.println(mylist.size());
		
		//display values from arraylist - insertion order preserved [100, 10.5, Welcome, A, true, 100, null, null]

		System.out.println(mylist);
		
		//remove values form arraylist
		mylist.remove(5); //here 5 is index of 100
		System.out.println("After removing element:" +mylist); //must print list again
		
		
		//inserting value in the middle of the list
		mylist.add(3,"java");
		System.out.println("After adding element:" +mylist); //add(index,value)
	}

}
