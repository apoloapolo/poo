package questao04;

public class Loja {
	private String codigo;
	private String nome;
	private String site;

	public Loja(String codigo, String nome, String site) {
		this.codigo = codigo;
		this.nome = nome;
		this.site = site;
	}
	
	public boolean equals(Loja l) {
		if (this.codigo.equals(l.getCodigo())) {
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

	public String getSite() {
		return site;
	}

}
