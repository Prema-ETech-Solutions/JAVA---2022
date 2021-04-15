package com.server;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
public class First_server  implements Servlet
{
	ServletConfig config_;
	int a =0;
	@Override
	public void init(ServletConfig config) throws ServletException 
	{
		config_ = config;
		System.out.println("CREATING OBJECT");
		
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{ 
		
		a++;
		String ab = "Servicing ......... "+a;
		res.setContentType("text/html");
		PrintWriter out =res.getWriter();
		out.println("<h1>"+ab+"</h1> ");
	}
	@Override
	public void destroy()
	{
		System.out.println("distroy");
		
	}

	@Override
	public ServletConfig getServletConfig()
	{
		// TODO Auto-generated method stub
		return config_;
	}
	
	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return  "this is info";
	}
}
