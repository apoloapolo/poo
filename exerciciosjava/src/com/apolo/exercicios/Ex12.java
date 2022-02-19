package com.apolo.exercicios;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro positivo: ");
		int numero = leitor.nextInt();
		
		for(int i = 0; i < numero; i++) {
			System.out.print(i + ", ");
		}

	}

}
