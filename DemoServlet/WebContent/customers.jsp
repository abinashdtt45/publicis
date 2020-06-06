<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Page</title>
</head>
<body>
	<div class="container">
		<table>
			<tr>
				<th>Customer Name</th>
			</tr>
			  
			<c:forEach var="i" items="${CUSTOMERS}">
				<tr>
					<td>${i.name}</td>
				</tr>
			</c:forEach>
		
		</table>
	</div>

</body>
</html>