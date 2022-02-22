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
		
		System.out.println(hm);
	}

}
