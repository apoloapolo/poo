package questao04;

import java.time.LocalDate;

public class Usuario {
	private String email;
	private String nome;
	private LocalDate dtNascimento;

	public Usuario(String email, String nome, LocalDate dtNascimento) {
		this.email = email;
		this.nome = nome;
		this.dtNascimento = dtNascimento;
	}
	
	public boolean equals(Usuario u) {
		if (this.email.equals(u.getEmail())) {
			return true;
		} else {
			return false;
		}
	}

	public String getEmail() {
		return email;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDtNascimento() {
		return dtNascimento;
	}

}
