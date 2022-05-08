
<jsp:include page="admin_header.jsp" ></jsp:include>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#ffffff">
  <form action="MyServlet" method="post">
    <h1 align="center">Edit Payment</h1>
    <h1>
      <a href="index.jsp">List Payment</a>
    </h1>
    <table border="1" align="center" cellpadding="5"
      style="font-size: 100%; font-family: inherit; font-style: normal; background-color: window;">
      <tr>
        <td>Enter Payment ID</td>
        <td><input type="text" name="id" required></td>
      </tr>
      <tr>
        <td>Enter Customer First Name</td>
        <td><input type="text" name="fname" required></td>
      </tr>
      <tr>
        <td>Enter Customer Last Name</td>
        <td><input type="text" name="lname" required></td>
      </tr>
      <tr>
        <td>Enter Card type</td>
        <td><input type="text" name="ctype" required></td>
      </tr>
       <tr>
        <td>Enter Card Number</td>
        <td><input type="text" name="cnumber" required></td>
      </tr>
       <tr>
        <td>Enter Expire month of card</td>
        <td><input type="text" name="exmonth" required></td>
      </tr>
       <tr>
        <td>Enter Expire year of card</td>
        <td><input type="text" name="exyear" required></td>
      </tr>
       <tr>
        <td>Enter CVN number</td>
        <td><input type="text" name="cvn" required></td>
      </tr>
       <tr>
        <td>Enter Total Payment</td>
        <td><input type="text" name="tot" required></td>
      </tr>
      <tr>
        <td></td>
        <td align="center"><input type="submit" name="Action"
          value="Edit"></td>
      </tr>
    </table>
  </form>
</body>
</html>