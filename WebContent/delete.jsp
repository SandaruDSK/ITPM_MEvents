

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
  <h1>Delete Payment</h1>
  <h1>
    <a href="index.jsp">List Payments</a>
  </h1>
  <form action="MyServlet" method="post">
    Enter ID<input type="text" name="id"> <input type="submit"
      value="Delete" name="Action">
  </form>
</body>
</html>