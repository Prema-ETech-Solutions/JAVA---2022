package calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Session_Call extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException
	{
		HttpSession Session = req.getSession();
		int num1 = (int)Session.getAttribute("num1");
		int num2 = (int)Session.getAttribute("num2");
		Session.removeAttribute("num1");
		Session.removeAttribute("num2");
		PrintWriter out  = res.getWriter();
		out.println("NUM1 * NUM2 "+(num1*num2));
		
	}

}
