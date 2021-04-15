package server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Sum_Session extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		HttpSession Session = req.getSession();
		int v1,v2;
	  v1 =(int)Session.getAttribute("v1");
	  v2 =(int)Session.getAttribute("v2");
	  resp.setContentType("text/html");
	  PrintWriter out = resp.getWriter(); 
	  out.println("<h1> SUM USING SESSION "+(v1+v2)+"</h1>");
	  
	}

}
