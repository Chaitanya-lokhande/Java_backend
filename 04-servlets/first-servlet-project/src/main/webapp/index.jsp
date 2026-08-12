<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>This is my first servlet project</title>

<link rel="stylesheet" href="<%= application.getContextPath() %>/css/style.css"/>
</head>
<body>
	<div class="container">
		<%@include file="menu.jsp" %>
		<h1>Welcome to Servlet project</h1>
		<p>This is Chaitanya Lokhande</p>
		<form action="<%= application.getContextPath() %>/third" method="post">
		<input name="message" type="text" placeholder="Enter Text here">
		<button type="submit">Submit</button>
		</form>
	</div>
<script src="<%= application.getContextPath() %>/js/script.js"></script>
</body>
</html>