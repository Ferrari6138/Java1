package persistence;

import java.sql.Connection;
import java.sql.DriverManager;


public class FabricaConexao {
	
	private String USUARIO = "root";
	private String SENHA = "root";
	
	
	private static String sqlFrases = "jdbc:mysql://localhost:3306/springproject?useTimezone=true&serverTimezone=UTC";
	
	public Connection criarConexoBancoUsuario() {
		Connection conexao = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conexao = DriverManager.getConnection(sqlFrases, USUARIO, SENHA);
			System.out.println("Conexão Realizada");
	
		} catch (Exception e) {
			System.out.println("Erro na conexão");
		}
		return conexao;
	}

}