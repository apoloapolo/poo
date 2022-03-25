package questao02;

import java.time.LocalDate;

public class Cliente extends Pessoa {
	private long codigo;

	public Cliente(String nome, LocalDate dtNascimento, long codigo) {
		super(nome, dtNascimento);
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "\nCliente " + codigo + "\nNome: " + super.toString();
	}
	
	@Override
	public boolean equals(Object p) {
		if (super.equals(p) | this.codigo == ((Cliente) p).getCodigo()) {
			return true;
		} else {
			return false;
		}
	}

	public long getCodigo() {
		return codigo;
	}
	
	
}
