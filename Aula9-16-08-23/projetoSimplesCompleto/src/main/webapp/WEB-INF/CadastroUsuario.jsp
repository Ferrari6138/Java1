<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page  import="persistence.DaoUsuario" %>
<%@ page  import="model.Usuario" %>
<%@ page  import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Barra de Navega��o v 2</title>
    <style>
        /* Seus estilos CSS aqui */
        table.custom-table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
            border: 1px solid #ccc;
        }

        table.custom-table th, table.custom-table td {
            padding: 8px;
            text-align: left;
            border: 1px solid #ccc;
        }

        table.custom-table th {
            background-color: #f2f2f2;
        }

        .btn-editar,
        .btn-deletar,
        .btn-enviar {
            padding: 6px 10px;
            background-color: #007bff;
            color: white;
            border: none;
            cursor: pointer;
        }

        .btn-deletar {
            background-color: #ff4444;
        }

        .btn-enviar {
            background-color: #00cc00; /* Cor verde */
        }

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

	<% 
		DaoUsuario daoUsuario = new DaoUsuario();
		List<Usuario> usuarios = daoUsuario.buscarListaUsuario();
	%>

    <nav>
        <ul class="navbar">
            <li><a href="#">Inicio</a></li>
            <li><a href="#">Sobre</a></li>
            <li><a href="cadastroUsuario">Administrar</a></li>
        </ul>
    </nav><br>
    <form action="cadastroUsuario" method="post">
        <label>Nome:</label>
        <input type="text" id="nome" name="nome">

        <label>Senha:</label>
        <input type="password" id="senha" name="senha" value="">

        <label>Perfil:</label>
        <select id="perfil" name="perfil">
            <option value="ADM">ADM</option>
            <option value="COMUM">COMUM</option>
        </select>

        <button class="btn-enviar" type="submit">Enviar</button>
    </form>

    <table class="custom-table">
        <tr>
            <th>Nome</th>
            <th>Perfil</th>
            
        </tr>
 		<%for (Usuario usuario : usuarios) {%>
	 		<tr>
	            <td><%= usuario.getNome() %></td>
	            <td><%= usuario.getPerfil() %></td>
           </tr> 
        <%} %>
       
    </table>
</body>
</html>