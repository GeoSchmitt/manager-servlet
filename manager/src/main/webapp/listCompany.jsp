<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List,br.com.geoschmitt.manager.servlet.Company"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:url value="removeCompany" var="removelinkServeket"/>
<c:url value="companyPreview" var="updatelinkServeket"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JST</title>
</head>
	<body>
		<h1>Listando com JST</h1>
		<ul>
			<c:forEach items="${listCompany}" var="company">
				<li>
					${company.name} - <f:formatDate value="${company.date}" pattern="dd/MM/yyyy"/>
					<a href="${updatelinkServeket}?id=${company.id}">Update</a>
					<a href="${removelinkServeket}?id=${company.id}">Remove</a>
				</li>
			</c:forEach>
		</ul>
	</body>
</html>