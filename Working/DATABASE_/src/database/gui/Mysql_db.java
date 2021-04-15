package database.gui;
import java.sql.*;

public class Mysql_db 
{
	static String url = "jdbc:mysql://localhost:3306/java_db?useSSL=false";
	static String username = "root";
	static String password = "@123";
	static String Drivers = "com.mysql.jdbc.Driver";
	static private Connection con;
	public static void Change(String IP,String PORT,String DB,String USERNAME,String PASSWORD)
	{
		url = "jdbc:mysql://"+IP+":"+PORT+"/"+DB+"?"+"useSSL = false";
		username = USERNAME;
		password = PASSWORD;
	}
	public static void Clean()
	{
		url = "jdbc:mysql://localhost:3306/java_db?useSSL=false";
		username = "root";
		password = "@123";
		Drivers = "com.mysql.jdbc.Driver";
	}
	public static void Change(String URL,String USERNAME,String PASSWORD,String DRIVER)
	{
		url = URL;
		username = USERNAME;
		password = PASSWORD;
		Drivers = DRIVER;
	}
	
	public static Connection Connect()
	{
		try 
		{	
			Class.forName(Drivers);
			con = DriverManager.getConnection(url, username, password);
			return con;
		}
		catch (Exception e)
		{
			System.out.println(e);
			return null;
		}
	}
	
	public static Boolean Create()
	{
		try 
		{
			con = Connect();
			String Query = "CREATE TABLE IF NOT EXISTS t1(ID int NOT NULL AUTO_INCREMENT,NAME varchar(200),SAL double,PRIMARY KEY (ID))";
			Statement SMT = con.createStatement();
			SMT.executeUpdate(Query);
			con.close();
			return true;
			
		} 
		catch (Exception e) 
		{
			System.out.println(e);
			return false; 
			
		}
		
	}
	
	public static Boolean Insert(String NAME,Double SAL)
	{
		try 
		{
			con = Connect();
			String Query = "INSERT INTO t1 (NAME, SAL) VALUES (?, ?)";
			PreparedStatement PSMT = con.prepareStatement(Query);
			PSMT.setString(1, NAME);
			PSMT.setDouble(2, SAL);
			PSMT.executeUpdate();
			con.close();
			return true;
			
		} 
		catch (Exception e) 
		{
			System.out.println(e);
			return false;
			
		}
		
	}
	
	public static int CHECK(String NAME)
	{
		int count=0;
		try 
		{
			con = Connect();
			String Query = "SELECT NAME FROM t1 where NAME = ?";
			PreparedStatement PSMT = con.prepareStatement(Query);
			PSMT.setString(1, NAME);
			ResultSet RS=PSMT.executeQuery();
			
			while (RS.next())
			{
				count = count+1;
				
			}
			con.close();
			return count ;
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println(e);
			return -1;
			
		}		
	}
	
	
	
	public static Boolean UPDATE(String NAME,String NEWNAME)
	{
		try 
		{
			con = Connect();
			String Query = "UPDATE t1 SET NAME = ? WHERE NAME = ?";
			PreparedStatement PSMT = con.prepareStatement(Query);
			PSMT.setString(1, NEWNAME);
			PSMT.setString(2, NAME);
			PSMT.executeUpdate();
			con.close();
			return true;
			
		} 
		catch (Exception e) 
		{
			System.out.println(e);
			return false;
			
		}
		
	}
	
	
	
	public static Boolean DELETE(String NAME)
	{
		try 
		{
			con = Connect();
			String Query = "DELETE FROM t1 WHERE (NAME = ?)";
			PreparedStatement PSMT = con.prepareStatement(Query);
			PSMT.setString(1, NAME);
			PSMT.executeUpdate();
			con.close();
			return true;
			
		} 
		catch (Exception e) 
		{
			System.out.println(e);
			return false;
			
		}
		
	}
	
	
	
	public static int CHECK()
	{
		int count=0;
		try 
		{
			con = Connect();
			String Query = "SELECT * FROM t1 ";
			PreparedStatement PSMT = con.prepareStatement(Query);
			
			ResultSet RS=PSMT.executeQuery();
			
			while (RS.next())
			{
				count = count+1;
				
			}
			con.close();
			return count ;
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println(e);
			return -1;
			
		}		
	}
	
	public static ResultSet RS(String NAME)
	{
		try 
		{
			con = Connect();
			String Query = "SELECT * FROM t1 where NAME = ?";
			PreparedStatement PSMT = con.prepareStatement(Query);
			PSMT.setString(1, NAME);
			ResultSet RS=PSMT.executeQuery();
			
			
			//con.close();
			return RS ;
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println(e);
			return null;
			
		}		
	}
	
	
	public static ResultSet RS()
	{
		try 
		{
			con = Connect();
			String Query = "SELECT * FROM t1";
			Statement PSMT = con.createStatement();
			ResultSet RS=PSMT.executeQuery(Query);
			return RS ;
			
			//con.close();
			
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println(e);
			return null;
			
		}		
	}
	
}
