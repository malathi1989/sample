package com.employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddServelet
 */
@WebServlet("/AddServelet")
public class AddServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String designation=request.getParameter("designation");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String address=request.getParameter("address");
		PrintWriter out=response.getWriter();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");
			
		    	
		    
		        	    String sql = 
		    		  "insert into employee_details values (?,?,?,?,?,?)";
		    		  PreparedStatement pst = 
		    		  conn.prepareStatement(sql);
		    		  pst.setString(1, id);
		    		  pst.setString(2, name);
		    		  pst.setString(3, designation);
		    		  pst.setString(4, email);
		    		  pst.setString(5, phone);
		    		  pst.setString(6, address);
		    		  
		    		  int numRowsChanged = pst.executeUpdate();		    		  
		    		  pst.close();
		  			  conn.close();
		    	if(numRowsChanged>0){	
				request.setAttribute("success", "Member details added sucessfully");
				request.getRequestDispatcher("add.jsp").forward(request, response);
		    	}
		    	else {
		    		request.setAttribute("fail", "Error while loading database");
					request.getRequestDispatcher("add.jsp").forward(request, response);
		    	}
				
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
