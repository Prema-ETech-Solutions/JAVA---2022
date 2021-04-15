package server;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Sum_Cookies extends HttpServlet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		int v1 = 0 , v2 = 0;
		 Cookie Co[] = req.getCookies();
		 for (Cookie c : Co)
		 {
			 if (c.getName().equals("v1"))
			 {
				 v1 = Integer.parseInt(c.getValue());
			 }
			
			if (c.getName().equals("v2")) 
			 {
				 v2 = Integer.parseInt(c.getValue());
			 }
		 }
		 
		 resp.setContentType("text/html");
		 PrintWriter out = resp.getWriter();
		 out.println("<h1> SUM USING COOKIES "+(v1+v2)+"</h1>");
		 
	}
}
