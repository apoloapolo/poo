package com.apolo.funcionario;

public class ClassePrincipal {

	public static void main(String[] args) {
		Programador programador = new Programador();
		programador.setNome("Apolo");
		programador.setCpf("000000000-00");
		programador.setLinguagem("Python");
		programador.setSalario(5000);
		
		Designer designer = new Designer();
		designer.setNome("Flávio Neves");
		designer.setCpf("1111111111-11");
		designer.setSoftwareEdicao("Paint");
		designer.setSalario(5000);

		Funcionario[] funcionarios = new Funcionario[2];
		funcionarios[0] = programador;
		funcionarios[1] = designer;
		
		for(int i = 0; i < funcionarios.length; i++) {
			System.out.println(funcionarios[i].calcularBonificacao());
		}
	}

}
