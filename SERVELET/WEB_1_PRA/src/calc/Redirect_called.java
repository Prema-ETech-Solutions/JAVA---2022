package calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Redirect_called extends HttpServlet 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException 
	{
		int num1 =Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		PrintWriter out = res.getWriter();
		out.println("MINUS OF NUMBER 1 AND NUMBER 2 IS "+(num1-num2)+"\nSUM OF NUMBER 1 AND NUMBER 2 IS "+(num1+num2));
//		System.out.println("HELLO");
		
	}

}
