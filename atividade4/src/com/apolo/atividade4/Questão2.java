package com.apolo.atividade4;

import java.util.HashMap;
import java.util.Scanner;

public class Questão2 {

	public static void main(String[] args) {
		HashMap<String, Double> alunos = new HashMap<String, Double>();
		
		Scanner leitor = new Scanner(System.in);
		
		for (int i = 0; i < 50; i++) {
			System.out.println("Digite o CPF do aluno "+(i+1));
			String cpf = leitor.nextLine();
			System.out.println("Digite a nota do aluno "+(i+1));
			Double nota = leitor.nextDouble();
			leitor.nextLine();
			alunos.put(cpf, nota);
		}
		System.out.println("A nota do aluno com CPF 764.605.203-56 : "+alunos.get("764.605.203-56"));
	}
}
