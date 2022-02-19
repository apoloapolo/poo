package com.apolo.exercicios;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o valor do IDH do pais: ");
		double idh = leitor.nextDouble();
		
		if (idh > 0.8) {
			System.out.println("O país tem IDH muito alto");
		}

	}

}
