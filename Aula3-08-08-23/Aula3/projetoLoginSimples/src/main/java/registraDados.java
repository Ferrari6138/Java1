import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class registraDados {

	public String escrevernoArquivo(String nome, String email, String cpf) {
		
		String enderecoArquivo = "D:\\Users\\gabri\\eclipse-workspace\\projetoLoginSimples\\src\\main\\webapp\\META-INF\\login.txt";
		String escrita = "NOME: " +nome+ "CPF: " +cpf+ "EMAIL: " +email;
		
		try {
			BufferedWriter buWriter = new BufferedWriter(new FileWriter(enderecoArquivo, true));
			buWriter.append(escrita + "\n");
			buWriter.close();
			
			System.out.println("Deu bom");
			return "Deu bom no cadastro";
		} catch (Exception e) {
			System.out.println("Deu ruim no cadastro");
			return "Deu ruim no cadastro";
		}
		
		
		
	}
	
}