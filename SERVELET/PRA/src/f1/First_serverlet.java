package f1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class First_serverlet implements Servlet 
{

	ServletConfig Config_;
	int v =0;
	@Override
	public void destroy()
	{
		System.out.println("Destroy");
		
	}

	@Override
	public ServletConfig getServletConfig() 
	{
		return Config_;
	}

	@Override
	public String getServletInfo()
	{
		// TODO Auto-generated method stub
		return  "this is info";
	}

	@Override
	public void init(ServletConfig config) throws ServletException 
	{	
		Config_ = config;
		System.out.println("Creating Object ");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		v++;
		String Value = "Called"+v;
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>"+Value+"</h1>");
	}

} 
