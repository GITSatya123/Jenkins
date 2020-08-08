<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1 style ="color:red;text-align:center">Details of EMPDATA</h1>

<c:forEach items="${list}" var="emp">
	<table border="2" bgcolor="cyan">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>SAL</th>
		</tr>
		<tr>
			<td>${emp.empNo }</td>	
			<td>${emp.empName }</td>	
			<td>${emp.sal }</td>	
	</table>
</c:forEach>