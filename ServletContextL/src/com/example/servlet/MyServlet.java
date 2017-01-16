package com.example.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,
			HttpServletResponse response)throws ServletException,IOException{
			response.setContentType("text/html");
			
	        PrintWriter out = response.getWriter();
	        out.println("<html>");
	        out.println("<head><title>Test ServletContextListener </title></head>");
	        out.println("<hr>Server Version: <i><b>"+getServletContext().getMajorVersion() + "</i></b>");
	        out.println("<hr>Server Info: <i><b>"+getServletContext().getServerInfo() + "</i></b>");
	        out.println("</body></html>");
	}
}
