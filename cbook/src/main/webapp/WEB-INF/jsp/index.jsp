<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Book Application</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
	crossorigin="anonymous">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	
</head>
<body>

	<div class="py-2 text-center bg-primary text-white">
		<h3>Contact Book Application</h3>

	</div>
	<div class="container mt-2">

		<div class="row">

			<div class="col-md-6 offset-md-3">
				<div class="btn btn-primary" style="float:right">Add New Contact</div>
				<form action="index">
					<select name="pageSize" onchange="this.form.submit()">
						<option selected="selected" value=${psize}>${psize}</option>
						<option value="50">50</option>
						<option value="100">100</option>
					</select>
				</form>
				<table class="table">
					<tr>
						<th>#</th>
						<th>Name</th>
						<th>Email</th>
						<th>Mobile</th>
						<th>Age</th>
						<th>Edit</th>
						<th>Delete</th>
						<th>More</th>
					</tr>

					<c:forEach items="${page.content}" var="contact" varStatus="i">
						<tr>
							<td>${i.index+1}</td>
							<td>${contact.name}</td>
							<td>${contact.email}</td>
							<td>${contact.mobile}</td>
							<td>${contact.age}</td>
							<td><i class="fa fa-edit"></i></td>
							<td><i class="fa fa-trash"></i></td>
							<td><a href="">More...</a></td>
						</tr>


					</c:forEach>
				</table>
				<nav aria-label="...">
					<ul class="pagination pagination-sm">

						<c:forEach begin="1" end="${page.totalPages}" var="pageNum">
							<li class="page-item" aria-current="page"><span
								class="page-link"><a href="index?pageNumStr=${pageNum}">${pageNum}</a></span></li>
						</c:forEach>


					</ul>
				</nav>
			</div>

		</div>

	</div>



	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ"
		crossorigin="anonymous"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->
	<!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-W8fXfP3gkOKtndU4JGtKDvXbO53Wy8SZCQHczT5FMiiqmQfUpWbYdTil/SxwZgAN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.min.js" integrity="sha384-skAcpIdS7UcVUC05LJ9Dxay8AXcDYfBJqt1CJ85S/CFujBsIzCIv+l9liuYLaMQ/" crossorigin="anonymous"></script>
    -->
</body>
</html>