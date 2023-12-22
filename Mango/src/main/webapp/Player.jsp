<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Player page....</title>
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
			<li class="nav-item"><a class="nav-link" href="Vendor,jsp">
					Vendor</a></li>
			<li class="nav-item"><a class="nav-link" href="register.html">Airpot</a></li>
		</ul>
	</nav>
	<h1>This is Player Page...</h1>
	
	<form action="player" method="post">
	Name <input type="text" name="name"/><br>
	Sport <input type="text" name="sport"/><br>
	Country <input type="text" name="country"/><br>
	Married <input type="text" name="married"/><br>
	wife <input type="text" name="wife"/><br>
    Gender <input type="text" name="gender"/><br>
    DOB <input type="text" name="dob"/><br>
    Father <input type="text" name="father"/><br>
    JerseyNo <input type="text" name="jersey"/><br>
    CapatinName <input type="text" name="captain"/><br>
    CoachName <input type="text" name="coach"/><br>
    Age <input type="text" name="age"/><br>
    Mother <input type="text" name="mother"/><br>
    Alive <input type="text" name="alive"/><br>
    <button type="submit" value="Send" class="btn btn-danger btn-lg">Send</button>
    </form>
<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</body>
</html>