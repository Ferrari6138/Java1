package seguranca;

import model.UsuarioModel;

public class AutenticarUsuario {

	public UsuarioModel autenticarUsuario(UsuarioModel usuario) {
		
		String senhaBanco = "123";
		
		if(usuario.getUsuario().equals("Gabriel")) {
			usuario.setPerfil("ADM");
		}
		
		if(usuario.getUsuario().equals("Jose")) {
			usuario.setPerfil("COMUM");
		}
		
		
		if(usuario.getUsuario().equals("Gabriel") || usuario.getUsuario().equals("Jose")) {
			
			if(senhaBanco.equals(usuario.getSenha())) {
				return usuario;
			
			}else {
				return null;
			}
		
		}else {
			return null;
		}
	}
	
}