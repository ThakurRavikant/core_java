<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<title>Song Page</title>

<style type="text/css">
form {
	max-width: 800px;
	margin: 10px auto;
	padding: 20px;
	border: 1px solid #ccc;
	background-color: #f1c2c2;
	border-radius: 5px;
}

label {
	display: block;
	margin-bottom: 5px;
}

input[type="text"], select {
	width: 100%;
	padding: 10px;
	margin-bottom: 15px;
	border: 1px solid #161515;
	border-radius: 3px;
}

input[type="submit"] {
	background-color: black;
	color: #fff;
	padding: 10px 15px;
	border: none;
	border-radius: 3px;
	cursor: pointer;
}

select {
	width: 100%;
	padding: 10px;
	margin-bottom: 15px;
	border: 1px solid #ccc;
	border-radius: 3px;
}

input[type="submit"]:hover {
	background-color: olive;
}

.radio-btn {
	display: flex;
	align-items: center;
}

.radio-btn div {
	margin: 10px;
}
</style>
</head>
<body>
<span style="color: red"> <c:forEach var="objectError"
			items="${error}">
			${objectError.defaultMessage}<br>
		</c:forEach>
	
	</span>
	<div class="container">
		<nav class="navbar navbar-expand-lg navbar-light bg-primary">
			<div class="container-md">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="index.jsp">Home</a></li>
					</li>
				</ul>
			</div>
		</nav>
	</div>
	
	<form action="save" method="post" >
		<div class="container">
		<h1 class="text-success text-center">Form</h1>

			<h2 class="text-center">Song Information</h2>
		
			<div class="mb-3">
				<label for="name" class="form-label">Name Of Song</label> <input
					type="text" class="form-control" name="name"
					placeholder="Enter Song Name" value="${dto.getName()}"/>
					<span id="nameError" style="color: red"></span><br>
			</div>
			<div class="mb-3">
				<label for="singerName" class="form-label">SingerName </label> <input
					type="text" class="form-control" name="singer"
					placeholder="Enter Singer Name" value="${dto.getSinger()}"/>
					<span id="singerError" style="color: red"></span><br>
			</div>
			<div class="mb-3">
				<label for="singerName" class="form-label">ComposerName </label> <input
					type="text" class="form-control" name="composer"
					placeholder="Enter Composer Name" value="${dto.getComposer()}"/>
					<span id="composerError" style="color: red"></span><br>
			</div>
			<div class="mb-3">
				<label for="singerName" class="form-label">Duration </label> <input
					type="number" class="form-control" name="duration"
					placeholder="Enter Duration Name" value="${dto.getDuration()}"/>
					<span id="durationError" style="color: red"></span><br>
			</div>
			<div class="mb-3">
				<label for="singerName" class="form-label">AlbumName </label> <input
					type="text" class="form-control" name="album"
					placeholder="Enter Album Name" value="${dto.getAlbum()}"/>
					<span id="albumError" style="color: red"></span><br>
			</div>
			<div class="mb-3">
				<label for="singerName" class="form-label">Langague </label> <select
					type="text" class="form-control" name="langague"
					placeholder="Select Language">
					<option selected>Choose...</option>
					<option>Hindi</option>
					<option>Kannada</option>
					<option>Telugu</option>
					<option>Tamil</option>
					<option>English</option>
					<option>other</option>
				</select>
			</div>
			<div class="mb-3">
				<label for="singerName" class="form-label">ReleaseDate </label> 
				<input type="date" class="form-control" name="releaseDate"
					placeholder="Enter ReleaseDate Name" value="${dto.getReleaseDate()}"/>
					<span id="composerError" style="color: red"></span><br>
			</div>

			<div class="mb-3">
				<label for="singerName" class="form-label">Lyricist </label> <input
					type="text" class="form-control" name="lyricist"
					placeholder="Enter lyricist Name" value="${dto.getLyricist()}"/>
					<span id="lyricistError" style="color: red"></span><br>
			</div>
			<div class="mb-3">
				<label for="singerName" class="form-label">Producer </label> <input
					type="text" class="form-control" name="producer"
					placeholder="Enter Producer Name" value="${dto.getProducer()}"/>
					<span id="producerError" style="color: red"></span><br>
			</div>
			<div class="mb-3">
				<label for="singerName" class="form-label">Director </label> <input
					type="text" class="form-control" name="director"
					placeholder="Enter Director Name" value="${dto.getDirector()}"/>
					<span id="directorError" style="color: red"></span><br>
			</div>
			<input type="submit" class="btn btn-primary" value="save">
		</div>
	</form>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>