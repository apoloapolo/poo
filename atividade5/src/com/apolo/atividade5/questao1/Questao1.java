package com.apolo.atividade5.questao1;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		ArrayList<Integer> idade = new ArrayList<Integer>();
		int x = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite a idade da pessoa "+(i+1)+" :");
			idade.add(leitor.nextInt());
		}
		
		do {
			try {
				System.out.println("Digite uma posi��o de 1 � 10: ");
				idade.remove((leitor.nextInt()-1));
				System.out.println("Idade removida na posi��o digitada");
				x++;
			} catch (Exception e) {
				System.out.println("Posi��o inv�lida");
			}
		}while(x < 1);
	}

}
