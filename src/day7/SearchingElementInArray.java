package day7;

public class SearchingElementInArray {

	public static void main(String[] args)
	{
		

	int a[]= {50,30,20,10,40};
	
	int num=10;
	
	boolean status=false; //have the help of a temporary variable
	//if the status variable is false it means the element was not found
	//if the status variable is true it means the element was found
	
	for(int i=0; i<a.length;i++) 
	{
		if(a[i]==num) 
		{
			System.out.println("Element Found");
			status=true;
			break;
		}

		
	}
		if (status==false) 
		{
		System.out.println("Element Not Found");
		}
}
	
}
