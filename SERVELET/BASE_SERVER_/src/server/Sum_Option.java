package server;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Sum_Option extends HttpServlet 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		
		int  v1 ,v2;
		v1 = Integer.parseInt(req.getParameter("v1_option"));
		v2 = Integer.parseInt(req.getParameter("v2_option"));
		String select = req.getParameter("drop") ;
		
		if (select.equals("REDIRECT"))
		{
			req.setAttribute("v1",v1);
			req.setAttribute("v2", v2);
			RequestDispatcher RD = req.getRequestDispatcher("redirect");
			RD.forward(req, res);
		}
		else if (select.equals("URL")) 
		{
			res.sendRedirect("url_?v1="+v1+"&v2="+v2);
		}
		else if (select.equals("SESSION")) 
		{
			HttpSession Session = req.getSession();
			Session.setAttribute("v1",v1);
			Session.setAttribute("v2", v2);
			res.sendRedirect("Session_");
		}
		else if (select.equals("COOKIES"))
		{
			Cookie C1 = new Cookie("v1",v1+"");
			Cookie C2 = new Cookie("v2",v2+"");
			res.addCookie(C1);
			res.addCookie(C2);
			res.sendRedirect("Cookies_");
			
		}
	}

}
