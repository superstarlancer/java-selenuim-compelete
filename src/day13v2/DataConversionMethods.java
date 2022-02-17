package day13v2;

public class DataConversionMethods {

	public static void main(String[] args) {
		//String --> Integer
			/*String s="welcome"; //we cannot convert to number
			String s1="10";
			String s2="20";
			System.out.println(s1+s2); //1020
			
			int s1num=Integer.parseInt(s1);
			int s2num=Integer.parseInt(s2);
			
			System.out.println(s1num+s2num);*/
		
		//String --> Double
			/*String s1="150.50";
			String s2="110.00";
			
			double s1dob=Double.parseDouble(s1);
			double s2dob=Double.parseDouble(s2);
			
			System.out.println(s1dob+s2dob);*/
			
		//String --> Boolean
			/*String status="true";
			boolean b=Boolean.parseBoolean(status);
			System.out.println(b);*/
			
		//Int, double, char, boolean -->String
			int a=10;
			double d=10.5;
			char c='a';
			boolean b=true;
			
			String astr=String.valueOf(a);
			String dstr=String.valueOf(d);
			String cstr=String.valueOf(c);
			String bstr=String.valueOf(b);
			
			System.out.println(astr);
			System.out.println(dstr);
			System.out.println(cstr);
			System.out.println(bstr);

	}

}
