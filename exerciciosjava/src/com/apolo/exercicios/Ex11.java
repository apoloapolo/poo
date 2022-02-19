package com.apolo.exercicios;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o codigo da bebida: ");
		int codigo= leitor.nextInt();

		System.out.println("Digite o tipo da bebida 1 (normal) ou 2 (diet): ");
		int tipo = leitor.nextInt();
		
		System.out.println("Digite a quantidade de bebidas: ");
		int quantidade = leitor.nextInt();
		
		double valorBebida= 0;
		
		switch (codigo)
		{
			case 1:
				switch (tipo){
					case 1:
						valorBebida= 1.5;
						break;
					case 2:
						valorBebida= 1.7;
						break;	
				}
			case 2:
				switch (tipo){
					case 1:
						valorBebida= 1.6;
						break;
					case 2:
						valorBebida= 1.7;
						break;
				}
			case 3:
				switch (tipo){
				case 1:
					valorBebida= 1.4;
					break;
				case 2:
					valorBebida= 1.45;
					break;
				}
		double valorTotal= quantidade*valorBebida;
		
		if (valorTotal>100) {
			double porcentagem = valorTotal*0.05;
			double valorTotalgeral = valorTotal-porcentagem;
			System.out.printf("O valor total geral é: R$%.2f", valorTotalgeral);
		} else { 
			double valorTotalgeral = valorTotal;
			System.out.printf("O valor total geral é: R$%.2f", valorTotalgeral);
			
		}
		}
	}

}
