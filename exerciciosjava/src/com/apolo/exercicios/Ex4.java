package com.apolo.exercicios;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int x = 0;
		float soma = 0;
		while (x < 4) {
			System.out.println("Digite a" + " " + (x+1) + " " + "nota:");
			float inteiro = leitor.nextFloat();
			soma+=inteiro;
			x++;
		}
		float media = soma/x;
		System.out.println("A média dos bimestres é " + media);
		}
		

	}

