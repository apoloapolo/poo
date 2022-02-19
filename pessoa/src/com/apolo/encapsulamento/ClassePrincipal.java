package com.apolo.encapsulamento;

public class ClassePrincipal {

	public static void main(String[] args) {
		Pessoa aluno1 = new Pessoa("Vinicius", 19);
		
		aluno1.setNome("Apolo");
		aluno1.setIdade(20);
		aluno1.setAltura(1.79);
		aluno1.setPeso(105);
		
		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("Idade: " + aluno1.getIdade());
		System.out.println("Altura: " + aluno1.getAltura());
		System.out.println("Peso: " + aluno1.getPeso());
	}
}
