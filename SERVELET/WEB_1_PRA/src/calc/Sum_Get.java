package calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sum_Get extends HttpServlet {

	PrintWriter out;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException
	{
		out = res.getWriter();
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		out.println("SUM OF TWO NUMBERS "+(num1+num2));
		
		
	}

}
