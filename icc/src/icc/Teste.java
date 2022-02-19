package icc;

public class Teste {

	public static void main(String[] args) {
		String nome = args[0];
		char ultimaLetra = nome.charAt(nome.length()-1);
		nome = nome + ultimaLetra + ultimaLetra + ultimaLetra;
		System.out.println("O seu nome fazendo eco é: " + nome);
	}

}
