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


@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet{ 
	
	private static final long serialVersionUID = 1L; 
	static String			url		= "jdbc:mysql://ec2-52-36-6-217.us-west-2.compute.amazonaws.com:3306/myDB?user=newuser&password=password";
	static String			user		= "newuser";
	static String			password		= "password";
	static Connection			connection	= null;
	
	
	
	public MyServlet(){}
	
	
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html;charset=UTF-8");
			
		//	//response.getWriter().println(url);
			
			PrintWriter out = response.getWriter();

			try {
				Class.forName("com.mysql.jdbc.Driver");
			//	//response.getWriter().println("JDBcc Driver works------------<br>");
			} catch (ClassNotFoundException e) {
		//		//response.getWriter().println("Where is your MySQL JDBC Driver?");
				e.printStackTrace();
				return;
			}
			
			connection = null;
			try {
		
				connection = DriverManager.getConnection(url);
			//	//response.getWriter().println("WE are connnected");
				
				if( connection == null)
				{
					//response.getWriter().println("The connection is empty");
					
				}
				
				if (connection != null) {
				
				} else {
					//response.getWriter().println("There is information in connection");
				}
		
		

			} catch (SQLException e) {
				//response.getWriter().println("Connection Failed! Check output console");
				e.printStackTrace();
				return;
			}
			
			if( connection == null)
			{
				//response.getWriter().println("The connection is empty");
				
			}


			if (connection != null) {
			
			} else {
				//response.getWriter().println("Failed to make connection!");
			}
	
	
	/*The test to see if data is passed*/
	 	String requestedQuery = request.getParameter("propertyQuery");
		
		out.println( "<html><body>");

	
		
		
		
		
		String selectSQL = "SELECT * FROM re";
		//selectSQL = selectSQL.concat(requestedQuery);
		//selectSQL = selectSQL.concat(";"); 
		
	
	
		out.println("</body></html>");
		
	
		
		
		ResultSet rs= null; 
	
		
		try {
	/* This is the template from the slides	*/
			if( connection == null)
			{
				//response.getWriter().println("!The connection is empty");
				
			}
			
			if (connection != null) {
				//response.getWriter().println("There is data in the connection");
			}
	 
		String theUserName = "user%";
		//response.getWriter().println(selectSQL + "<br>");
		//response.getWriter().println("------------------------------------------<br>");
		PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM re where city=?", ResultSet.TYPE_SCROLL_INSENSITIVE,  ResultSet.CONCUR_READ_ONLY);
		preparedStatement.setString(1, requestedQuery);
		
	    rs = preparedStatement.executeQuery();
	
		
		
//		if( rs.next() != false )
//		{
//			out.println("The result set is not empty");
//		}
		
		while (rs.next()) {
			
			String city = rs.getString("city");
			String state = rs.getString("state");
			String zipCode = rs.getString("zipcode");
			String bed = rs.getString("bed");
			String bath = rs.getString("bath");
			String sqft = rs.getString("sqft"); 
			String yard = rs.getString("yard"); 
			String realEstateType = rs.getString("typere");	
			String furnished = rs.getString("furnished");	
			String schoolRating = rs.getString("schoolrateing"); 
			String garage = rs.getString("garage"); 
			String dishWasher = rs.getString("dw"); 
			String washer = rs.getString("wash"); 
			String dryer = rs.getString("dry");
			String heat = rs.getString("heat"); 
			String pets = rs.getString("pets"); 
			String notes = rs.getString("notes");
			
			
			
			out.println("City: " + city + ", ");
			out.println("State: " + state + ", ");
		    out.println("Zip Code: " + zipCode + ", ");
		    out.println("Bed: " + bed + ", ");
			out.println("Bath: " + bath + ", ");
		    out.println("Square Feet: " + sqft + ", ");
		    out.println("Yard: " + yard + ", ");		
		    out.println("Real Estate Type: " + realEstateType + ", ");
		    out.println("Furnished: " + furnished + ", ");
			out.println("School Rating: " + schoolRating + ", ");
		    out.println("Garage: " + garage + "<br>");
		    out.println("DishWasher: " + dishWasher + ", ");
			out.println("Washer: " + washer + ", ");
		    out.println("Dryer: " + dryer + ", ");
		    out.println("Heat: " + heat + ", ");
			out.println("Pets: " + pets + ", ");
		    out.println("Additional Notes: " + notes + "<br>");
		    out.println("<br/>");
		    
		}
		}
		
		catch (SQLException e )
		{ 
			e.printStackTrace();
		}

		}
		
}


		



