package com.contactusAdmin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/seaarchServlate")
public class seaarchServlate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public seaarchServlate() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("rawtypes")
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		System.out.println("MySQL Connect Example.");
		  Connection conn = null;
		  String url = "jdbc:mysql://localhost:3306/";
		  String dbName = "itpm_mevents";
		  String driver = "com.mysql.jdbc.Driver";
		  String userName = "root"; 
		  String password = "root";

		  Statement st;
		  
		  try {
			  Class.forName(driver).newInstance();
			  conn = DriverManager.getConnection(url+dbName,userName,password);
			  System.out.println("Connected to the database");
			  String  id  = request.getParameter("id");
			  
			  ArrayList al=null;
			  ArrayList con_list =new ArrayList();

			String query = 
					  "select * from contact_us where id='"+id+"'";
			  System.out.println("query " + query);
			  st = conn.createStatement();
			  ResultSet  rs = st.executeQuery(query);
			  
			  while(rs.next()){
				  al  = new ArrayList();
				  
				  al.add(rs.getString(1));
				  al.add(rs.getString(2));
				  al.add(rs.getString(3));
				  al.add(rs.getString(4));
				  al.add(rs.getString(5));
				  System.out.println("al :: "+al);
				  con_list.add(al);
				  }
			  
			  request.setAttribute("conList",con_list);
			  
			  System.out.println("conList " + con_list);

			   // out.println("emp_list " + emp_list);

			   String nextJSP = "/viewSearch.jsp";
			   RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
			   dispatcher.forward(request,response);
			   conn.close();
			   System.out.println("Disconnected from database");
			   
			   } catch (Exception e) {
				   e.printStackTrace();
			   }
		}
	}

