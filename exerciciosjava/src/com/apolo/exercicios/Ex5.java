package com.apolo.exercicios;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um valor metros para convers�o: ");
		float metros = leitor.nextFloat();
		float cent= metros*100;
		System.out.println(metros +" " + "metros s�o" +" "+ cent +" " + "centimetros");

	}

}
