<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2 style="color:blue">Registration done Successfully...</h2>

	<h3>Captured By :${dto.getCapturedBy()}</h3>
	<h3>Place : ${dto.getPlace()}</h3>
	<h3>Date : ${dto.getDate()}</h3>
</body>
</html>