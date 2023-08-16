import java.util.List;

public class TesteArquivo {
		
	public static void main (String[] args) {
		
		String nomeDoArquivo = "estoque.csv";
		String diretorio = System.getProperty("user.home");
		String caminho = diretorio +"\\"+ nomeDoArquivo;
		
		List<String>conteudo = new ArrayList<>();
		conteudo.add("Produto; Quantidade ; Unidade de Medida; Valor da Unidade;" );
		conteudo.add("Pera; 200; pct; R$5,40;");
		conteudo.add("Morango; 150; pct; R$6,40;");
		conteudo.add("Abacaxi; 220; pct; R$4,40;");
		
		gravarEstoque(nomeDoArquivo, caminho, conteudo);
		//letEstoque(caminho)
	}

}
