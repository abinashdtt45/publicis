<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Page</title>
</head>
<body>
	<div class="container">
		<table>
			<tr>
				<th>Product ID</th>
				<th>Product Name</th>
			</tr>
			  
			<c:forEach var="i" items="${PRODUCTS}">
				<tr>
					<td>${i.prodId}</td>
					<td>${i.name}</td>
				</tr>
			</c:forEach>
		
		</table>
	</div>

</body>
</html>