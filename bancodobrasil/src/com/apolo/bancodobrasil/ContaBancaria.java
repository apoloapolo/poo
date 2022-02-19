package com.apolo.bancodobrasil;

public class ContaBancaria implements MetodosConta{
	private String numConta, tipo, dono;
	private double saldo;
	
	protected String getNumConta() {
		return numConta;
	}
	protected void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	protected String getTipo() {
		return tipo;
	}
	protected void setTipo(String tipo) {
		this.tipo = tipo;
	}
	protected String getDono() {
		return dono;
	}
	protected void setDono(String dono) {
		this.dono = dono;
	}
	protected double getSaldo() {
		return saldo;
	}
	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public void sacar(double valor) {
		if (this.getSaldo() >=  valor) {
			this.setSaldo(this.getSaldo() - valor);
		}else {
			System.out.println("Saldo Insuficiente");
		}
	}
	@Override
	public void depositar(double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}
	
	@Override
	public void jurosPoupanca() {
		if (this.getTipo() == "CP") {
			this.setSaldo(this.getSaldo()+(this.getSaldo()*0.05));
		}else {
			System.out.println("Nesse tipo de conta não se aplica juros mensais");
		}
	}
}
