package com.apolo.bancodobrasil;

public class ClassePrincipal {

	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente("123-4","Apolo", 1000);
		System.out.println("Saldo da conta " + cc1.getNumConta() + ": " + cc1.getSaldo());
		cc1.depositar(100);
		System.out.println("Saldo da conta " + cc1.getNumConta() + ": " + cc1.getSaldo());
		cc1.depositar(400);
		System.out.println("Saldo da conta " + cc1.getNumConta() + ": " + cc1.getSaldo());
		cc1.sacar(200);
		
		ContaPoupanca cp1 = new ContaPoupanca("222-2","Apolo", 5000);
		System.out.println("Saldo da conta " + cp1.getNumConta() + ": " + cp1.getSaldo());
		cp1.depositar(1000);
		System.out.println("Saldo da conta " + cp1.getNumConta() + ": " + cp1.getSaldo());
		cp1.jurosPoupanca();
		System.out.println("Saldo da conta " + cp1.getNumConta() + ": " + cp1.getSaldo());
	}
}
