package com.employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchServelet
 */
@WebServlet("/SearchServelet")
public class SearchServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String id=request.getParameter("id");
		
		PrintWriter out=response.getWriter();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");
			Statement st=conn.createStatement();
			
			ArrayList<String> list=new ArrayList<String>();
			 int check=0; 
			  
			String query="select * from employee_details where id='"+id+"'";
			ResultSet rs=st.executeQuery(query);
			
			
           
        	   while(rs.next()){
        	
 				  check=1;
 				  list.add(rs.getString(1));
 				  list.add(rs.getString(2));
 				  list.add(rs.getString(3));
 				  list.add(rs.getString(4));
 				  list.add(rs.getString(5));
 				  list.add(rs.getString(6));
 				  request.setAttribute("empList", list);
 				  request.getRequestDispatcher("search.jsp").forward(request, response); 				 
 				
 				  }				  
 				  if(check==0) {
 					 request.setAttribute("fail", "No records found");
 	 				  request.getRequestDispatcher("search.jsp").forward(request, response);  	 			
 				  }
 				 //System.out.println("empList " +list);
 	
				  st.close();
		  		  conn.close();			     
		  	
			
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
