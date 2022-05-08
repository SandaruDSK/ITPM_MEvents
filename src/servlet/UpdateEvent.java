package servlet;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileItemFactory;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;

import sun.print.resources.serviceui;

/**
 * Servlet implementation class UpdateEvent
 */
@WebServlet("/UpdateEvent")
public class UpdateEvent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateEvent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service.Events PS = new service.Events();
		response.setContentType("text/html");
		if (request.getParameter("uid")!= null)
		{
			model.Events_model p=PS.getEventById(Integer.parseInt(request.getParameter("uid")));
			request.setAttribute("Pro", p);
		}

		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/update_event.jsp");
		rd.forward(request, response);
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	model.Events_model pr= new model.Events_model();
		
		FileItem fi=null;
		
		 boolean isMultipartContent = ServletFileUpload.isMultipartContent(request);
		 if (!isMultipartContent) {
		 return;
		 }
		 FileItemFactory factory = new DiskFileItemFactory();
		 ServletFileUpload upload = new ServletFileUpload(factory);
		 try {
		 List < FileItem > fields = upload.parseRequest( new ServletRequestContext(request));
		 Iterator < FileItem > it = fields.iterator();
		 if (!it.hasNext()) {
		 return;
		 }
		 int in=0;
		 while (it.hasNext()) {
		 FileItem fileItem = it.next();
		 boolean isFormField = fileItem.isFormField();
		 if (isFormField) {
			 
			     if (fileItem.getFieldName().equals("eveID")) {     
			    	 pr.setId(Integer.parseInt(fileItem.getString())) ;
			 		}

				 if (fileItem.getFieldName().equals("eveName")) {     
					 pr.setEvent_name(fileItem.getString()) ;
				 }
				 if (fileItem.getFieldName().equals("eveType")) {     
					 pr.setType(fileItem.getString()) ;
				 }
				 if (fileItem.getFieldName().equals("eveType2")) {     
					 pr.setType2(fileItem.getString()) ;
				 }
				 if (fileItem.getFieldName().equals("eveCity")) {     
					 pr.setCity(fileItem.getString()) ;
				 }
				 if (fileItem.getFieldName().equals("evePayplan")) {     
					 pr.setPay_plan(fileItem.getString()) ;
				 }
				 if (fileItem.getFieldName().equals("evePrice")) {     
					 pr.setAmount((Double.parseDouble(fileItem.getString()))) ;
				 }
				 if (fileItem.getFieldName().equals("eveDescription")) {
					 pr.setDescription(fileItem.getString()) ;
				 }
				 if (fileItem.getFieldName().equals("eveContname")) {
					 pr.setCont_name(fileItem.getString()) ;
				 }
				 if (fileItem.getFieldName().equals("eveContphone")) {
					 pr.setCont_phone(fileItem.getString()) ;
				 }
				 if (fileItem.getFieldName().equals("eveFeat1")) {
					 pr.setFeature_1(fileItem.getString()) ;
				 }
				 if (fileItem.getFieldName().equals("eveFeat2")) {
					 pr.setFeature_2(fileItem.getString()) ;
				 }
				 if (fileItem.getFieldName().equals("eveFeat3")) {
					 pr.setFeature_3(fileItem.getString()) ;
				 }
				 if (fileItem.getFieldName().equals("eveFeat4")) {
					 pr.setFeature_4(fileItem.getString()) ;
				 }
				 if (fileItem.getFieldName().equals("eveLink")) {
					 pr.setLink(fileItem.getString()) ;
				 }
				
				 else {
					 
				 }
			 
		 } 
		 }
		 service.Events  p= new service.Events();
		 p.updateEvent(pr);
	
		 } catch (Exception e) {
		 e.printStackTrace();
		 }
	
		
		
		 response.sendRedirect("ViewAllEvents");
        
      response.getWriter().write("Thank you");	
        

    }
		
		
	
		
	}
	

