package database.mysql;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
public class Update_Statement_5
{
	static String url= "jdbc:mysql://localhost:3306/java_db?useSSL=false";
	static String username = "root";
	static String password = "@123";
	static String driver ="com.mysql.jdbc.Driver";
	static InputStreamReader ISR = new InputStreamReader(System.in);
	static BufferedReader BS = new BufferedReader(ISR);
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println("ENTER YOUR ID - ");
			int id = Integer.parseInt(BS.readLine());
			System.out.println("ENTER NEW NAME - ");
			String name = BS.readLine();
			
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);
			String qurey = "UPDATE java_db.t1 SET NAME = ? WHERE ID = ?";
			PreparedStatement psmt = con.prepareStatement(qurey);
			psmt.setString(1, name);
			psmt.setInt(2,id);
			
			psmt.executeUpdate();
			con.close();
			System.out.println("UPDATED");
			
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}
		

	}

}
