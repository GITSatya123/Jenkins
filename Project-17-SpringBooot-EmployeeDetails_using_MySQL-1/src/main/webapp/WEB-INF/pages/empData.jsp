<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1 style ="color:blue;text-align:center"> EMPLOYEE Details</h1>    


	<table border="2" bgcolor="cyan">
		<tr>
			<th>EmpNo</th>
			<th>EmpName</th>
			<th>Gender</th>
			<th>Age</th>
			<th>EmpDept</th>
			<th>EmpDesg</th>
			<th>EmpAddrs</th>
			<th>EmpLangs</th>
			<th>EmpProject</th>
		</tr>	
<c:forEach items="${list }" var="emp">
		<tr background="yellow" bgcolor="pink">
			<td>${emp.empNo }</td>
			<td>${emp.empName }</td>
			<td>${emp.gender }</td>
			<td>${emp.age }</td>
			<td>${emp.empDept }</td>
			<td>${emp.empDesg }</td>
			<td>${emp.empAddrs }</td>
			<td>${emp.empLangs }</td>
			<td>${emp.empProj}</td>
		</tr>
</c:forEach>			
	</table>

