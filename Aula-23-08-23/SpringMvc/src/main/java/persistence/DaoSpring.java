package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

    public class DaoSpring {
        public String buscarSpringhello() {
        	String comandoSqlSelect = "Select * from Frases123 where Frase = 'Hello Spring'";
        	FabricaConexao fabricaConexao = new FabricaConexao();
        	
        	String fraseSpring = null;
        	
        	Connection conexaoRecebida = null;
			PreparedStatement declaracaoComando = null;
			ResultSet resultSet = null;
			
			try {
				
				conexaoRecebida = fabricaConexao.criarConexoBancoUsuario();
				
				declaracaoComando = (PreparedStatement) conexaoRecebida.prepareStatement(comandoSqlSelect);
				resultSet = declaracaoComando.executeQuery();
				
				while (resultSet.next()) {
					
					fraseSpring = resultSet.getString("Frase");
					
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
			
			
			return fraseSpring;
	
        }
        
        
        
        public String buscarSpringinicio() {
        	String comandoSqlSelect = "Select * from Frases123 where Frase = 'Inicio Spring'";
        	FabricaConexao fabricaConexao = new FabricaConexao();
        	
        	String fraseSpring = null;
        	
        	Connection conexaoRecebida = null;
			PreparedStatement declaracaoComando = null;
			ResultSet resultSet = null;
			
			try {
				
				conexaoRecebida = fabricaConexao.criarConexoBancoUsuario();
				
				declaracaoComando = (PreparedStatement) conexaoRecebida.prepareStatement(comandoSqlSelect);
				resultSet = declaracaoComando.executeQuery();
				
				while (resultSet.next()) {
					
					fraseSpring = resultSet.getString("Frase");
					
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
			
			
			return fraseSpring;
	
        }
	}
	
