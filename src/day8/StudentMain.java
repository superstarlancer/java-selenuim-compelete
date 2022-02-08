package day8;

public class StudentMain {
	public static void main(String args [])
	{
		//Approach 1: Directly access variables and assign data using object reference
		//Student stu=new Student();
		/*stu.sid=101;
		stu.sname="Smith";
		stu.grade='A';
		stu.show();*/
		
		//Don't follow first approach, follow 2nd
		//Approach 2: Assign data using a method(initiated in class) and calling method
		//stu.setData(101,"Smith", 'A');
		//stu.show();
		
		//Approach 3: Assign data using the constructor
		//constructor expects 3 parameters
		Student stu=new Student(101,"Kim",'A');
		stu.show();
	}
}
