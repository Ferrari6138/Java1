package controller;

import java.io.IOException;


import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.Usuario;
import persistence.DaoUsuario;



public class CadastroUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 	request.getRequestDispatcher("WEB-INF/CadastroUsuario.jsp").forward(request, response);
			
	 }
	
	
	
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			
			Usuario usuario = new Usuario();
			DaoUsuario daoUsuario = new DaoUsuario();
			
			usuario.setNome(request.getParameter("nome"));
			usuario.setSenha(request.getParameter("senha"));
			usuario.setPerfil(request.getParameter("perfil"));
		
			if (daoUsuario.verificarUsuario(usuario)) {
				daoUsuario.atualizarUsuario(usuario);
			}else {
				daoUsuario.salvarUsuarioBanco(usuario);
			}
			
			
			response.sendRedirect(request.getContextPath()+ "/cadastroUsuario");
	
	
	
	}
	
	

	

}