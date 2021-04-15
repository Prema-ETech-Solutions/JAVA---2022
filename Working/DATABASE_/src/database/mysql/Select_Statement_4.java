package database.mysql;
import java.sql.*;
public class Select_Statement_4 {

	static String url = "jdbc:mysql://localhost:3306/java_db?useSSL=false";
	static String username = "root";
	static String password = "@123";
	static String driver = "com.mysql.jdbc.Driver";
	
	public static void main(String[] args) 
	{
		try
		{
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);
			String query = "select * from t1";
			Statement stm = con.createStatement();
			ResultSet rs =stm.executeQuery(query);
			while (rs.next()) 
			{
				System.out.println("ID - "+rs.getInt(1)+" NAME - "+rs.getString(2)+" SAL - "+rs.getDouble(3));
			}
			con.close();
			
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		 

	}

}
