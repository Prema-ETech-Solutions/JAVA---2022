package database.oracle;
import java.sql.*;
import java.util.Scanner;
public class Connect_1 {

	 static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String Driver = "oracle.jdbc.OracleDriver";
		String url= "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "system";
		String password = "Admin_123";
			try 
			{
				
				Class.forName(Driver);
				 Connection con = DriverManager.getConnection(url,username,password);
				 if (con.isClosed())
				 {
					System.out.println("CLOSED");
					 
				 }
				 else 
				 {
					 System.out.println("ORCL IS OPEN");
					 con.close();
				 }
			
			}
			catch (Exception e) 
			{
				System.out.println(e);
			}
		
	}

}
