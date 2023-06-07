<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table class="table">

	<thead>

		<tr>
			<th scope="col">Name</th>
			<th scope="col">email</th>
			<th scope="col">country</th>
			<th scope="col">mobile</th>

		</tr>
	</thead>
	<tbody>
		<c:forEach items="${list}" var="dto">
			<tr>

				<td>${dto.name}</td>
				<td>${dto.email}</td>
				<td>${dto.country}</td>
				<td>${dto.mobile}</td>
				<td>${dto.type}</td>

			</tr>
		</c:forEach>

		</tbody>
	
</table>

</body>
</html>