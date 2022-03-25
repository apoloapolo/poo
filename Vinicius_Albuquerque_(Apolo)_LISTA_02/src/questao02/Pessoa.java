package questao02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public abstract class Pessoa {
	private String nome;
	private LocalDate dtNascimento;

	public Pessoa(String nome, LocalDate dtNascimento) {
		this.nome = nome;
		this.dtNascimento = dtNascimento;
	}

	public String toString() {
		return nome + "\nData de Nascimento: "
				+ DateTimeFormatter.ofPattern("dd/MM/yyyy").format(this.dtNascimento);
	}

	public boolean equals(Object p) {
		if (this.nome.equals(((Pessoa) p).getNome()) && this.dtNascimento.equals(((Pessoa) p).getDtNascimento())) {
			return true;
		} else {
			return false;
		}
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDtNascimento() {
		return dtNascimento;
	}
	
	public long calcularIdade() {
		long idade = this.dtNascimento.until(LocalDate.now(), ChronoUnit.YEARS);
		return idade;
	}

}
