package com.apolo.exercicios;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um numero positivo (negativo para encerrar): ");
		double numero = leitor.nextInt();
		
		while(numero > 0) {
			System.out.println(numero);
			System.out.println("Digite um numero positivo (negativo para encerrar): ");
			numero = leitor.nextInt();
		}
	}
}
