<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/css/main.css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create Offer</title>
</head>
<body>
	<sf:form method="post"
		action="${pageContext.request.contextPath}/docreate" commandName="offer">
		<table class="formtable">
			<tr>
				<td>Name: <sf:input type="text"  path="name" name="name" />
				</td>
			</tr>
			<tr>
				<td>Email: <sf:input type="text" path="email" name="email" />
				</td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td>Your offer:</td>
			</tr>
			<tr>
				<td><sf:textarea name="text" path="text" rows="10" cols="10"></sf:textarea></td>
			</tr>
			<tr>
				<td><input value="Create advert" type="submit" /></td>
			</tr>
		</table>
	</sf:form>
</body>
</html>