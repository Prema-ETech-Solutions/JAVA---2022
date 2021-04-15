package com.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Form_Data extends HttpServlet 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		int userid = Integer.parseInt(req.getParameter("USER_ID"));
		String username = req.getParameter("USER_NAME");
		Double userssal =Double.parseDouble(req.getParameter("USER_SAL"));
		String Checked = req.getParameter("box"),
			   option = req.getParameter("cbox");
		
//		out.print();
		if (Checked!=null)
		{
			out.println("<h1>DATA</h1><br>");
			out.println("<h1>USER ID   :</h1>"+userid);
			out.println("<h1>USER NAME :</h1>"+username);
			out.println("<h1>USER SAL  :</h1>"+userssal);
		}
		else 
		{
			RequestDispatcher RD = req.getRequestDispatcher("F1.html");
			if (option.equals("Forward")) 
			{
				RD.forward(req, resp);
			}
			else if (option.equals("Include")) 
			{
				out.println("<h1>SERVER OUTPUT </h1>");
				out.println("<h1>PLEASE CHECK THE BOX </h1>"); 
				RD.include(req, resp);
				
			}
			
		}
		
		
	}

}
