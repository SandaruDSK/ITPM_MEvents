<%@page import="com.contactusAdmin.ContactusAdmin"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:include page="admin_header.jsp" ></jsp:include>


		<div class="block-title">
			<h2><strong>Inquiry List</strong></div>
		
		<table class="table table-vcenter table-striped table-condensed" id="table_id">
			  <thead>
      <tr>
      	<th> ID </th>
        <th> Name</th>
         <th>Contact Number</th>
         <th> Email</th>
         <th> Message</th>
            
        
      </tr>
    </thead>
			<tbody> 
				<%

			    	List<com.contactusAdmin.ContactusAdmin> PL= (List<com.contactusAdmin.ContactusAdmin>)request.getAttribute("PL");
			    	for(int x =0; x<PL.size(); x++)
			    	{
		    	%>
			    	<tr>
			    	<td><%=PL.get(x).getId() %></td>
			        <td><%=PL.get(x).getName() %></td>
			        <td><%=PL.get(x).getContactnumber() %></td>
			         <td><%=PL.get(x).getEmail() %></td>
			          <td><%=PL.get(x).getMessage() %></td>
			        <td></td>      
			        <td></td>
			        <td></td>
		       
		             <td><a href="ViewAllContactUsDetails?did=<%=PL.get(x).getId() %>" class="btn btn-danger btn-xs" onclick="myFunction()"><i class="fa fa-trash-o"></i> Hide </a></td>
		          
		        
		        
		      </tr>
		    <%		
		    	}
		    %>

		     
					</tbody>
				</table>
<script>
function myFunction() {
  alert("Your message sucsessfully inserted.We will contact with you");
}
</script>

		<jsp:include page="admin_footer.jsp" ></jsp:include>