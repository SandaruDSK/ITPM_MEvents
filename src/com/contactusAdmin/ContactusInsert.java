package com.contactusAdmin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ContactusInsert")
public class ContactusInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String contactnumber = request.getParameter("contactnumber");
		String email = request.getParameter("email");
		String message = request.getParameter("message");
		
		int isTrue;
		
		isTrue = ContactusAdminDBUtil.insertcontactusdetails(name, contactnumber, email, message);
		
		if(isTrue > 0) {

			List<ContactusAdmin> Details = ContactusAdminDBUtil.getcontactusdetails();
			request.setAttribute("PL", Details);
			
//			RequestDispatcher dis = request.getRequestDispatcher("updateContactus.jsp");
			RequestDispatcher dis = request.getRequestDispatcher("contactusinsert.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}
