package com.apolo.uec;

public class ClassePrincipal {

	public static void main(String[] args) {
		Lutador l[] = new Lutador[6];
		l[0] = new Lutador("Pretty Boy", "França", 31, 1.75,68.9,11,2,1);
		l[1] = new Lutador("Apolo", "Brasil", 20, 1.75,89.0,12,1,0);
		
		Luta UEC01 = new Luta();
		
		UEC01.marcarLuta(l[0], l[1]);
		UEC01.lutar();
	
	}

}
