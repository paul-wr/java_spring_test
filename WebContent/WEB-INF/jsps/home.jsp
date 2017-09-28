<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<p><a href="${pageContext.request.contextPath}/offers">Show current offer</a></p>
 	<p><a href="${pageContext.request.contextPath}/createoffer">Add a new offer</a></p>
 	
 	
 	<!-- the value of id is set in the url paramter ?id=734-->
 	<p>ID: ${id}</p>
	
	
	  
			
	
</body>
</html>