<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List,br.com.geoschmitt.manager.servlet.Company"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<ul>
	<% List<Company> list = (List<Company>)request.getAttribute("listCompany");
	for(Company company : list) { %>
		<li><%= company.getNome()%></li>
	<%}%>
</ul>
</body>
</html>