package com.apolo.herança;

public class Professor extends Pessoa {
	private String especialidade;
	private double salario;
	
	public void receberAumento(double a) {
		System.out.println("Aumento de "+ a+ "recebido com sucesso");
		this.salario+=a;
	}
	
}
