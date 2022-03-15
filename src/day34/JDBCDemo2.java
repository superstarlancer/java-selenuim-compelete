package day34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//1)Create a connection
//2)Create statement/query
//3)Execute statement/query
//4)Capture Results in console window and print
//5)Close connection

public class JDBCDemo2 {

	public static void main(String[] args) throws SQLException 
	{

		//1) Create a connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		
		//2 & 3) Create statement object /Query & Execute
		Statement stmt=con.createStatement();
		
		String select_query="select * from location";
		
		//4) Capture results in a variable and print
		ResultSet rs=stmt.executeQuery(select_query); //ResultSet is a return type variable
		
		
		//we use a while loop because the data will change, it's not fixed
		//rs.next() gives you a record one after the other if 1st is present and so on...
		//there are three columns of data city,country,pin : varchar or string, int is number
		//capture 1st row and data type and store in a variable
		while(rs.next()) //boolean if there is record available in table then true execute stmt , then check 2nd record ...
		{
			String mycity=rs.getString("city"); //column name
			String mycountry=rs.getString("country"); //column name
			int mypin=rs.getInt("pin"); //column name
			
			System.out.println(mycity+"     "+mycountry+"     "+mypin);
		}
		
		
		//5) close connection
		rs.close();
		con.close();
		
		System.out.println("Done!!!");

	}

}
