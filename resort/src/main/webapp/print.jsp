<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<pre>
	<h1>Detailes saved sucessfully</h1>
	
	<br>resortName:${resortName}
	<br> ownerName:${ownerName}
	<br> location:${location}
	<br> mobileNo:${mobileNo}
	<br> email:${email}
	<br> roomType:${roomType}
	<br> priceRange:${priceRange}
	<br> foodType:${foodType }
	<br> swimingFoolAcess:${swimingFoolAcess}
	<br>
</pre>

<form action="view" method="post">
<input type="submit" value="Details">
</form>
</body>
</html>