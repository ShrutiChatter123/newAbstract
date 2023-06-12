<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
 rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" 
crossorigin="anonymous">

<head>

<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>

<div class="navbar navbar-dark bg-primary">>
  <nav class="navbar navbar-expand-lg navbar-light bg-dark">
    <div class="container-fluid">
      <a class="navbar-brand" href="">Application</a>
    </div>
  </nav>
</div>

<body>

<h1>Enter your information hear....</h1>

<span style="color: green;"> ${msg }</span>
<c:forEach items="${errormsg}" var="error">
<span style="color: red;"> ${error.defaultMessage}</span>
</c:forEach>


<form  method="post" action="valid">


  <div class="mb">
    <label for="exampleInputEmail1" class="form-label">fName</label>
    <input type="text" class="form-control" id="fName" aria-describedby="emailHelp" name="fName">
	</div>
	
	 <div class="mb">
    <label for="exampleInputEmail1" class="form-label">lName</label>
    <input type="text" class="form-control" id="lName" aria-describedby="emailHelp" name="lName">
	</div>
	
	
	 <div class="mb">
    <label for="exampleInputEmail1" class="form-label">email</label>
    <input type="email" class="form-control" id="email" aria-describedby="emailHelp" name="email">
	</div>
	
	 <div class="mb">
    <label for="exampleInputEmail1" class="form-label">mobileNo</label>
    <input type="number" class="form-control" id="mobileNo" aria-describedby="emailHelp" name="mobileNo">
	</div>
	
	<div class="form-floating mb"><br>
  address<textarea class="form-control" placeholder="Leave a address here" id="address" style="height: 100px" name="address"></textarea>
</div>
	

  <button type="submit" class="btn btn-primary">Submit</button>
</form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" 
integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" 
crossorigin="anonymous"></script>

</body>
</html>