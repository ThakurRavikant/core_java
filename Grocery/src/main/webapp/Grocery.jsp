<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: 'Poopins', sans-serif;
}

body {
	background-color: #dc143c22;
}
</style>

</head>

<body>

	<form action="save" method="post">

		<div class="col-md-6 position-absolute  top-50 end-0 translate-middle-y">
			<h1>Enter Details of Grocery...</h1>
			<label for="validationServer03" class="form-label">Name</label> <input
				type="text" name="name" class="form-control is-invalid"
				id="validationServer03"
				aria-describedby="validationServer03Feedback" required>
			<div id="validationServer03Feedback" class="invalid-feedback">
			</div>

			<div class="col-md-6">
				<label for="validationServer03" class="form-label">Price</label> <input
					type="text" name="price" class="form-control is-invalid"
					id="validationServer03"
					aria-describedby="validationServer03Feedback" required>
				<div id="validationServer03Feedback" class="invalid-feedback">
				</div>
			</div>

			<div class="col-md-6">
				<label for="validationServer03" class="form-label">Quantity</label>
				<input type="text" name="quantity" class="form-control is-invalid"
					id="validationServer03"
					aria-describedby="validationServer03Feedback" required>
				<div id="validationServer03Feedback" class="invalid-feedback">
				</div>
			</div>

			<div class="col-md-6">
				<label for="validationServer04" class="form-label">Type</label> <select
					class="form-select is-invalid" name="type" id="validationServer04"
					aria-describedby="validationServer04Feedback" required>
					<option selected disabled value="">Choose...</option>
					<option>Fruits</option>
					<option>Brush</option>
					<option>vegs</option>
					<option>Dal</option>
					<option>Other</option>
				</select>

				<div class="col-12">
					<div class="form-check">
						<input class="form-check-input is-invalid" type="checkbox"
							value="" id="invalidCheck3"
							aria-describedby="invalidCheck3Feedback" required> <label
							class="form-check-label" for="invalidCheck3"> Agree to
							terms and conditions </label>
						<div id="invalidCheck3Feedback" class="invalid-feedback">
							You must agree before submitting.</div>
					</div>
				</div>
				<div class="col-12">
					<button class="btn btn-primary" type="submit">Submit form</button>
				</div>
	</form>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>