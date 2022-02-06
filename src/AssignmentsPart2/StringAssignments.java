package AssignmentsPart2;

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
	}

}
