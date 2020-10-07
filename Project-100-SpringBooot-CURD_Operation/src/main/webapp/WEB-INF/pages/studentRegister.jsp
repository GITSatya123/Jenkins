<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
    
<!DOCTYPE h
tml>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<meta charset="ISO-8859-1">
<title>Register page</title>
<style type="text/css">
.err{
	color:red;
	}
</style>
</head>
<body>
<%@include file="menu.jsp" %>
	<h1 style ="color:red;text-align:center">Welcome to Student Register page</h1>
<form:form action="save" method="POST" modelAttribute="student">
<pre>
NAME:<form:input path="stdName" /><span id="stdNameErr"></span>
<form:errors path="stdName" cssClass="err"/>
GENDER:
		<form:radiobutton path="stdGen" value="male"/>male
		<form:radiobutton path="stdGen" value="female"/>female
		<form:errors path="stdGen" cssClass="err"/>
PASSWORD:<form:password path="stdPwd"/>
		 <form:errors path="stdPwd" cssClass="err"/>
COURSE:<form:select path="stdCourse">
			<form:option value="">-SELECT-</form:option>
			<form:option value="JAVA">JAVA</form:option>
			<form:option value="SPRING">SPRING</form:option>
			<form:option value="ORACLE">ORACLE</form:option>
			<form:option value="SPRING-BOOT">SPRING-BOOT</form:option>
			<form:option value="REST-SERVICE">REST-SERVICE</form:option>
			<form:option value="ANGULAR">ANGULAR</form:option>
		</form:select>
		<form:errors path="stdCourse" cssClass="err"/>
ADDRESS:<form:textarea path="stdAddrs"/>
		<form:errors path="stdAddrs" cssClass="err"/>
LANGUAGES:
		  <form:checkbox path="stdLangs" value="ENG"/>ENG		
		  <form:checkbox path="stdLangs" value="HINDI"/>HINDI		
		  <form:checkbox path="stdLangs" value="ODIA"/>ODIA		
		  <form:checkbox path="stdLangs" value="TELGU"/>TELGU		
		  <form:checkbox path="stdLangs" value="TAMIL"/>TAMIL
		  <form:errors path="stdLangs" cssClass="err"/>
		  <input type="submit" value="register"/>	
		  	
</pre>
</form:form>
${message }
<script type="text/javascript">
$(document).ready(function(){
	$("#stdName").change(function(){
		$.ajax({
			url: 'checkName',
			data {stdName: $("#stdName").val()},
			success:function(resTxt){
				if(resTxt!=""){
					$("#stdNameErr").show();
					$("#stdNameErr").text(resTxt);
					$("#stdNameErr").css("color","red");
					$("#stdName").val('');
					}else{
						$("#stdNameErr").hide();
					}
				}
			});
			
		});
});
</script>
</body>
</html>