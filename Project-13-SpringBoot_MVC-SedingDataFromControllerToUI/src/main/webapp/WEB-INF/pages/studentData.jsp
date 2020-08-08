<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <%-- <h1 style ="color:red;text-align:center">Student details</h1>
    ${sid},${sname },${age},${gender} --%>
    
    <h1 style ="color:red;text-align:center">Student details</h1>
    ${list} , ${map }
   	<%-- <c:forEach items="${map }" var="ob">
   	${ ob.key} - ${ob.value }   	
   	</c:forEach>
   	
   	<c:forEach items="${list }" var="ob">
   	${ob }
   	
   	</c:forEach> --%>