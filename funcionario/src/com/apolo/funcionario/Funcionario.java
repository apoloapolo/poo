package com.apolo.funcionario;

public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	protected String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected String getCpf() {
		return cpf;
	}
	protected void setCpf(String cpf) {
		this.cpf = cpf;
	}
	protected double getSalario() {
		return salario;
	}
	protected void setSalario(double salario) {
		this.salario = salario;
	}



	public abstract double calcularBonificacao();
}
