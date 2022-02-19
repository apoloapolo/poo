package com.apolo.atividade5.questao3;

public class ContaCorrente {
	private String numConta;
	private double saldo;
	
	
	public ContaCorrente(String n, double s){
		this.numConta = n;
		this.saldo = s;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(double valor) throws SaldoInsuficienteException {
		if (this.getSaldo() >=  valor) {
			this.setSaldo(this.getSaldo() - valor);
		}else {
			throw new SaldoInsuficienteException("Saldo Insuficiente");
		}
	}
	public void depositar(double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}

}
