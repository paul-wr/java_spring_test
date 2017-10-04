<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/css/main.css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Offer created</title>
</head>
<body>
Offer created: <a href="${pageContext.request.contextPath}/offers">Click here to view offers.</a>
	<p>Name: ${offer.name}</p>
	<p>Email: ${offer.email}</p>
	<p>Text: ${offer.text}</p>
</body>
</html>