package com.axelor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/"})
public class Emp extends HttpServlet {

	public Emp()
	{
		super();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getContextPath();
		
		PrintWriter pw  =resp.getWriter();
		
		resp.setContentType("text/html");
		pw.println("<html><body align='center'>");  
		pw.println("<h1>Welcome to servlet</h1>");  
		pw.println("<form>");  
		
		pw.print("<input type='text' name='name' placeholder='name'> &nbsp; ");
	
		pw.print("<input type='submit' name='submit'>");
		pw.print("</form>");
		pw.println("</body></html>"); 

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		super.doPost(req, resp);
	}
		
	
}
