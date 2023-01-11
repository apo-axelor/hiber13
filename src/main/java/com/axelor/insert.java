package com.axelor;

import java.io.IOException;
import java.io.PrintWriter;
import com.axelor.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/insert"})
public class insert extends HttpServlet  {
	public insert()
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

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student_details");  
        EntityManager em=emf.createEntityManager();  
          
em.getTransaction().begin();  
//Em s=em.find(Em.class,101);  

//System.out.println("empid = "+s.geteid());  
//System.out.println("empName = "+s.getename());  
  
  
//}  
//Em s=em.find(Em.class,102);  
//System.out.println("Before Updation");  
//System.out.println("empid = "+s.geteid());  
//System.out.println("empname = "+s.getename());  

  
//s.seteid(30);  
  
//System.out.println("After Updation");  
//System.out.println("emp id = "+s.geteid());  
//System.out.println("emp Name = "+s.getename());  
  
  
  
//}   
          
        Em s1=new Em();  
        s1.seteid(101);  
        s1.setename("Gaurav");  
          
          
        em.persist(s1);  
        
em.getTransaction().commit();  
          
        emf.close();  
        em.close();  
          
    }  

		
	
	
	
		
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		super.doPost(req, resp);
	}
	
	
}
