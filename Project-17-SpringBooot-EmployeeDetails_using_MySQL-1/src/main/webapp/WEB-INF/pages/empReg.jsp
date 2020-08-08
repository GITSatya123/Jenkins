<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    

<h1 style ="color:red;text-align:center">WELCOME TO EMPLOYEE REGISTER PAGE</h1>
<form:form action="save" method="POST" modelAttribute="emp">
<pre>
EMP-NAME:<form:input path="empName"/>
GENDER:
	<form:radiobutton path="gender" value="male"/>male	
	<form:radiobutton path="gender" value="female"/>female	
AGE:<form:input path="age"/>
EMP-DEPT:<form:select path="empDept">
			<form:option value="">-SELECT-</form:option>
			<form:option value="DEV">DEV</form:option>
			<form:option value="QA">QA</form:option>
			<form:option value="UAT">UAT</form:option>
			<form:option value="DEVOPS">DEVOPS</form:option>
		</form:select>
EMP-DESG:<form:select path="empDesg">
			<form:option value="">-SELECT-</form:option>
			<form:option value="DEVELOPER">DEVELOPER</form:option>
			<form:option value="TL">TL</form:option>
			<form:option value="MANAGER">MANAGER</form:option>
			<form:option value="PM">PM</form:option>
		</form:select>		
EMPADDRS:<form:textarea path="empAddrs"/>
EMP-LANGUAGE:
			<form:checkbox path="empLangs" value="ENG"/>ENG
			<form:checkbox path="empLangs" value="HINDI"/>HINDI
			<form:checkbox path="empLangs" value="ODIA"/>ODIA
			<form:checkbox path="empLangs" value="TELUGU"/>TELUGU
EMP-PROJECT:
			<form:checkbox path="empProj" value="P1"/>P1			
			<form:checkbox path="empProj" value="P2"/>P2			
			<form:checkbox path="empProj" value="P3"/>P3			
			<form:checkbox path="empProj" value="P4"/>P4			
			<form:checkbox path="empProj" value="P5"/>P5	
			<input type="submit" value="register"/>		
</pre>
</form:form>
${message}