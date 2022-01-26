package day3;

public class ConditionalOperator {

	public static void main(String[] args) {
		//Conditional or Ternary Operator
		//variable = Expression1 ? Expression2: Expression3
		
		//Example 1
		
		//int a=10, b=20;
		//int x=(a<b)? a:b;
		//if true return 10 else return b, since expression 1 is true it returns a value or 10
		//System.out.println(x);
		
		//Example 2
		int age =20;
		String res=(age >=18) ? "Eligible to vote":"Not eligible to vote";
		System.out.println(res);

	}

}
