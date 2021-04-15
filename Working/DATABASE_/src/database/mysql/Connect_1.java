package database.mysql;
import java.sql.*;
public class Connect_1 
{
	static String url = "jdbc:mysql://localhost:3306/java_db?useSSL=false";
	static String usename = "root";
	static String password ="@123";
	static String driver = "com.mysql.jdbc.Driver";
 	public static void main(String[] args) 
	{
 		try 
 		{
 			Class.forName(driver);
 			Connection con = DriverManager.getConnection(url,usename,password);
 			if (con.isClosed()) 
 			{
 				System.out.println("Connection Is Closed");
			} 
 			else
 			{
 				System.out.println("Connection Is Opened");
			}
		} 
 		catch (Exception e) 
 		{
 			
// 			e.printStackTrace();
 			System.out.println(e);
 		}
		
		
	}

}
