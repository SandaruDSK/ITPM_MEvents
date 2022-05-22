<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://127.0.0.1:3306/";
String database = "itpm_mevents";
String userid = "root";
String password = "";
String id=request.getParameter("id");

try {
	Class.forName(driver);
} catch (ClassNotFoundException e) {
	e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
  		.navbar.navbar-default {
			display: block;
		}
		
		.block{
			background-color: transparent !important;
    		border: none !important;
		}
</style>

</head>
<body>
<jsp:include page="admin_header.jsp" ></jsp:include>
	<h1  style="font-weight: 700;text-align: center;margin-bottom: 50px">Search Data</h1>
	
	<table class="table table-vcenter table-striped table-condensed" id="table_id">
		<tr>
			<th> ID </th>
        	<th> Name</th>
	         <th>Contact Number</th>
	         <th> Email</th>
	         <th> Message</th>	
		</tr>
		
		<%
			try{
				connection = DriverManager.getConnection(connectionUrl+database, userid, password);
				statement=connection.createStatement();
				String sql ="select * from contact_us where id ="+id+"' ";
				resultSet = statement.executeQuery(sql);
				while(resultSet.next()){
		%>
				<tr>
					<td><%=resultSet.getString("id") %></td>
					<td><%=resultSet.getString("name") %></td>
					<td><%=resultSet.getString("contactnumber") %></td>
					<td><%=resultSet.getString("email") %></td>
					<td><%=resultSet.getString("message") %></td>
				</tr>
		<%
				}
					connection.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		%>
	</table>
	
<jsp:include page="admin_footer.jsp" ></jsp:include>
</body>
</html>