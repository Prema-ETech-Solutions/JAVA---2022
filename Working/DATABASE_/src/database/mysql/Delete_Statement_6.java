package database.mysql;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
public class Delete_Statement_6
{
	static String url = "jdbc:mysql://localhost:3306/java_db?useSSL = false";
	static String username = "root";
	static String password = "@123";
	static String Driver ="com.mysql.jdbc.Driver";
	static InputStreamReader ISR = new InputStreamReader(System.in);
	static BufferedReader BR = new BufferedReader(ISR);
	public static void main(String[] args)
	{
		try 
		{
			System.out.println("ENTER YOUR ID - ");
			int id = Integer.parseInt(BR.readLine());
			Class.forName(Driver);
			Connection con = DriverManager.getConnection(url, username, password);
			String query = "DELETE FROM java_db.t1 WHERE (ID = ?)";
			PreparedStatement psmt = con.prepareStatement(query);
			psmt.setInt(1,id);
			psmt.executeUpdate();
			con.close();
			System.out.println("DELETED");
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
	}
	

}
