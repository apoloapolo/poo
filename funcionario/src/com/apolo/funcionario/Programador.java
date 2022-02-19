package com.apolo.funcionario;

public class Programador extends Funcionario implements Professor {
	private String linguagem;

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	
	public double calcularBonificacao() {
		double bonificacao = getSalario() * 0.2;
		return bonificacao;
	}
	
	public void darAula() {
		System.out.println("DANDO AULA DE PROGRAMAÇÃO");
	}	
}