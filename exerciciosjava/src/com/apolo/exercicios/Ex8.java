package com.apolo.exercicios;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
			
		System.out.println("Informe o valor da temperatura: ");
		double febre = leitor.nextDouble();
			
		if (febre > 36.5) {
			System.out.println("Está com febre");
		}
		else {
				System.out.println("Está sem febre");
		}
	}
} 