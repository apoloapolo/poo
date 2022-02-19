package com.apolo.exercicios;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o peso: ");
		double peso = leitor.nextDouble();
		System.out.println("Informe a altura: ");
		double altura = leitor.nextDouble();
		double imc = peso/(altura*altura);		
			
		if (imc < 18.5) {
			System.out.println("Abaixo do peso");
		}
		else if (imc < 25) {
			System.out.println("Peso Normal");
		}
		else if (imc < 30){
			System.out.println("Sobrepeso");
		}
		else if (imc < 35) {
			System.out.println("Obeso Leve");
		}
		else if (imc < 40) {
			System.out.println("Obeso moderado");
		}
		else {
			System.out.println("Obeso mórbido");
		}
	}
} 