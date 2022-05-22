<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Search Example</title>
  	<meta charset="utf-8">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
  	
  	<style>
  		.navbar.navbar-default {
			display: block;
		}
		
		.block{
			background-color: transparent !important;
    		border: none !important;
		}
</style>
  	<style>
		
	</style>
</head>
<body>
<jsp:include page="admin_header.jsp" ></jsp:include>
	<div class="container">
	
	<h1 style="font-weight: 700;text-align: center;margin-bottom: 50px">Search Inquries</h1>
	  <form class="form-inline" method="post" action="search.jsp">
	    <input type="text" name="id" class="form-control" placeholder="Search roll no..">
	    <button style="margin-left: 20px;" type="submit" name="save" class="btn btn-primary">Search</button>
	  </form>
	</div>
	
<jsp:include page="admin_footer.jsp" ></jsp:include>
</body>
</html>

