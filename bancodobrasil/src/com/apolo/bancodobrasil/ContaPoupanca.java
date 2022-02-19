package com.apolo.bancodobrasil;

public class ContaPoupanca extends ContaBancaria {
	
	public ContaPoupanca(String numConta, String dono, double saldo) {
		this.setNumConta(numConta);
		this.setDono(dono);
		this.setTipo("CP");
		this.setSaldo(saldo);
	}
}
