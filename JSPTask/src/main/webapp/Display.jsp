<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Information about parameters...</h3>
<%=request.getParameter("Name") %>
<%=request.getParameter("Age") %>
<%=request.getParameter("CollageName") %>
</body>
</html>