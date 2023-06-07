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



<title>xworkz</title>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
	<div class="container-fluid">
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarTogglerDemo03"
			aria-controls="navbarTogglerDemo03" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<a class="navbar-brand" href="#">Navbar</a>
		<div class="collapse navbar-collapse" id="navbarTogglerDemo03">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="View.jsp">View display</a></li>
				<li class="nav-item"><a class="nav-link" href="Sucess.jsp">Your
						Information</a></li>
				<li class="nav-item"><a class="nav-link disabled" href="#"
					tabindex="-1" aria-disabled="true">Disabled</a></li>
			</ul>
			<form class="d-flex">
				<input class="form-control me-2" type="search" placeholder="Search"
					aria-label="Search">
				<button class="btn btn-outline-success" type="submit">Search</button>
			</form>
		</div>
	</div>
</nav>
</head>
<body>



	<h1>Login hear...</h1>

	<form method="post" action="Send">

		<pre>
		resortName:<input type="text" name="resortName"><br>
		ownerName:<input type="text" name="ownerName"> <br>
		location:<input type="text" name="location"><br>
		mobileNo:<input type="text" name="mobileNo"><br> 
		Email:<input type="text" name="email"> <br>
		
	RoomType:<select name="roomType">
			<option value="SingleShare">SingleShare</option>
			<option value="doubleShare">doubleShare</option>
			<option value="WithAC">WithAC</option>
			<option value="WithoutAc">WithoutAc</option>
		
		</select> 
		
		priceRange:<select name="priceRange">
			<option value="10000-2000">10000-2000</option>
			<option value="500-700">500-700</option>
			<option value="300-500">300-500</option>
			<option value="300">300</option>

		</select>
		
		 FOOD COURT 
		 Pureveg: <input type="checkbox" value="veg" name="foodType">
		 Nonveg:<input type="checkbox" value="Nonveg" name="foodType">
		 SouthMeal: <input type="checkbox" value="southMeal" name="foodType">
		 NorthMeal:<input type="checkbox" value="northMeal" name="foodType">


		select swimingFoolAcess
		 Yes:<input type="radio" value="yes" name="swimingFoolAcess">
		 No:<input type="radio" value="no" name="swimingFoolAcess"> 
	
	</pre>
		<button type="submit">Send</button>

	</form>
	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
		crossorigin="anonymous">


</body>
</html>