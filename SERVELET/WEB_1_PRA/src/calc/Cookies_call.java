package calc;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookies_call extends HttpServlet 
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException 
	{
		int num1=0,num2=0;
		Cookie Cookies[] = req.getCookies();
		for (Cookie c : Cookies) 
		{
			if (c.getName().equals("num1")) 
			{
				num1 = Integer.parseInt(c.getValue());
			}
			else if (c.getName().equals("num2")) 
			{
			     num2 = Integer.parseInt(c.getValue());
			}
			
		}
		
		PrintWriter out = res.getWriter();
		
		out.println("DIVIDE NUM1 / NUM2 "+(num1/num2));
		
		
	}

}
