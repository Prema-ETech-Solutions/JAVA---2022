package f1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Second_Serverlet extends GenericServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2683667013897388089L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>Extends GenericServlet</h1>");

	}
}
