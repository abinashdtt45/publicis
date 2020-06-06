<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
</head>
<body>
	<h1>Hi This is the home page</h1>
	<c:out value="${message}"></c:out><br>
	<a href="/DemoServlet/getEmployees">Click here for the employees</a><br>
	<a href="/DemoServlet/getCustomers">Click here for the customers</a><br>
	<a href="/DemoServlet/getProducts">Click here for the products</a><br>
</body>
</html>