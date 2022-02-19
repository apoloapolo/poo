package com.apolo.herança;

public class ClassePrincipal {

	public static void main(String[] args) {
		//Pessoa p1 = new Pessoa();
		/*Visitante v1 = new Visitante();
		v1.setNome("Apolo");
		v1.setIdade(20);
		v1.setSexo("M");
		System.out.println(v1.toString());*/
		Aluno a1 = new Aluno();
		a1.setNome("Apolo");
		a1.setMatricula(1234);
		a1.setCurso("ADS");
		a1.pagarMensalidade();
		Bolsista b1 =  new Bolsista();
		b1.setMatricula(1112);
		b1.setNome("Katy");
		b1.setBolsa(50);
		b1.setSexo("F");
		b1.pagarMensalidade();
		
	}

}
