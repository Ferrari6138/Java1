package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DaoMaven {
	public String buscarMaven(){
			String comandoSqlSelect = "Select * from Frases";
			FabricaConexao fabricaConexao = new FabricaConexao();
			
			String fraseMaven = null;
			
			Connection conexaoRecebida = null;
			PreparedStatement declaracaoComando = null;
			ResultSet resultSet = null;
			
			try {
				
				conexaoRecebida = fabricaConexao.criarConexoBancoUsuario();
				
				declaracaoComando = (PreparedStatement) conexaoRecebida.prepareStatement(comandoSqlSelect);
				resultSet = declaracaoComando.executeQuery();
				
				while (resultSet.next()) {
					
					fraseMaven = resultSet.getString("Frase");
					
				}
				
			
				
			} catch (Exception e) {
				System.out.println("Erro ao salvar");
				
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
			
			
			return fraseMaven;
	}
}