package com.apolo.atividade4;

import java.util.HashSet;

public class Questão1 {

	public static void main(String[] args) {
		HashSet<String> marcas = new HashSet<String>();
		
		marcas.add("Adidas");
		marcas.add("Nike");
		marcas.add("Rebook");
		marcas.add("Vizzano");
		marcas.add("Arezzo");
		marcas.add("Via Marte");
		marcas.add("All Star");
		marcas.add("Coca-Cola");
		marcas.add("Calvin Klein");
		marcas.add("Olympikus");
		
		for (String nomes: marcas) {
			System.out.println(nomes);
		}
		

	}

}
