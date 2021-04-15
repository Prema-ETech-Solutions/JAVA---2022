package server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sum_Redirect extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		
		int v1=(int)req.getAttribute("v1");
		int v2=(int)req.getAttribute("v2");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>SUM USING REDIRECT "+(v1+v2)+"</h1>");
	}

}
