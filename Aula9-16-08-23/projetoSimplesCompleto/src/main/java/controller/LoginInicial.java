package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Usuario;
import security.Autenticar;



public class LoginInicial extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("WEB-INF/Login.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Usuario usuarioTentandoAutenticar = new Usuario();
		Usuario usuarioAutenticado = new Usuario();
		
		Autenticar autenticar = new Autenticar();
		
		usuarioTentandoAutenticar.setNome(request.getParameter("username"));
		usuarioTentandoAutenticar.setSenha(request.getParameter("password"));
		usuarioAutenticado = autenticar.autenticarUsuario(usuarioTentandoAutenticar);
		
		HttpSession sessao = request.getSession();
		
		if( usuarioAutenticado != null) {
			sessao.setAttribute("UsuarioSessao", usuarioAutenticado);
			
			response.sendRedirect(request.getContextPath() + "/menuAdm");
		
		}else {
			response.sendRedirect(request.getContextPath()+ "/erroLogin");
		}
		
	}

}