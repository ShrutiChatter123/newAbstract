<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter Your Adhar information....</h1>


<span style="color: green;">${msg }</span>
<c:forEach  items="errors" var="error">
<span style="color:red;">${errors.getdefaultMessage }</span>


</c:forEach>


<form  method="post" action="happy" enctype="multipart/form-data"  >
<pre>
FName:<input type="text" name="fName">
LName:<input type="text" name="lName">
Mobile:<input type="number" name="mobile">
Email<input type="text" name="email">


State:<select value="state" name="state" >
<option>select</option>
<option>Karnataka</option>
<option>Tamilnada</option>
<option>uttarkhand</option>
<option>west Bengal</option>

</select>

gender

Male:<input type="radio" name="gender" value="male">
FeMale:<input type="radio" name="gender" value="female">

Address:<textarea rows="2" cols="13" name="address"></textarea>


Select File<input type="file" name="file">

<input type="submit" value="Send">

</pre>
</form>


</body>
</html>