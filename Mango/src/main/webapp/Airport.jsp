<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Airpot Page.....</title>
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
			<li class="nav-item"><a class="nav-link" href="Product.jsp">Product</a></li>
			
		</ul>
	</nav>
	<h1>This is Airpot Page....!</h1>
	<form action="airport" method="post">
		Name <input type="text" name="name" /> <br>
		Country <input type="text" name="country" /> <br> 
		Type <input type="text" name="type" /> <br>
		City <input type="text" name="city" /> <br>
		Capacity <input type="text" name="capacity" /> <br>
		Width <input type="text" name="width" /> <br>
		Terminal <input type="text" name="terminal"/> <br>
		OpenDate <input type="date" name="opendate"/> <br>
		Operational <input type="text" name="operational"/> <br>
		Inaugurated <input type="text" name="inaugrated"/> <br>
		<button type="submit" value="Send" class="btn btn-info">Send</button>
	</form>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>