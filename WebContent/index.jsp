<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.DBconnection"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    
    <jsp:include page="admin_header.jsp" ></jsp:include>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Management</title>
</head>
<style>
<!--
a {
  text-decoration: none;
}
-->
</style>
<body bgcolor="#ffffff">
  <form action="">
    <h1 align="center">Payment Management</h1>
    <br><br>
    <!--  All Payment shows-->
    <h1 align="center">List of Payment</h1>
    <table border="1" align="center" cellpadding="130"
      style="font-size: 120%; font-family: inherit; font-style: normal; background-color: window;">
      <tr>
        <th>ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Card Type</th>
        <th>Card number</th>
        <th>Expire Month of card</th>
        <th>Expire Year of card</th>
        <th>CVN number</th>
        <th>Total Payment</th>
      </tr>
      <%
        Connection con = DBconnection.getConn();
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("Select * from payment");
        while (resultSet.next()) {
      %>
      <tr>
        <td>
          <%
            out.print(resultSet.getInt(1));
          %>
        </td>
        <td>
          <%
            out.print(resultSet.getString(2));
          %>
        </td>
        <td>
          <%
            out.print(resultSet.getString(3));
          %>
        </td>
        <td>
          <%
            out.print(resultSet.getString(4));
          %>
        </td>
        <td>
          <%
            out.print(resultSet.getInt(5));
          %>
        </td>
        <td>
          <%
            out.print(resultSet.getInt(6));
          %>
        </td>
         <td>
          <%
            out.print(resultSet.getInt(7));
          %>
        </td>
         <td>
          <%
            out.print(resultSet.getInt(8));
          %>
        </td>
         <td>
          <%
            out.print(resultSet.getDouble(9));
          %>
        </td>
        <form action="MyServlet" method="post">
          <td><a value="Edit" name="Action"
            href="edit.jsp?id=<%=resultSet.getInt(1)%> ">Edit</a> <input
            type="hidden" name="j" value="<%= resultSet.getInt(1) %>">&nbsp;&nbsp;&nbsp;
            <a href="delete.jsp">Delete</a>&nbsp;&nbsp;&nbsp;</td>
      </tr>
      </form>
      <%
}
%>

 
  
    </table>
  </form><br><br>
  <h2 align="center">
      <a href="addPayment.jsp">Add Payment</a><br>
    </h2>
    
   


    
   <jsp:include page="client_footer.jsp" ></jsp:include>
</body>
</html>