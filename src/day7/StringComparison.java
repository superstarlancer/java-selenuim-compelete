package day7;

public class StringComparison {

	public static void main(String[] args) {
		//String s1="welcome";
		//String s2="welcome";
		
		//System.out.println(s1==s2); //true
		//System.out.println(s1.equals(s2)); //true
		
		
		
		
		//Why are both strings not equal here?
		//when you use a new keyword java creates an objects
		String s1=new String("welcome");
		String s2=new String("welcome");
		
		System.out.println(s1==s2); //false  //COMPARES OBJECTS
		System.out.println(s1.equals(s2)); //true //COMPARES VALUES
		
		//== when comparing with strings vs. equals()

	}

}
