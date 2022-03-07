package questao03;

public class Vacina {
	private int codigo;
	private String nome;
	private String lote;

	public Vacina(int codigo, String nome, String lote) {
		if (nome.equals("CORONAVAC") | nome.equals("OXFORD")) {
			this.codigo = codigo;
			this.nome = nome;
			this.lote = lote;
		} else {
			System.out.println("Não foi possível criar o objeto, nome da vacina inválido");
		}
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.equals("CORONAVAC") | nome.equals("OXFORD")) {
			this.nome = nome;
		} else {
			System.out.println("Não foi possível trocar o nome da vacina, nome inválido");
		}
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

}