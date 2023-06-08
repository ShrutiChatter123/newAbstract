<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">




<title>Xworkz...</title>

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
					aria-current="page" href="view.jsp">View Display</a></li>
				<li class="nav-item"><a class="nav-link" href="Sucess.jsp">Sucess
						details</a></li>
				</form>
		</div>
	</div>
</nav>




</head>
<body>
	<h1>Welcome to the Login page...</h1>
	

	<span style="color: green;">${msg}</span>

	<c:forEach items="${errorMsg}" var="error">
		<br>
		<span style="color: red;">${error.defaultMessage}</span>
		<br>
	</c:forEach>



	<form method="post" action="wel">
		<pre>
officeName:<input type="text" name="officeName"><br>
managerName:<input type="text" name="managerName"><br>
location:<input type="text" name="location"><br>
email:<input type="text" name="email"><br>

<br>subBranchLocation:<select name="subBranchLocation"
				id="subBranchLocation">
<option value="India">India</option>
<option value="US">US</option>
<option value="England">England</option>

</select>

Registrat Part:
<br>Yes:<input type="radio" value="yes" name="okForRegistraion">
<br>No:<input type="radio" value="No" name="okForRegistraion">

<input type="submit" value="Send">
</pre>



	</form>

	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
		crossorigin="anonymous">





</body>
</html>