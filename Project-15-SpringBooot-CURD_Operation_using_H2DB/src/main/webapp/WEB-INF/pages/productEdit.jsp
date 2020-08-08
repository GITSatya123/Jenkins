<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Product</title>
</head>
<body>
<form action="update" method="POST">
ProductID:<input type="text" name="prodId" value="${pob.prodId }" readonly="readonly"/></br>
ProductName:<input type="text" name="ProdName" value="${pob.prodName }"/></br>
ProductCost:<input type="text" name="prodCost" value="${pob.prodCost }"/></br>
			<input type="submit" value="update"/>
</form>
${info }
</body>
</html>