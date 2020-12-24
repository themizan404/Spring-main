<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="processFormVersionThree" method="get">
		<input type="text" name="studentName" placeholder="What's your name?" />

		<input type="submit" value="Submit" />
	</form>

	<br>
	<br>

	<img src="${pageContext.request.contextPath}/resources/images/pic.jpg" />

	<br>
	<br>
</body>
</html>