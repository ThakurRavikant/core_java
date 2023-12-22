<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Food page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
	

</head>
<body>
	<nav class="navbar bg-primary" data-bs-theme="dark">
		<ul class="nav justify-content-center">
			<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
	</nav>
	<h1>Enter Food Details..</h1>
	<form action="food" method="post">
		<div class="col-md-6">
			<label for="validationDefault03" class="form-label">Name</label> <input
				type="text" class="form-control" id="validationDefault03" required>
		</div>
		<div class="col-md-3">
			<label for="validationDefault04" class="form-label">Type</label> <select
				class="form-select" id="validationDefault04" required>
				<option selected disabled value="">Choose...</option>
				<option>Veg</option>
				<option>Non-Veg</option>
			</select>
		</div>
		<div class="col-md-3">
			<label for="validationDefault04" class="form-label">Hotel</label> <select
				class="form-select" id="validationDefault04" required>
				<option selected disabled value="">Choose...</option>
				<option>Mandiya</option>
				<option>Taj</option>
			</select>
		</div>
		<div class="col-md-6">
			<label for="validationDefault03" class="form-label">Price</label> <input
				type="text" class="form-control" id="validationDefault03" required>
		</div>
		<div class="col-md-3">
			<label for="validationDefault04" class="form-label">Qauntity</label> <select
				class="form-select" id="validationDefault04" required>
				<option selected disabled value="">Choose...</option>
				<option>1</option>
				<option>2</option>
				
			</select>
		</div>

		<div class="col-12">
			<div class="form-check">
				<input class="form-check-input" type="checkbox" value=""
					id="invalidCheck2" required> <label
					class="form-check-label" for="invalidCheck2"> Agree to
					terms and conditions </label>
			</div>
		</div>

		<button type="submit" value="Send" class="btn btn-info">Send</button>
	</form>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>