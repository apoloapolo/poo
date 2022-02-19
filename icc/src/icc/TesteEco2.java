package icc;

public class TesteEco2 {

	public static void main(String[] args) {
		String nome = args[0];
		String sobrenome = args[1];
		char ultimaLetra = nome.charAt(nome.length()-1);
		char ultimaLetraSobrenome = sobrenome.charAt(sobrenome.length()-1);
		nome = nome + ultimaLetra + ultimaLetra + ultimaLetra;
		sobrenome = sobrenome + ultimaLetraSobrenome + ultimaLetraSobrenome + ultimaLetraSobrenome + ultimaLetraSobrenome + ultimaLetraSobrenome;
		System.out.println("O seu nome e sobrenome fazendo eco é: " + nome + " " + sobrenome);
	}
}
