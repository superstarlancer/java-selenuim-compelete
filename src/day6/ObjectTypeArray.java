package day6;

public class ObjectTypeArray {

	public static void main(String[] args) {
		Object a[]=new Object[5];
		
		a[0]=100;
		a[1]="Welcome";
		a[2]=10.5;
		a[3]='A';
		a[4]=true;
		
		//Normal for loop
		/*for(int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]);
		}*/
		
		
		
		
		
		
		
		//Enhanced Object loop
		//need to specify what type of x it should be to hold all data types
		//Use Object as the datatype to hold all types of data
		for(Object x:a) 
		{
			System.out.println(x);
		}
		
		
		
		
	}

}
