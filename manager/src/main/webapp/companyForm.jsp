<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:url value="newCompany" var="linkServeket"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Company</title>
</head>
<body>
<form action="${linkServeket}" method="post">
		Name: <input type="text" name="companyName"/>
		Date: <input type="text" name="date"/>
		<input type="submit"/>
	</form>
</body>
</html>