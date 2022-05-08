package com.contactusAdmin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HiddenDetails")
public class HiddenDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HiddenDetails() {
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
		
		List<ContactusAdmin> productList=PS.getcontactusdetails();
		
		request.setAttribute("PL", productList);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/View_Deleted_Events.jsp");
		rd.forward(request, response);
		
		response.sendRedirect("ViewAllContactUsDetails?s=1");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
