<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

</head>

<a href="list"> table dislay</a>
<div class="navbar navbar-dark bg-dark">
	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">BloodDonation</a>
		</div>
		
		<div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="ImageDisplay.jsp">view downoads</a>
        </li>
        </ul>
        </div>
		
	</nav>
</div>


<body>
<div align="center">


	<h1>Enter your details hear.....</h1>
	

	<span style="color: green">${successMsg}</span>
	<br>


	<c:forEach items="${errors}" var="error">
		<br>
		<span style="color: red;">${error.defaultMessage}</span>
		<br>
	</c:forEach>




	<form method="post" action="blood"  enctype="multipart/form-data">
		<div class="col-md-6"><br>
			<label for="inputEmail4" class="form-label">DonatorName</label> 
			<input value="${dtos.donatorName}"
				type="text" class="form-control" id="DonatorName" name="donatorName">
		</div>

		<div class="col-md-6"><br>
			<label for="inputPassword4" class="form-label">donatorMobileNo</label>
			<input   value="${dtos.donatorMobileNo }"  type="text" class="form-control" id="donatorMobileNo"
				name="donatorMobileNo">
		</div>


		<div class="col-md-4">
			<label for="inputState" class="form-label">bloodGroupType</label> <select
				id="bloodGroupType" class="form-select" name="bloodGroupType">
				<option selected>Choose...</option>
				<option>select</option>
				<option>A+</option>
				<option>A-</option>
				<option>o+</option>
				<option>o-</option>
				<option>AB+</option>
				<option>AB-</option>
				<option>B+</option>
				<option>B-</option>
			</select>
		</div>

		<div class="col-md-6"><br>
			<label for="inputEmail4" class="form-label">email</label> <input value="${dtos.email}"
				type="email" class="form-control" id="name" name="email">
		</div>

		<div class="col-md-6"><br>
			<label for="inputEmail4" class="form-label">weight</label> <input value="${dtos.weight }"
				type="text" class="form-control" id="weight" name="weight">
		</div>

	Gender: <br>
		<label> male
			</label>
			<input value="male" class="form-check-input" type="radio"
				name="gender" id="gender">
		
	
		
		<div>
			<input value="female"   class="form-check-input" type="radio"
				name="gender" id="gender"
				checked> <label class="form-check-label"
				for="flexRadioDefault2"> female </label>
		</div>

		Have you donated previously?
		<div class="form-check"><br>
			<input value="yes"  class="form-check-input" type="radio"
				name="haveyoudonatedpreviously" id="haveyoudonatedpreviously">
			<label class="form-check-label" for="flexRadioDefault1">
			</label>
		</div>
		<div class="form-check">
			<input value="no" class="form-check-input" type="radio"
				name="haveyoudonatedpreviously" id="haveyoudonatedpreviously"
				checked> <label class="form-check-label" 
				for="flexRadioDefault2"> no </label>
		</div>

		Address
		<div class="input-group"><br>
			<span class="input-group-text">address</span>
			<textarea class="form-control" aria-label="With textarea"
				id="address" name="address"></textarea>
		</div>

		Select file:<input type="file" name="file"><br>

		<div class="col-12">
			<button type="submit" class="btn btn-primary">Sign in</button>
		</div>

	</form>




	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous">
		
	</script>
</div>
</body>
</html>