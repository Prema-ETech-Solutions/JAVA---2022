package database.oracle;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
public class Delete_Statement_6 
{
	static String 
	url ="jdbc:oracle:thin:@localhost:1521:orcl",
	Driver = "oracle.jdbc.OracleDriver",
	username = "system",
	password = "Admin_123"		
	;
	static InputStreamReader ISR = new InputStreamReader(System.in);
	static BufferedReader BR = new BufferedReader(ISR);
	public static void main(String[] args)
	{
		String QUERY = "DELETE FROM system.T1 WHERE (ID = ?)";
		try
		{
			
			System.out.println("ENTER YOUR ID - ");
			int ID = Integer.parseInt(BR.readLine());
			Class.forName(Driver);
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement PSMT = con.prepareStatement(QUERY);
			PSMT.setInt(1, ID);
			PSMT.executeUpdate();
			System.out.println("DELETED");
			con.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
