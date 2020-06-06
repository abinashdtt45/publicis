<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Page</title>
</head>
<body>
	<div class="container">
		<table>
			<tr>
				<th>Employee ID</th>
				<th>Employee Name</th>
				<th>Employee Role</th>
			</tr>
			  
			<c:forEach var="i" items="${EMPLOYEES}">
				<tr>
					<td>${i.empId}</td>
					<td>${i.name}</td>
					<td>${i.role}</td>
				</tr>
			</c:forEach>
		
		</table>
	</div>

</body>
</html>