<%@page import="model.Events_model"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:include page="admin_header.jsp" ></jsp:include>


		<div class="block-title">
			<h2><strong>Available Events</strong></div>
		 <form class="form-inline" method="post" action="search_results.jsp">
    <input type="text" name="search" class="form-control" placeholder="Search here..">
    <button type="submit" name="save" class="btn btn-primary">Search</button>
  </form>
		<table class="table table-vcenter table-striped table-condensed" id="table_id">
			  <thead>
      <tr>
      <th> ID </th>
        <th> Name</th>
         <th>Amount</th>
         <th> Featured</th>
         <th> Listed</th>
         <th></th>
         <th></th>
         <th></th>
         <th><th>
           <th><th>
             <th><th>
            
        
      </tr>
    </thead>
			<tbody> 
				<%

    	List<model.Events_model> PL= (List<model.Events_model>)request.getAttribute("PL");
    	for(int x =0; x<PL.size(); x++)
    	{
    %>
    	<tr>
    	<td><%=PL.get(x).getId() %></td>
        <td><%=PL.get(x).getEvent_name() %></td>
        <td><%=PL.get(x).getPrice() %></td>
         <td><%=PL.get(x).getFeatured() %></td>
          <td><%=PL.get(x).getListed() %></td>
        <td></td>      
        <td></td>
        <td></td>
       
        
             <td><a href="ViewSingleEvent?vid=<%=PL.get(x).getId() %>" class="btn btn-info btn-xs" ><i class="fa fa-info"></i> More info </a> </td>
             <td><a href="#ViewAllEvents?did=<%=PL.get(x).getId() %>" class="btn btn-info btn-xs" onclick="myFunction()"><i class="fa fa-telegram"></i> Feature </a></td>
             <td><a href="#ViewAllEvents?did=<%=PL.get(x).getId() %>" class="btn btn-info btn-xs" onclick="myFunction()"><i class="fa fa-check"></i> List </a></td>
              <td><a href="UpdateEvent?uid=<%=PL.get(x).getId() %>" class="btn btn-info btn-xs" ><i class="fa fa-pencil"></i> Update </a> </td>
             <td><a href="ViewAllEvents?did=<%=PL.get(x).getId() %>" class="btn btn-danger btn-xs" onclick="myFunction()"><i class="fa fa-trash-o"></i> Hide </a></td>
          
        
        
      </tr>
    <%		
    	}
    %>

     
			</tbody>
		</table>
 <input type="button" id="btnExport" value="Export" onclick="Export()" />
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.22/pdfmake.min.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/html2canvas/0.4.1/html2canvas.min.js"></script>
    <script type="text/javascript">
        function Export() {
            html2canvas(document.getElementById('table_id'), {
                onrendered: function (canvas) {
                    var data = canvas.toDataURL();
                    var docDefinition = {
                        content: [{
                            image: data,
                            width: 500
                        }]
                    };
                    pdfMake.createPdf(docDefinition).download("Event List.pdf");
                }
            });
        }
    </script>
	<script>
function myFunction() {
  alert("Event will no longer apper in Website");
}
</script>
<jsp:include page="admin_footer.jsp" ></jsp:include>