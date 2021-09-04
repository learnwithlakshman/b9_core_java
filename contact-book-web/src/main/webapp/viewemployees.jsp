<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>

	<c:forEach  var="p" step="1" begin="1" end="${page.total/page.size}">
			${p}
	</c:forEach>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Gender</th>
			<th>Salary</th>
		</tr>


		<c:forEach items="${page.data}" var="emp">
			<tr>
				<td>${emp.id}</td>
				<td>${emp.name}</td>
				<td>${emp.email}</td>
				<td>${emp.gender}</td>
				<td>${emp.salary}</td>
			</tr>


		</c:forEach>
	</table>
</body>
</html>