package questao04;

public enum Categoria {
	SMARTPHONE ("Smartphone"), 
	ELETRONICO ("Eletrônicos"), 
	CASA ("Utensílios Domésticos"), 
	FERRAMENTA ("Ferramentas"), 
	MODA ("Vestuário");

	private String nome;
	
	Categoria(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
}
