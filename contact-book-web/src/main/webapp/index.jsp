<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">

    <title>Contact Book</title>
  </head>
  <body>
    <div class="py-2 bg-primary text-white text-center">
    	<h3>Contact Book Web Application</h3>
    </div>
	
	
	<a href="viewemployees">View Emp Details</a>
	
	<div class="container mt-2">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<form action="addcontact" method="post">
					
						<div class="mb-2">
							<label class="form-label">Name:</label>
							<input type="text" name="name" id="name" class="form-control" value=${contact.name}>
						</div>
						<div class="mb-2">
							<label class="form-label">Email:</label>
							<input type="email" name="email" id="email" class="form-control" value=${contact.email} >
						</div>
						<div class="mb-2">
							<label class="form-label">Mobile:</label>
							<input type="text" name="mobile" id="mobile" class="form-control" value=${contact.mobile}>
						</div>
						<div class="mb-2">
							<button class="btn btn-primary" type="submit">Add Contact</button>
						</div>
				</form>
			</div>
		</div>
	</div>
    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-eMNCOe7tC1doHpGoWe/6oMVemdAVTMs2xqW4mwXrXsW0L84Iytr2wi5v2QjrP/xp" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.min.js" integrity="sha384-cn7l7gDp0eyniUwwAZgrzD06kc/tftFf19TOAs2zVinnD/C7E91j9yyk5//jjpt/" crossorigin="anonymous"></script>
    -->
  </body>
</html>