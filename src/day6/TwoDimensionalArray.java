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
		//System.out.println(a.length); //returns number of rows
		
		//System.out.println(a[0].length); //returns number of columns in that particular row, specify the row number
		
		
		
		
		
		//Return a specific value from 2 dim array
		//System.out.println(a[1][0]); //prints 300
		//System.out.println(a[2][1]); //prints 600
		
		
		
		
		
		//To read all data from two dim array, use nested loop statement
		//For each row, there is multiple columns, outer loop = row, inner loop=column
		/*for(int r=0; r<a.length;r++) //3
		{
			for(int c=0;c<a[r].length;c++) //2  hard-code =  c<2
			{
				System.out.println(a[r][c]); //iterations 0,0=100  , 0,1=200  , 1,0=300 , 1,1=400 , 2,0=500 , 2,1=600 
			}
		}*/
		
		
		
		
		//Enhanced for loop
		//don't use an index concept in an enhanced for loop we don't specify and index
		//a is 2dim array that contains rows and columns - outer loop
		//Outer loop is in charge of storing row values, inner loop in charge of printing them
		
		//outer loop captures complete 1st row in the 2d array, and stores all row values in a single value (x)
		//outer loop x contains 100 & 200
		//inner loop iterates each value stored in x outer loop and assigns it to v and prints each one individually
		
		
		/*for(int x[]:a) 
		{
			for(int v:x) 
			{
				System.out.println(v);
			}
		}*/
		
		
		
		
		//Printing in a matrix
		
		for(int x[]:a) 
		{
			for(int v:x) 
			{
				System.out.print(v+"  "); //take out ln in print stmt & concat a space
			}
			System.out.println();
		}
		
		
		
		
	}

}
