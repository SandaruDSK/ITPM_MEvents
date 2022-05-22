<%@page import="model.Events_model"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
		String driver = "com.mysql.jdbc.Driver";
		String connectionUrl = "jdbc:mysql://localhost:3306/";
		String database = "event_plan";
		String userid = "root";
		String password = "";
		String search=request.getParameter("search");
		try {
		Class.forName(driver);
		} catch (ClassNotFoundException e) {
		e.printStackTrace();
		}
			Connection connection = null;
			Statement statement = null;
			ResultSet resultSet = null;
%>
<jsp:include page="admin_header.jsp" ></jsp:include>


		<div class="block-title">
			<h2><strong>Search Results</strong></div>
	
		<table class="table table-vcenter table-striped table-condensed" id="table_id">
		
			
			  <thead>
			 
      <tr>
    	<th> ID </th>
        <th> Name</th>
        <th> Arrangement</th>
        <th> Type</th>
        <th>City</th>
        <th>Amount</th>
        <th>Contact Person</th>
        <th>Contact Mobile</th>
        <th> Featured</th>
        <th> Listed</th>
        <th></th>
             
            
</tr>
<%
try{
		connection = DriverManager.getConnection(connectionUrl+database, userid, password);
		statement=connection.createStatement();
		String sql ="select * from events where event_name like '%"+search+"%' ";
		resultSet = statement.executeQuery(sql);
		while(resultSet.next()){
	%>
	<tr>
			<td><%=resultSet.getString("e_id") %></td>
			<td><%=resultSet.getString("event_name") %></td>
			<td><%=resultSet.getString("type") %></td>
			<td><%=resultSet.getString("type2") %></td>
			<td><%=resultSet.getString("city") %></td>
		    <td><%=resultSet.getString("price") %></td>
		    <td><%=resultSet.getString("cont_name") %></td>
			<td><%=resultSet.getString("cont_phone") %></td>
			<td><%=resultSet.getString("featured") %></td>
			<td><%=resultSet.getString("listed") %></td>
	</tr>
	<%
		}
			connection.close();
			} catch (Exception e) {
				e.printStackTrace();
		}
		%> 
		
<input type="button" id="btnExport" value="Export to PDF" onclick="Export()" />
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
    </table>
<jsp:include page="admin_footer.jsp" ></jsp:include>