package database.oracle;
import java.sql.*;
public class Select_Statement_3 
{
	static String url ="jdbc:oracle:thin:@localhost:1521:orcl";
	static String driver ="oracle.jdbc.OracleDriver";
	static String usename ="system";
	static String password = "Admin_123";
	

	public static void main(String[] args)
	{
		try 
		{
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, usename, password);
			String Query = "select * from system.T1";
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(Query);
			int count = 0;
			while (rs.next()) 
			{
				
				System.out.println("ID - "+rs.getInt(1)+" NAME - "+rs.getString(2)+" SAL - "+rs.getFloat(3));
				count++;
				
			}
			System.out.println("TOTAL ENTRIES - "+count);
			con.close();
		}
		catch (Exception e) 
		{
			
		}

	}

}
