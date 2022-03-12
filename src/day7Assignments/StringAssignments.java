package day7Assignments;

public class StringAssignments {

	public static void main(String[] args) {
		//1. Write a java program to compare two strings, ignoring case differences.
		String d1="Daniela is smart";
		String d2="DANIEla is SMART";
		
		System.out.println(d1.equalsIgnoreCase(d2)); //true
		
		//2. Write a Java program to concatenate a given string to the end of another string.
		String a1="Welcome to week 3";
		String a2="we'll learn object oriented programming";
		System.out.println(a1+" "+a2);
		System.out.println(a1+" ".concat(a2));
		
		//3. Write a java program to get the length of a given string
		String b1="That's life, like Frank Sinatra says";
		System.out.println(b1.length());
		
		//4. Write a Java program to get a substring of a given string between two specified positions
		String p="yugoslavia";
		System.out.println(p.substring(0,5));
		
		//5. Write a Java program to convert all the characters in a string to uppercase.
		//6. Write a Java program to convert all the characters in a string to lowercase.
		String s="iloverocky";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
				
	} 

}
