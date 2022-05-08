<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="client_header.jsp" ></jsp:include>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#ffffff">
  <form action="MyServlet" method="post">
    <h1 align="center">Payment</h1>
    <h1>
      <a href="index.jsp">List Payment</a>
    </h1>
    <table border="1" align="center" cellpadding="5"
      style="font-size: 100%; font-family: inherit; font-style: normal; background-color: window;">
      <tr>
        <td>First Name</td>
        <td><input type="text" name="fname"></td>
      </tr>
      <tr>
        <td>Last Name</td>
        <td><input type="text" name="lname"></td>
      </tr>
      <tr>
        <td>Card Type</td>
        <td><input type="text" name="ctype"></td>
      </tr>
      <tr>
        <td>Card Number</td>
        <td><input type="text" name="cnumber"></td>
      </tr>
      <tr>
        <td>Expire Month</td>
        <td><input type="text" name="exmonth"></td>
      </tr>
       <tr>
        <td>Expire Year</td>
        <td><input type="text" name="exyear"></td>
      </tr>
       <tr>
        <td>CVN number</td>
        <td><input type="text" name="cvn"></td>
      </tr>
       <tr>
        <td>Total Payment</td>
        <td><input type="text" name="tot"></td>
      </tr>
      <tr>
        <td></td>
        <td><input type="submit" name="Action" value="Add Payment"></td>
      </tr>
    </table>
  </form>
  
  <jsp:include page="client_footer.jsp" ></jsp:include>
  
</body>
</html>