<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Vendor Page.....</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar bg-primary" data-bs-theme="dark">
		<ul class="nav justify-content-center">
			<li class="nav-item"><a class="nav-link" href="index.html">Home</a></li>
			<li class="nav-item"><a class="nav-link" href="Product.jsp">Prorduct</a></li>
			<li class="nav-item"><a class="nav-link" href="register.html">Player</a></li>
			<li class="nav-item"><a class="nav-link" href="register.html">Airpot</a></li>
		</ul>
	</nav>
	<form action="vendor" method="post">
		Name <input type="text" name="name" /><br> GST <input
			type="text" name="gst" /><br> Owner <input type="text"
			name="owner" /><br> Location <input type="text" name="location" />
		<button type="submit" value="Send" class="btn btn-danger btn-lg">Send</button>
	</form>

	<script>
		src = "https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity = "sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin = "anonymous">
	</script>
</body>
</html>