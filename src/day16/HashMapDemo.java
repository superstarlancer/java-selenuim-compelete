package day16;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		//declaration
		//HashMap hm=new HashMap();
		HashMap <Integer, String> hm=new HashMap<Integer, String>();
		
		//Map hm=new HashMap(); //Map is a parent interface of HashMap
		
		
		//adding data into hashmap
		
		hm.put(101,"John"); //key is the first value in (key,value)
		hm.put(102,"David");
		hm.put(103,"Smith");
		hm.put(104,"Mary");
		hm.put(105,"John");
		hm.put(101,"xyz");  //duplicate key is not allowed
		
		System.out.println(hm); //{101=xyz, 102=David, 103=Smith, 104=Mary, 105=John}
		
		//find out size
		System.out.println(hm.size());
		
		//remove pair
		hm.remove(101); //101 is key, cannot pass value, only key
		System.out.println(hm); //print HashMap again
		
		//get the value from specific key
		//104 is key, "Mary"
		System.out.println(hm.get(104));
		
		//print keys only from hash
		System.out.println(hm.keySet()); //get all keys from hashmap [102, 103, 104, 105]
		
		//print values only from hash
		//method not avail, need to use a loop
		for(Object k:hm.keySet()) 
		{
			System.out.println(hm.get(k));  //prints values
		}
		
		for(Object k:hm.keySet()) 
		{
			System.out.println(k+"      "+hm.get(k));  //prints values
		}
		
		//clear all
		hm.clear();
		System.out.println(hm); //prints {}
	}

}
