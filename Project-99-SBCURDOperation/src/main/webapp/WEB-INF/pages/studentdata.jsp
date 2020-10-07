<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Student Data</title>
</head>
<link href="https://cdn.datatables.net/1.10.22/css/jquery.dataTables.min.css" rel="stylesheet" type="text/css">
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.min.js"></script>
<script>
$(document).ready(function() {
    $('#stdTable').DataTable( {
        "pagingType": "full_numbers"
    } );
} );
function deleteConfirm(){
	return confirm("Are you sure,you want to delete?");
	}
</script>
<body>
<%@include file="menu.jsp" %>
	<h1 style="color:text-align:center">WelCome to All Student </h1>
	<table border="2"  background="yellow" id="stdTable" bgcolor="orange">
	<tr bordercolor="red">
		<th>ID</th>	
		<th>NAME</th>	
		<th>GENDER</th>	
		<!-- <th>PASSWORD</th> -->	
		<th>COURSE</th>	
		<th>ADDRESS</th>
		<th>LANGUAGE</th>
		<th>OPERATION</th>	
	</tr>
	<c:forEach items="${list }" var="ob">
		<tr bordercolor="red">
			<td>${ob.stdId }</td>
			<td>${ob.stdName }</td>
			<td>${ob.stdGen }</td>
			<%-- <td>${ob.stdPwd }</td> --%>
			<td>${ob.stdCourse }</td>
			<td>${ob.stdAddrs }</td>
			<td>${ob.stdLangs }</td>
			<td>
				<a href="delete?id=${ob.stdId }" onclick="deleteConfirm()">Delete</a>
				<a href="edit?id=${ob.stdId }">EDIT</a>
				</td>
		</tr>
	</c:forEach>		
	</table>	
</body>
</html>