package servlet;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

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

/**
 * Servlet implementation class Addevent
 */
@WebServlet("/AddEvent")
public class AddEvent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEvent() {
        super();
        // TODO Auto-generated constructor stub
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		model.Events_model pr= new model.Events_model();
		
		FileItem fi=null;
		String file_name = "C:\\img\\";
		
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

				 if (fileItem.getFieldName().equals("event_name")) {
					 pr.setEvent_name(fileItem.getString()) ;
				 }
				 if (fileItem.getFieldName().equals("type")) {
					 pr.setType(fileItem.getString()) ;
				 }
				 if (fileItem.getFieldName().equals("type2")) {
					 pr.setType2(fileItem.getString()) ;
				 }
				 if (fileItem.getFieldName().equals("city")) {
					 pr.setCity(fileItem.getString()) ;
				 }
				 if (fileItem.getFieldName().equals("pay_plan")) {
					 pr.setPay_plan(fileItem.getString()) ;
				 }
				 if (fileItem.getFieldName().equals("price")) {
					 pr.setAmount((Double.parseDouble(fileItem.getString()))) ;
				 }
				 
				 if (fileItem.getFieldName().equals("description")) {
					 pr.setDescription(fileItem.getString()) ;
				 }
				 if (fileItem.getFieldName().equals("cont_name")) {
					 pr.setCont_name(fileItem.getString()) ;
				 }
				 if (fileItem.getFieldName().equals("cont_phone")) {
					 pr.setCont_phone(fileItem.getString()) ;
				 }
				 if (fileItem.getFieldName().equals("feature_1")) {
					 pr.setFeature_1(fileItem.getString()) ;
				 }
				 if (fileItem.getFieldName().equals("feature_2")) {
					 pr.setFeature_2(fileItem.getString()) ;
				 }
				 if (fileItem.getFieldName().equals("feature_3")) {
					 pr.setFeature_3(fileItem.getString()) ;
				 }
				 if (fileItem.getFieldName().equals("feature_4")) {
					 pr.setFeature_4(fileItem.getString()) ;
				 }
				 if (fileItem.getFieldName().equals("link")) {
					 pr.setLink(fileItem.getString()) ;
				 }
				
				 else {
					 
				 }
			 
		 } 
		 }
		 
		 service.Events p= new service.Events();
		 int xid=p.addEvent(pr);
		 
		 
		 it = fields.iterator();
		 while (it.hasNext()) {
			 FileItem fileItem = it.next();
			 boolean isFormField = fileItem.isFormField();
			 if (isFormField) {

					
			 } else {
			 if (fileItem.getSize() > 0) {
				 fi=fileItem;
				 in++;
				 fi.write(new File(file_name+xid+"_"+in+".jpg"));
			 }
			 }
			 }
		 
		
		 
		 } catch (Exception e) {
		 e.printStackTrace();
		 }
		
		
		
		
		
		 response.sendRedirect("add_event.jsp?s=1");
        
     
        

    }
		
			}


