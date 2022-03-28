package questao03;

import java.time.LocalDateTime;

public abstract class Despesa implements Transacao {
	private LocalDateTime data;
	private String descricao;

	
	
	public Despesa(LocalDateTime data, String descricao) {
		this.data = data;
		this.descricao = descricao;
	}

	public String getTipo() {
		return "DESPESA";
	}

	public String getDescricao() {
		return descricao;
	}

	public LocalDateTime getData() {
		return data;
	}

}
