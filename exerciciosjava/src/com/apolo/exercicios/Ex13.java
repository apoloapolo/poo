package com.apolo.exercicios;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro positivo: ");
		int numero = leitor.nextInt();
		
		while(numero > 0) {
			System.out.println(numero/2);
			System.out.println("Digite um numero inteiro positivo: ");
			numero = leitor.nextInt();	
		}
		System.out.println("Programa Finalizado.");
		}

	}

