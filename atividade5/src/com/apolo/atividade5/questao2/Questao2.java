package com.apolo.atividade5.questao2;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao2 {
	
	public static void main(String[] args) throws DimensoesInvalidasException {
		Scanner leitor = new Scanner(System.in);
		ArrayList<Integer> valores = new ArrayList<Integer>();
		
		try {
			Triangulo t1 = new Triangulo(3,4,5);
			t1.setLado1(10);
		}catch(DimensoesInvalidasException e) {
			e.printStackTrace();
		}finally {
			for(int i = 0; i < 3; i++) {
				System.out.println("Digite um valor para o lado "+(i+1)+" do triangulo:");
				valores.add(leitor.nextInt());
			}
			Triangulo t2 = new Triangulo(valores.get(0),valores.get(1),valores.get(2));
		}
		
	}

}
