package com.apolo.atividade5.questao3;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) throws SaldoInsuficienteException {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o número da conta a ser criada:");
		String conta = leitor.nextLine();
		System.out.println("Digite o saldo inicial da conta:");
		double saldo = leitor.nextDouble();
		ContaCorrente cc = new ContaCorrente(conta,saldo);
		for(int i = 0; i <10;i++) {
			System.out.println("Digite um valor para saque:");
			cc.sacar(leitor.nextDouble());
		}
		
	}

}
