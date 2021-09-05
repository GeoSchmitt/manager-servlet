<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//Scriptlet
String companyName = (String)request.getAttribute("company");
%>
<!DOCTYPE html>
<html>
	<body>
		<h1>New <%= companyName %> created</h1>
	</body>
</html>
