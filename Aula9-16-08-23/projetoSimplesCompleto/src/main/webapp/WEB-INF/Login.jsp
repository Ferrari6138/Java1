<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

	<style>
			body {
				font-family: Arial, sans-serif;
				background-color: #f4f4f4;
				margin: 0;
				padding: 0;
				display: flex;
				justify-content: center;
				align-items: center;
				min-height: 100vh;
			}
			
			.login-container {
				background-color: #fff;
				padding: 20px;
				border-radius: 5px;
				box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
				width: 300px;
			}
	
			.login-container h2 {
				text-align: center;
				margin-bottom: 25px;
			}
	
			.form-group {
				margin-bottom: 15px;
			}
			
			label {
				display: block;
				font-weight: bold;
				margin-bottom: 5px;
			}
			
			input[type="text"], input[type="password"] {
				width: 90%;
				padding: 8px;
				border: 1px solid #ccc;
				border-radius: 3px;
			}
			
			button {
				background-color: #007bff;
				color: #f4f4f4;
				border: none;
				padding: 10px 20px;
				border-radius: 3px;
				cursor: pointer;
				width: 100%;
			}
		</style>

</head>
<body>

	<div class="login-container">
			<h2>Tela de Login - JSP</h2>
			<form action="login" method="post">
				<div class="form-group">
					<label for="username">Usu�rio:</label>
					<input type="text" id="username" name="username" required>
				</div>
				<div class="form-group">
					<label for="password">Senha:</label>
					<input type="password" id="password" name="password" required>
				</div>
				<button type="submit">Entrar</button>
			</form>
		</div>

</body>
</html>