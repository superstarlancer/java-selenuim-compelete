package day7;

public class StringMethods {

	public static void main(String[] args) {
		//Frequently used string methods in automation
		
		String s="welcome";
		System.out.println(s);
		
		
		//length() method returns the length of the string
		//must store in a variable
		int len =s.length();
		System.out.println(len);
		
		//OR
		
		System.out.println(s.length());
		
		//concat() method combines elements
		System.out.println(1+2); //3
		System.out.println("abc" + "xyz"); //abcxyz
		System.out.println(1 + "xyz"); //abcxyz
		
		
		
		//Concat a string
		String s1="Welcome\s";
		String s2="to Java\s";
		String s3="Automation";
		
		System.out.println(s1+s2);
		
		
		//diff way to print
		System.out.println(s1.concat(s2));
		//diff way to print
		System.out.println("Weclome\s".concat("to Java"));
		
		//concat 3 strings
		s1.concat(s2).concat(s3);
		System.out.println(s1.concat(s2).concat(s3));
		
		
		
		//trim() trims left and right characters
		s="   automation   ";
		System.out.println(s);
		System.out.println("Before Trimming:\s"+s.length()); //16
		System.out.println(s.trim());

	}

}
