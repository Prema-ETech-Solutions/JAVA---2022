package calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Minus_called extends HttpServlet 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8745413971063285836L;
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException 
	{
		int num1 =(int)req.getAttribute("num1");
		int num2 = (int)req.getAttribute("num2");
		PrintWriter out = res.getWriter();
		out.println("num1 - num2 "+(num1-num2));
		
		
	}
	

}
