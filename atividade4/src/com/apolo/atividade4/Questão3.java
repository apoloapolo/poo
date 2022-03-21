package com.apolo.atividade4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Questão3 {

	public static void main(String[] args) {
		ArrayList<Double> produto = new ArrayList<Double>();
		List<String> meses = Arrays.asList("Janeiro", "Fevereiro", "Marï¿½o"
				, "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro");
		Scanner leitor = new Scanner(System.in);
		
		double soma = 0;

		for(int i = 0; i < 12; i++) {
			System.out.println("Digite o valor do produto no mï¿½s de "+meses.get(i)+":");
			Double valor = leitor.nextDouble();
			produto.add(valor);
			soma = soma+valor;
		}
		System.out.println("A mï¿½dia do valor do produto ï¿½ "+(soma/12));
	}

}
