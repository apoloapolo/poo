package questao04;

public class Produto {
	private String codigo;
	private String nome;
	private String descricao;
	private Categoria categoria;

	public Produto(String codigo, String nome, String descricao, Categoria categoria) {
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.categoria = categoria;
	}
	
	public boolean equals(Produto p) {
		if (this.codigo.equals(p.getCodigo())) {
			return true;
		} else {
			return false;
		}
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

}
