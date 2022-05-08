package com.contactusAdmin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileItem;

/**
 * Servlet implementation class ContactUsUpdateServlate
 */
@WebServlet("/ContactUsUpdateServlate")
public class ContactUsUpdateServlate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactUsUpdateServlate() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ContactusAdminDBUtil PS = new ContactusAdminDBUtil();
		response.setContentType("text/html");
		if (request.getParameter("uid")!= null)
		{
			ContactusAdmin p=PS.getContactusdetailsById(Integer.parseInt(request.getParameter("uid")));
			request.setAttribute("Pro", p);
		}

		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/updateContactus.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContactusAdmin pr= new ContactusAdmin();
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String contactnumber = request.getParameter("contactnumber");
		String email = request.getParameter("email");
		String message = request.getParameter("message");

		int isTrue;
		
		isTrue = ContactusAdminDBUtil.updatecontactusdetails(id, name, contactnumber, email, message);
		
		if(isTrue > 0) {
			
			List<ContactusAdmin> Details = ContactusAdminDBUtil.getcontactusdetails();
			request.setAttribute("cusDetails", Details);
			
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			dis.forward(request, response);
		}
		
		else {
			List<ContactusAdmin> Details = ContactusAdminDBUtil.getcontactusdetails();
			request.setAttribute("cusDetails", Details);
			
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
		}
	}

}
