package com.employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditServelet
 */
@WebServlet("/EditServelet")
public class EditServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				
		String id=request.getParameter("employeeID");
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
	"update employee_details set name='"+name+"', designation='"+designation+"', email='"+email+"', phone='"+phone+"', address='"+address+"' where (id='"+id+"')";
		    		  		
		    		  PreparedStatement pst = 
		    		  conn.prepareStatement(sql);
		    		  
		    		  
		    		  int numRowsChanged = pst.executeUpdate();		    		  
		    		  pst.close();
		  			  conn.close();
		    	if(numRowsChanged>0){	
				request.setAttribute("edit", "Saved sucessfully");
				request.getRequestDispatcher("search.jsp").forward(request, response);
		    	}
		    	else {
		    		request.setAttribute("editerr", "Couldn't save to the database ");
					request.getRequestDispatcher("search.jsp").forward(request, response);
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
