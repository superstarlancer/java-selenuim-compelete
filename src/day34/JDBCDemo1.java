package day34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


//1)Create a connection
//2)Create statement/query
//3)Execute statement/query
//4)Close connection

public class JDBCDemo1 {

	public static void main(String[] args) throws SQLException 
	{
		//1)Create a connection	
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost::3306/mydb","root","root"); //username //password
		
		//2 & 3) Create statement/query & Execute
		Statement stmt=con.createStatement();

		//String insert_query="insert into student values(104,'smith')";
		//String update_query="update student set sname='kim' where sid=104";
		String delete_query="delete from student where sid=104";
		
		stmt.execute(delete_query);
		
		
		//4) close connection
		con.close();
		
		System.out.println("Done!!!");
	}

}
