<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/css/main.css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Offers</title>
</head>
<body>
<div class="container">
	<h2>Results</h2>
	<c:forEach var="offer" items="${offers}">
		<div class="col-lg-3 col-md-6">
	        <ul class="list-group">
			 	<li class="list-group-item active"><h2>Offer</h2></li>
				<li class="list-group-item">ID: <c:out value="${offer.id}"></c:out></li>
				<li class="list-group-item">Name: <c:out value="${offer.name}"></c:out></li>
				<li class="list-group-item">Email: <c:out value="${offer.email}"></c:out></li>
				<li class="list-group-item">Text: <c:out value="${offer.text}"></c:out></li>
			</ul>
		</div>
	</c:forEach>
</div>
</body>
</html>