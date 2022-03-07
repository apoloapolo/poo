package questao03;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
	private String nome;
	private String cpf;
	private String grupo;
	private LocalDate dataNascimento;

	public Pessoa(String nome, String cpf, String grupo, LocalDate dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.grupo = grupo;
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long calcularIdade() {
		long idade = this.dataNascimento.until(LocalDate.now(), ChronoUnit.YEARS);
		return idade;
	}

}
