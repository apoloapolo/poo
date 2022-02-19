package com.apolo.bancodobrasil;

public class ContaCorrente extends ContaBancaria {
	
	public ContaCorrente(String numConta, String dono, double saldo) {
		this.setNumConta(numConta);
		this.setDono(dono);
		this.setTipo("CC");
		this.setSaldo(saldo);
	}
}
