<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:url value="updateCompany" var="linkServeket"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Preview</title>
</head>
<body>
<form action="${linkServeket}" method="post">
		<input type="text" name="id" value="${company.id}"}/>
		Name: <input type="text" name="companyName" value="${company.name}"}/>
		Date: <input type="hidden" name="date" value="<f:formatDate value="${company.date}" pattern="dd/MM/yyyy"/>"/>
		<input type="submit"/>
	</form>
</body>
</html>