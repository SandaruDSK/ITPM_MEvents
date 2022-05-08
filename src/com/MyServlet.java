package com;
import java.io.IOException;

import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.PaymentDao;
import com.Payment;
/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
  /**
   * @see HttpServlet#HttpServlet()
   */
  public MyServlet() {
    super();
    // TODO Auto-generated constructor stub
  }
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // TODO Auto-generated method stub
    if (request.getParameter("Action").equals("Add Payment")) {
      System.out.println("in"); 
      PrintWriter printWriter = response.getWriter();
      Payment payment = new Payment();
      PaymentDao dao = new PaymentDao();
      payment.setFname((request.getParameter("fname")));
      payment.setLname((request.getParameter("lname")));
      payment.setCtype((request.getParameter("ctype")));
      payment.setCnumber(Integer.parseInt(request.getParameter("cnumber")));
      payment.setExmonth(Integer.parseInt(request.getParameter("exmonth")));
      payment.setExyear(Integer.parseInt(request.getParameter("exyear")));
      payment.setCvn(Integer.parseInt(request.getParameter("cvn")));
      payment.setTot(Double.parseDouble(request.getParameter("tot")));
      boolean result = dao.addPayment(payment);
      RequestDispatcher dispatcher = request.getRequestDispatcher("addPayment.jsp");
      dispatcher.include(request, response);
      printWriter.print("<br><h2>Payment added Successfully!!</h2>");
    }
    
    
    if (request.getParameter("Action").equals("Edit")) {
      PrintWriter printWriter = response.getWriter();
      Payment payment = new Payment();
      PaymentDao dao = new PaymentDao();
      payment.setId(Integer.parseInt(request.getParameter("id")));
      payment.setFname((request.getParameter("fname")));
      payment.setLname((request.getParameter("lname")));
      payment.setCtype((request.getParameter("ctype")));
      payment.setCnumber(Integer.parseInt(request.getParameter("cnumber")));
      payment.setExmonth(Integer.parseInt(request.getParameter("exmonth")));
      payment.setExyear(Integer.parseInt(request.getParameter("exyear")));
      payment.setCvn(Integer.parseInt(request.getParameter("cvn")));
      payment.setTot(Double.parseDouble(request.getParameter("tot")));
      
      boolean result = dao.editPayment(payment);
      System.out.println(result);
      RequestDispatcher dispatcher = request.getRequestDispatcher("edit.jsp");
      dispatcher.include(request, response);
      printWriter.print("<br><h2>Payment Edited Successfully!!</h2>");
    }
    
    
    if (request.getParameter("Action").equals("Delete")) {
      PrintWriter printWriter = response.getWriter();
      Payment payment = new Payment();
      PaymentDao dao = new PaymentDao();
      dao.deletePayment(Integer.parseInt(request.getParameter("id")));
      RequestDispatcher dispatcher = request.getRequestDispatcher("delete.jsp");
      dispatcher.include(request, response);
      printWriter.print("<br><h2>Payment Deleted Successfully!!</h2>");
    }
  }
}