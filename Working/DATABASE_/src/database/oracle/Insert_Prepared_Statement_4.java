package database.oracle;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
public class Insert_Prepared_Statement_4 
{
	static String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	static String usename = "system";
	static String password = "Admin_123";
	static String driver = "oracle.jdbc.OracleDriver";
	
	
	static InputStreamReader ISR = new InputStreamReader(System.in);
	static BufferedReader BR = new BufferedReader(ISR);
	
	public static void main(String[] args) 
	{
		int count = 0;
		try 
		{
			
			String query = "select * from system.T1";
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, usename, password);
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(query);
			while (rs.next())
			{
				count++;
			}
			System.out.println("TOTAL ENTRIES - "+count+"\n\n");
			con.close();
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}
		try 
		{
			count++;
			System.out.println("ENTER NAME - ");
			String name = BR.readLine();
			System.out.println("ENTER SAL - ");
			float sal = Float.parseFloat(BR.readLine());
			String query = "insert into T1(ID,NAME,SAL)values(?,?,?)";
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, usename, password);
			PreparedStatement psmt = con.prepareStatement(query);
			psmt.setInt(1,count);
			psmt.setString(2,name);
			psmt.setFloat(3,sal);
			psmt.executeUpdate();
			con.close();
			System.out.println("INSERTED");
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		
		
		
		
		
		
		

	}

}
