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
		//== compares objects
		// equal() compares values
		
		
		
		String s3=s1;
		System.out.println(s1==s3); //true , they are the same objects because they are assigned to each other
		System.out.println(s1.equals(s3)); //true , whatever value is in s1 is in s3
		
		//////////////////
		String x="abc";
		String y=new String("abc");
		System.out.println(x==y); //false evaluates objects, they are not the same with the new keyword
		System.out.println(x.equals(y)); //true

	}

}
