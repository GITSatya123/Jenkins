<%@page import="com.sun.xml.bind.v2.schemagen.xmlschema.Import"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>product-data page</title>
</head>
<body>
<%@include file="menu.jsp"  %>
<h1 style ="color:blue;text-align:center">Product-Details</h1>

<table border="2" bgcolor="cyan">
	<tr bgcolor="pink" bordercolor="red" background="pink">
		<th>Id</th>
		<th>Name</th>
		<th>Cost</th>
		<th>Discount</th>
		<th>GST</th>
		<th>Operation</th>
	</tr>
	<c:forEach items="${list }" var="ob">
	 <tr>
	 	<td>${ob.prodId }</td>	
	 	<td>${ob.prodName }</td>	
	 	<td>${ob.prodCost }</td>	
	 	<td>${ob.prodDiscount }</td>	
	 	<td>${ob.prodGst }</td>	
	 	<td>
	 		<a href="delete?id=${ob.prodId }">DELETE</a>
	 		<a href="edit?id=${ob.prodId }">EDIT</a>
	 	</td>
	 </tr>
	</c:forEach>
</table>
</body>
</html>