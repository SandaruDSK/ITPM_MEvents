package com.contactusAdmin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.RequestDispatcher;

@WebServlet("/ViewAllContactUsDetails")
public class ViewAllContactUsDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewAllContactUsDetails() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContactusAdminDBUtil PS = new ContactusAdminDBUtil();
		if (request.getParameter("did")!= null)
		{
			PS.removecontactusdetails(Integer.parseInt( (String) request.getParameter("did")));
		}
		
		response.setContentType("text/html");
		
		List<ContactusAdmin> eventList=PS.getcontactusdetails();
		
		request.setAttribute("PL", eventList);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/AdminContactUsViewaAll.jsp");
		rd.forward(request, response);
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}	

}
