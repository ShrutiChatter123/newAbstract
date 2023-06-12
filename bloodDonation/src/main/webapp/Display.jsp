<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<link rel="stylesheet" href="table.css">

</head>
<body>
<h1>Displaying the tables</h1>

<table class="table" id="customer">
<tr>

<th>donatorName</th>
<th>donatorMobileNo</th>
<th>bloodGroupType</th>
<th>gender</th>
<th>email</th>
<th>address</th>
<th>weight</th>
<th>haveyoudonatedpreviously</th>
<th>file</th>


</tr>

<c:forEach items="${dtos}" var="dto">
<tr>
<td>${dto.donatorName}</td>
<td>${dto.donatorMobileNo}</td>
<td>${dto.bloodGroupType}</td>
<td>${dto.gender}</td>
<td>${dto.email}</td>
<td>${dto.address}</td>
<td>${dto.weight}</td>
<td>${dto.haveyoudonatedpreviously}</td>


<td><a target="_blank" href="fileDownload?fileName=${dto.fileName }&contentType=${dto.contentType}">${dto.fileName}</a></td>

</tr>


</c:forEach>


</table>

</body>
</html>