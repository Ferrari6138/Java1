<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<!--  <html lang="en"> -->
<head>
<meta charset="ISO-8859-1">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Barra de Navegação</title>
</head>

 		<style>
		 		
			ul.navbar {
				list-style-type: none;
				margin: 0;
				padding: 0;
				background-color: #007bff;
				overflow: hidden;
			}
				
			ul.navbar li {
				float: left;
			}
				
			ul.navbar li a {
				display: block;
				color: black; 
				text-align: center;
				padding: 14px 16px;
				text-decoration: none;
			}
				
			ul.navbar li a:hover {
				background-color: #e0e0e0; 
			}
	</style>
</head>
<body>
<ul class="navbar">
<li><a href="#">Início</a></li>
<li><a href="#">Sobre</a></li>
</ul>
</body>
</html>