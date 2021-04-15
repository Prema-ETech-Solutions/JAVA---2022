package database.mysql;
import java.sql.*;
public class Create_Table_Stament_2 {

	static String url = "jdbc:mysql://localhost:3306/java_db?useSSL=false";
	//jdbc:mysql://localhost:3306/java_db?useSSL=false
	static String usename = "root";
	static String password = "@123";
	static String drivers = "com.mysql.jdbc.Driver";
	
	public static void main(String[] args)
	{
		try 
		{
			Class.forName(drivers);
			Connection connection = DriverManager.getConnection(url,usename,password);
			String Query = "CREATE TABLE IF NOT EXISTS T1(ID int primary key auto_increment ,NAME varchar(200),SAL double)";
			Statement stmt = connection.createStatement();
			stmt.executeUpdate(Query);
			System.out.println("TABLE CREATED");
			connection.close();
					
			
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println(e);
		}

		

	}

}
