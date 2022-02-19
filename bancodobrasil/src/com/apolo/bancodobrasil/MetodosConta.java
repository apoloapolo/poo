package com.apolo.bancodobrasil;

public interface MetodosConta {
	public abstract void sacar(double valor);
	public abstract void depositar(double valor);
	public abstract void jurosPoupanca();
}
