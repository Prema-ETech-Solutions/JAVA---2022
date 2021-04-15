package database.oracle;
import java.sql.*;
public class Create_Table_Statement_2 
{
	
	static String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	static String driver = "oracle.jdbc.OracleDriver";
	static String username = "system";
	static String password = "Admin_123";
	
	public static void main(String[] args) 
	{
		
		
		try 
		{
			System.out.println(url);
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);
			String query= "create table system.T1 (ID int primary key,NAME varchar(200),SAL FLOAT)";
			Statement ST = con.createStatement();
			ST.executeUpdate(query);
			System.out.println("CREATED");
			con.close();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			
		}
		

	}

}
