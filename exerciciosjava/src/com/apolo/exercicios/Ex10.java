package com.apolo.exercicios;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o codigo do sanduiche: ");
		int sanduiche = leitor.nextInt();

		System.out.println("Digite o codigo da bebida: ");
		int bebida = leitor.nextInt();
		
		double valorComida = 0;
		
		switch (sanduiche)
		{
			case 100:
				valorComida=1.2;
				break;
			case 101:
				valorComida=1.3;
				break;
			case 102:
				valorComida=1.5;
				break;
			case 103:
				valorComida=1.2;
				break;	
		}
		
		double valorBebida = 0;
		
		switch (bebida)
		{
			case 200:
				valorBebida =1.0;
				break;
			case 201:
				valorBebida =1.5;
				break;
			case 202:
				valorBebida =0.7;
				break;
			case 203:
				valorBebida =2.0;
				break;		
		}
		double valorTotal = valorComida+valorBebida;
		
		System.out.printf("O Valor a pagar é R$%.2f",valorTotal);
	}

}
