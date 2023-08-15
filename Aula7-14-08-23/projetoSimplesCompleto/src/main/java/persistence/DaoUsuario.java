package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Usuario;

public class DaoUsuario {

	public boolean salvarUsuarioBanco(Usuario usuario) {
		
		FabricaConexao fabricaConexao = new FabricaConexao();
		
		boolean salvar = false;
		
		String comandoSqlInsert = "insert into tb_usuario (nome, perfil, senha) values (?, ?, ?)";
		
		Connection conexaoRecebida = null ;
		PreparedStatement declaracaoComando = null;
		try {
			
			conexaoRecebida = fabricaConexao.criarConexoBancoUsuario();
			declaracaoComando = (PreparedStatement) conexaoRecebida.prepareStatement(comandoSqlInsert);
			
			declaracaoComando.setString(1, usuario.getNome().toUpperCase());
			declaracaoComando.setString(2, usuario.getPerfil().toUpperCase());
			declaracaoComando.setString(3, usuario.getSenha());
			
			declaracaoComando.execute();
			
			
			System.out.println("Salvo com sucesso");
			salvar = true;
			
		} catch (Exception e) {
			System.out.println("Erro ao salvar o Usuario");
			
		}finally {
			try {
				if(conexaoRecebida != null) {
					conexaoRecebida.close();
				}
				if(declaracaoComando != null) {
					declaracaoComando.close();
				}
				
			} catch (Exception e2) {
				System.out.println("Erro ao fechar Conexao!!");
			}
			
			
		}
		
		
		return salvar;
	}
	
	public List<Usuario> buscarListaUsuario(){
		String comandoSqlSelect = "SELECT * FROM tb_usuario";
		FabricaConexao fabricaConexao = new FabricaConexao();
		List<Usuario> usuarios = new ArrayList<>();
		
		Connection conexaoRecebida = null ;
		PreparedStatement declaracaoComando = null;
		ResultSet resultSet = null;
		
		try {
			
			//Armazena a conexão
			conexaoRecebida = fabricaConexao.criarConexoBancoUsuario();
			
			//Prepara o comando que sera enviado para o banco
			declaracaoComando = (PreparedStatement) conexaoRecebida.prepareStatement(comandoSqlSelect);
			resultSet = declaracaoComando.executeQuery();
			
			while (resultSet.next()) {
				Usuario usuario = new Usuario();
				
				usuario.setNome(resultSet.getString("nome"));
				usuario.setPerfil(resultSet.getString("perfil"));
				usuario.setSenha(resultSet.getString("senha"));
				usuarios.add(usuario);
				
			}
			
		
			
		} catch (Exception e) {
			System.out.println("Erro ao salvar o Usuario");
			
		}finally {
			try {
				if(conexaoRecebida != null) {
					conexaoRecebida.close();
				}
				if(declaracaoComando != null) {
					declaracaoComando.close();
				}
				
			} catch (Exception e2) {
				System.out.println("Erro ao fechar Conexao!!");
			}
			
			
		}
		
		
		return usuarios;
	}
	
	
	
}