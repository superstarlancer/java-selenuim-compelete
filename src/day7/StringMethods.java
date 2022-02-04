package day7;

public class StringMethods {

	public static void main(String[] args) {
		//Frequently used string methods in automation
		
		String s="welcome";
		System.out.println(s);
		
		
		//*length() method returns the length of the string
		//must store in a variable
		int len =s.length();
		System.out.println(len);
		
		//OR
		
		System.out.println(s.length());
		
		//*concat() method combines elements
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
		
		
		
		//*trim() trims left and right characters
		s="   automation   ";
		System.out.println(s);
		System.out.println("Before Trimming:\s"+s.length()); //16
		
		System.out.println(s.trim().length()); //10 all spaces removed
		
		
		//*charAt() returns a single character based on the index starting at 0, checks the sequence not the characters like sel or len mium

		s="welcome";
		System.out.println(s.charAt(5)); //returns m
		System.out.println(s.charAt(0)); //returns m
		
		//*contains() returns if boolean value true or false
		
		//if it conains sel return true if not return false
		s="selenium";
		System.out.println(s.contains("sel")); //true
		System.out.println(s.contains("Sel")); //false
		System.out.println(s.contains("len")); //true
		
		
		
		//*equals() & equalsIgnoreCase() compares if two strings are equal and boolean values returned
		s1="WELCOME";
		s2="welcome";
		
		System.out.println(s1.equals(s2)); //false
		System.out.println(s1.equalsIgnoreCase(s2)); //true
		
		//*replace() replace single or multiple characters in a string
		//replace m with an x
		s="welcome to selenium automation testing";
		System.out.println(s.replace('m', 'x')); //welcoxe to seleniux autoxation testing
		System.out.println(s.replace("welcome", "goodbye")); //goodbye to selenium automation testing
		
		//*substring() extracts substring of the main string (starting index, ending index)
		s="selenium";
		
		System.out.println(s.substring(0,3)); //sel
		System.out.println(s.substring(4,8)); //nium
		System.out.println(s.substring(1,3)); //el
		
		
		//*toUpperCase() && toLowerCase();
		s="WElcome";
		System.out.println(s.toUpperCase()); //WELCOME
		System.out.println(s.toLowerCase()); //welcome
			
		//*split() divides the string into multiple parts based on delimiter/separator
				
		s="abc xyz";
		String var[]=s.split(" ");
		System.out.println(var[0]);
		System.out.println(var[1]);
		
		
		//split in three strings, need a delimiter which can be a @ or a space " " or ,
		s="abc@xyz@pqr";
		String lar[]=s.split("@");
		System.out.println(lar[0]);
		System.out.println(lar[1]);
		System.out.println(lar[2]);
		
		
	}

}
