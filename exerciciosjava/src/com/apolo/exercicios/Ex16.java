package com.apolo.exercicios;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite uma nota de 0 à 10: ");
		double nota = leitor.nextInt();
		
		while((nota < 0)||(nota > 10)) {
			System.out.println("O valor digitado é invalido!");
			System.out.println("Digite uma nota de 0 à 10: ");
			nota = leitor.nextInt();
		}
		
		System.out.println("O valor digitado é valido!");
	}

}
