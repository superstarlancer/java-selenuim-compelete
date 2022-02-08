package day8;

public class EmployeeMain 
{
	//This is the main method in the Main class 'EmployeeMain'
	//Objects created in main method only
	public static void main(String args [])
	{
		Employee emp1=new Employee();
		emp1.eid=101;
		emp1.ename="Kim";
		emp1.job="Manager";
		emp1.empsal=50000;
		
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.eid=102;
		emp2.ename="Smith";
		emp2.job="Programmer";
		emp2.empsal=4000;
		
		emp2.display();
			
	}
}
