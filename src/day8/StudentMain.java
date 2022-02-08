package day8;

public class StudentMain {
	public static void main(String args [])
	{
		//Approach 1: Directly access variables and assign data using object reference
		Student stu=new Student();
		/*stu.sid=101;
		stu.sname="Smith";
		stu.grade='A';
		stu.show();*/
		
		//Approach 2: Assign data using a method and calling method
		stu.setData(101,"Smith", 'A');
		stu.show();
	
	}
}
