<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<body>
<%@include file="menu.jsp" %>
<h1 style ="color:red;text-align:center">Product-Register-Pages</h1>
<form action ="save" method="POST">
ProductID:<input type="text" name="prodId"/></br>
ProductName:<input type="text" name="ProdName"/></br>
ProductCost:<input type="text" name="prodCost"/></br>
			<input type="submit" value="register"/>
</form>
${info }
</body>
</html>