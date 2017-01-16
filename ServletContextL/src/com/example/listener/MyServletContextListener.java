package com.example.listener;
import javax.servlet.*;
public class MyServletContextListener implements ServletContextListener {
	private String className;
	
	// Constructor, all it doeas just get class name and store to String variable
	public MyServletContextListener() {
        className = this.getClass().getName();
    }
	
	@Override
	public void contextDestroyed(ServletContextEvent event) {
		    System.out.println("\n*****************************************\n");
	        System.out.println("ContextDestroyed method was called from " + className);
	        System.out.println("Simply Destroying All content!");
		
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		 System.out.println("\n*****************************************\n");
	     System.out.println("ContextInitialized method was called from " + className);
	     System.out.println("Getting ServletContext object from event!");
	     ServletContext sc = event.getServletContext();
	     System.out.println(sc);
	     System.out.println("Now getting from context parameter with value:");
	     String babyName = sc.getInitParameter("BabyName");
	     System.out.println(babyName);
		
	}

}
