package server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sum_get extends HttpServlet 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		int v1 , v2;
		
		v1 = Integer.parseInt(req.getParameter("v1_get"));
		v2 = Integer.parseInt(req.getParameter("v2_get"));
		int rs = v1+v2;
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1> SUM USING GET "+rs+"</h1>");
		
	}

	
}
