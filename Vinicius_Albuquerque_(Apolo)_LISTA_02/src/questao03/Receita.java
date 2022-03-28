package questao03;

import java.time.LocalDateTime;

public abstract class Receita implements Transacao {
	private LocalDateTime data;
	private String descricao;

	public Receita(LocalDateTime data, String descricao) {
		this.data = data;
		this.descricao = descricao;
	}

	public String getTipo() {
		return "RECEITA";
	}

	public String getDescricao() {
		return descricao;
	}

	public LocalDateTime getData() {
		return data;
	}
}
