package com.apolo.exercicios;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o valor do raio: ");
		double raio = leitor.nextDouble();
		double area = 3.14*(raio*raio);
		System.out.println("A area do circulo é " + area);

	}

}
