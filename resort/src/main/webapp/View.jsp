<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
<!DOCTYPE html>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">



<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<h1>This is for Table display.....</h1>


	<table class="table">
		<thead>
			<tr>
				<th scope="col">resortName</th>
				<th scope="col">ownerName</th>
				<th scope="col">location</th>
				<th scope="col">mobileNo</th>
				<th scope="col">email</th>
				<th scope="col">roomType</th>
				<th scope="col">priceRange</th>
				<th scope="col">foodType</th>
				<th scope="col">swimingFoolAcess</th>

			</tr>
		</thead>


		<tbody>
				<c:forEach  items="${list}" var="dto">
				<tr>
					<td>${dto.resortName}</td>
					<td>${dto.ownerName}</td>
					<td>${dto.location}</td>
					<td>${dto.mobileNo}</td>
					<td>${dto.email}</td>
					<td>${dto.roomType}</td>
					<td>${dto.priceRange}</td>
					<td>${dto.foodType}</td>
					<td>${dto.swimingFoolAcess}</td>

				</tr>
			</c:forEach>

		</tbody>


	</table>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	
	
</body>
</html>