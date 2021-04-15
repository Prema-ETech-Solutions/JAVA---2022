package database.oracle;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
public class Update_Statement_5 {

	static String 
	url = "jdbc:oracle:thin:@localhost:1521:orcl",
	driver="oracle.jdbc.OracleDriver",
	username="sys as SYSDBA",
	password="Admin_123"
	;
	static InputStreamReader ISR = new InputStreamReader(System.in);
	static BufferedReader BR = new BufferedReader(ISR);
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println("ENTER YOUR ID -");
			int ID = Integer.parseInt(BR.readLine());
			System.out.println("ENTER NEW NAME -");
			String NAME = BR.readLine();
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);
			String QUERY = "update system.T1 set NAME=? where ID =?";
			PreparedStatement PSMT = con.prepareStatement(QUERY);
			PSMT.setString(1,NAME);
			PSMT.setInt(2,ID);
			PSMT.executeUpdate();
			System.out.println("UPDATED");
			con.close();
		} 
		catch (Exception e) 
		{
			System.out.println(e);
			e.printStackTrace();
			
		}
	}

}
