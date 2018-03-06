package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectMySqlDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0;
		try{  
			//step1 load the driver class  
			Class.forName("com.mysql.jdbc.Driver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/world","root","qaz*qaz123");  
			  
			//step3 create the statement object  
			Statement stmt=con.createStatement();  
			// String sql = "INSERT INTO Employee " +
	           //        "VALUES (100, 'Zara', 10000, 18)";
			
			//stmt.executeUpdate(sql);
			 
			//step4 execute query  
			ResultSet rs=stmt.executeQuery("select * from city ");  

			while(rs.next())  
			System.out.println(rs.getInt(1)+" _ "+rs.getString(2)+"_"+rs.getString(3));  
			//step5 close the connection object  
			
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
			  
	}
}
