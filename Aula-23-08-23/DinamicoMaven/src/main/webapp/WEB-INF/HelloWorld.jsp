<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="persistence.DaoMaven" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	DaoMaven daoMaven = new DaoMaven(); 
			String fraseMaven = daoMaven.buscarMaven();
	%>
	
	<h1>O banco de dados diz <%= fraseMaven %> </h1>

</body>
</html>