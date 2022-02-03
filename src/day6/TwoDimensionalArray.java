package day6;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		//Declaration
		//int a[][] = new int [3][2]; //3 rows 2 columns
		/*a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;*/
		
		
		//Approach 2
		int a[][]= { 
					{100,200} , 
					{300,400} , 
					{500,600} 
				   };
		
		
		//Size of a two dimensional array
		System.out.println(a.length); //returns number of rows
		
		System.out.println(a[0].length); //returns number of columns in that particular row, specify the row number
		

	}

}
