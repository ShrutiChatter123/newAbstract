<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	

	
<title>Insert title here</title>


<nav class="navbar navbar-expand-lg navbar-light bg-light">
	<div class="container-fluid">
		<a class="navbar-brand" href="#">Navbar</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarNavAltMarkup"
			aria-controls="navbarNavAltMarkup" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
			<div class="navbar-nav">
				<a class="nav-link active" aria-current="page" href="view">View Details..</a>
				<a class="nav-link active" aria-current="page" href="sucess">Sucess Details..</a>
				
				
			</div>
		</div>
	</div>
</nav>
</head>
<body>


	<form action="info" method="post" >
	
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">FirstName</label>
			<input type="text" class="form-control" name="name" 
				aria-describedby="emailHelp">
		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Email</label> <input
				type="text" class="form-control" name="email">
		</div>
		
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Mobile</label>
			<input type="text" class="form-control" name="mobile">
		</div>
	
		
		
		<label for="type">Type:</label> <select name="type" id="type">
			<option value="mother">Mother</option>
			<option value="father">Father</option>
			<option value="friend">Friend</option>

		</select>
		
		
		 <label for="country">Country:</label> <select name="country"
			id="country">
			<option value="india">India</option>
			<option value="usa">USA</option>
			<option value="england">England</option>

		</select>
		<div>
		<input type="submit" value="Save">
		</div>
	</form>
	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
		crossorigin="anonymous">
		
</body>
</html>