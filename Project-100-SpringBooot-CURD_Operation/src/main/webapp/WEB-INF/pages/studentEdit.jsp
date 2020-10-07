<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style ="color:cyan;text-align:center">EDIT Page</h1>
<form:form action="update" method="POST" modelAttribute="student">
<pre>
ID:<form:input path="stdId" readonly="true"/>
NAME:<form:input path="stdName"/>
GENDER:
		<form:radiobutton path="stdGen" value="male"/>male
		<form:radiobutton path="stdGen" value="female"/>female
PASSWORD:<form:password path="stdPwd"/>
COURSE:<form:select path="stdCourse">
			<form:option value="">-SELECT-</form:option>
			<form:option value="JAVA">JAVA</form:option>
			<form:option value="SPRING">SPRING</form:option>
			<form:option value="ORACLE">ORACLE</form:option>
			<form:option value="SPRING-BOOT">SPRING-BOOT</form:option>
			<form:option value="REST-SERVICE">REST-SERVICE</form:option>
			<form:option value="ANGULAR">ANGULAR</form:option>
		</form:select>
ADDRESS:<form:textarea path="stdAddrs"/>
LANGUAGES:
		  <form:checkbox path="stdLangs" value="ENG"/>ENG		
		  <form:checkbox path="stdLangs" value="HINDI"/>HINDI		
		  <form:checkbox path="stdLangs" value="ODIA"/>ODIA		
		  <form:checkbox path="stdLangs" value="TELGU"/>TELGU		
		  <form:checkbox path="stdLangs" value="TAMIL"/>TAMIL
		  <input type="submit" value="update"/>		
</pre>
</form:form>
${message }
</body>
</html>