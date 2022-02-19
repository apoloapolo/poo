package com.apolo.exercicios;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um valor inteiro: ");
		int inteiro = leitor.nextInt();
		System.out.println("Informe outro: ");
		int inteiro1 = leitor.nextInt();
		int soma = inteiro + inteiro1;
		System.out.println("A soma dos números é " + soma);
				
		

	}

}
