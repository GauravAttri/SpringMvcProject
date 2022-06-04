<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}
</style>
</head>
<body>
<table>
<thead>
<tr>
<th>Product Name</th>
<th>Category</th>
<th>Condition</th>
<th>Price</th> 
</tr>
<tr>
	<td>${product.productName}</td>
	<td>${product.productCategory}</td>
	<td>${product.productCondition}</td>
	<td>${product.productPrice}</td>
	
	
	
</tr>
</thead>
</table>
</body>
</html>