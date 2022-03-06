package estoque_questao01;

public class Produto {
	private String codigo;
	private String nome;

	public Produto() {
		this.codigo = null;
		this.nome = null;
	}

	public Produto(String codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public void mudarNome(String novoNome) {
		this.nome = novoNome;
	}

	public String getNome() {
		return nome;
	}
	
	

}
