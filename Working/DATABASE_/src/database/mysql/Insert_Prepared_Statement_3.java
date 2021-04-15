package database.mysql;
import java.sql.*;
import java.util.*;
public class Insert_Prepared_Statement_3 {

	static String url = "jdbc:mysql://localhost:3306/java_db?useSSL=false";
	static String username = "root";
	static String password = "@123";
	static String driver = "com.mysql.jdbc.Driver";
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("ENTER NAME - ");
		String name = input.nextLine();
		System.out.println("ENTER SAL - ");
		Double sal = input.nextDouble();
		try 
		{
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(url, username, password);
			String query = "insert into t1(NAME,SAL) values(?,?)";
			PreparedStatement psmt = connection.prepareStatement(query);
			psmt.setString(1,name);
			psmt.setDouble(2,sal);
			psmt.executeUpdate();
			System.out.println("KK");
			connection.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
