<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<body>
	<c:if test="${not empty company}">
		<h1>New ${ company } created</h1>
	</c:if>
	<c:if test="${empty company}">
		<h1>No company registered</h1>
	</c:if>
		
	</body>
</html>
