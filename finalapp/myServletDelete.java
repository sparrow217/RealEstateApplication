import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


@WebServlet("/myServletDelete")
public class myServletDelete extends HttpServlet{ 
	
	private static final long serialVersionUID = 1L; 
	static String			url		= "jdbc:mysql://ec2-52-36-6-217.us-west-2.compute.amazonaws.com:3306/myDB?user=newuser&password=password";
	static String			user		= "newuser";
	static String			password		= "password";
	static Connection			connection	= null;
	
	
	
	public myServletDelete(){}
	
	
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html;charset=UTF-8");
		
			////response.getWriter().println(url);
			
			PrintWriter out = response.getWriter();

			try {
				Class.forName("com.mysql.jdbc.Driver");
				////response.getWriter().println("JDBcc Driver works------------<br>");
			} catch (ClassNotFoundException e) {
				////response.getWriter().println("Where is your MySQL JDBC Driver?");
				e.printStackTrace();
				return;
			}
			
			connection = null;
			try {
				////response.getWriter().println("WE are connnected1");
				connection = DriverManager.getConnection(url);
				////response.getWriter().println("WE are connnected");
				
				if( connection == null)
				{
					////response.getWriter().println("The connection is empty");
					
				}
				
				if (connection != null) {
				
				} else {
					////response.getWriter().println("There is information in connection");
				}
		
		

			} catch (SQLException e) {
				////response.getWriter().println("Connection Failed! Check output console");
				e.printStackTrace();
				return;
			}
			
			if( connection == null)
			{
				////response.getWriter().println("The connection is empty");
				
			}


			if (connection != null) {

			} else {
				////response.getWriter().println("Failed to make connection!");
			}
	
	
	/*The test to see if data is passed*/
	 	

		String requestedUserQuery = request.getParameter("userName");
		String requestedPasswordQuery = request.getParameter("password"); 

		
		
		
		out.println( "<html><body>");

		
		
	
		
		
		
		//For testing
		String selectSQL = "SELECT * FROM re";
		//selectSQL = selectSQL.concat(requestedQuery);
		//selectSQL = selectSQL.concat(";"); 
		
		
	
		out.println("</body></html>");
		
	
		
		
		//ResultSet rs= null; 
	
		
		try {
	/* This is the template from the slides	*/
			if( connection == null)
			{
				////response.getWriter().println("!The connection is empty");
				
			}
			
			if (connection != null) {
				////response.getWriter().println("There is data in the connection");
			}
	 
		String theUserName = "user%";
		////response.getWriter().println(selectSQL + "<br>");
		////response.getWriter().println("------------------------------------------<br>");
		PreparedStatement preparedStatement = connection.prepareStatement("delete from cust where username =? and password =?", ResultSet.TYPE_SCROLL_INSENSITIVE,  ResultSet.CONCUR_READ_ONLY);
		
			
	
		preparedStatement.setString(1, requestedUserQuery);

		preparedStatement.setString(2, requestedPasswordQuery);
		
		

	    preparedStatement.executeUpdate();
	    
	    
	
	    
	    out.println("The Account has been deleted from the Property Watch system.");
//		if( rs.next() != false )
//		{
//			out.println("The result set is not empty");
//		}
		
		/*
		while (rs.next()) {
			
			String city = rs.getString("city");
			String state = rs.getString("state");
			String zipCode = rs.getString("zipcode");
			
			out.print("inside the loop");
			out.println("City: " + city + ", ");
			out.println("State: " + state + ", ");
		    out.println("Zip Code: " + zipCode + "<br>");
		}
		
		*/
		
		}
		
		catch (SQLException e )
		{ 
			e.printStackTrace();
		}

		}
		
}


		



