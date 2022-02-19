package com.apolo.funcionario;

public class Designer extends Funcionario{
	private String softwareEdicao;

	public String getSoftwareEdicao() {
		return softwareEdicao;
	}

	public void setSoftwareEdicao(String softwareEdicao) {
		this.softwareEdicao = softwareEdicao;
	}
	
	public double calcularBonificacao() {
		double bonificacao = getSalario() * 0.1;
		return bonificacao;
	}	
}
