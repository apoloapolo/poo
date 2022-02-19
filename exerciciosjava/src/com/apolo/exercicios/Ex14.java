package com.apolo.exercicios;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um numero ou -1 para encerrar: ");
		double numero = leitor.nextInt();
		
		while(numero != -1) {
			System.out.println("Digite um numero ou -1 para encerrar: ");
			double numero1 = leitor.nextInt();
			if (numero1>numero) {
				numero = numero1;
				}
			}
		System.out.printf("O maior numero digitado foi %.2f", numero);
	}
}
	