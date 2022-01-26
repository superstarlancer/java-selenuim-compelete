package day3;

public class Operators {

	public static void main(String[] args) {
		//int a=10;
		//int b=20;
		
		int a=10, b=20;
		
		//Arithmetic Operators + - * / %
		
		
		//System.out.println("Addition of a and b is "+(a+b));
		//System.out.println("Subtraction of a and b is "+(b-a));
		//System.out.println("Multiplication of a and b is "+(a*b));
		//System.out.println("Division of a and b is "+(b/a));
		//System.out.println("Modulus Division of a and b is "+(b%a));

		//Relational/Comparison Operators > >= < <= != ==
		//Relational operators always return true/false (boolean values)
	
	
		a=100;
		b=200;
		
		//System.out.println(a>b); //100>200 false
		//System.out.println(a<b); // 100<200 true
		
		//b=100;
		//System.out.println(a>=b); //100>=200 false
		//System.out.println(a<=b); //100<=200 true
		
		//System.out.println(a==b); // 100==200 false
		//System.out.println(a!=b); //true
	
	
		
		//Logical Operators && || !
		//Logical Operators used between 2 booleans values
		//Returns true/false (boolean)
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x && y); // false if both values true will return true if not false
		System.out.println(x || y); // true if either one is true give true
		System.out.println(!x); //false
		System.out.println(!y); //true
		
		System.out.println((10>20) && (20>10)); //false && true = false
	
	
	}

}
