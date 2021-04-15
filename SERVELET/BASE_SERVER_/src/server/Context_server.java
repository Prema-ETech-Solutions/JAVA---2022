package server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Context_server extends HttpServlet 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{ 
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String opt = req.getParameter("Opt");
		if (opt.equals("Context"))
		{	
			ServletContext SCT = req.getServletContext();
			String Value = SCT.getInitParameter("NAME");
			out.println("<h1> VALUE OF CONTEXT IS "+Value+"</h1>");
		} 
		else if (opt.equals("Config")) 
		{
			ServletConfig SCF = getServletConfig();
			String VALUE = SCF.getInitParameter("NAME");
			out.println("<h1> VALUE OF CONFIG IS "+VALUE+"</h1>");
		}
			
	}
	

}
