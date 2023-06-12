`<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<div><a href="ImageDisplay.jsp"> View Image</a></div>
<div><a href="list">List all</a></div>

<h3 style="text-align: center;color: green;">Blood donation registration info..</h3>

<c:forEach items="${errors }" var="error">
<span style="colore:red">${error.defaultMessage}</span>
<br>

</c:forEach>



</body>
</html>