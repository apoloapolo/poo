package questao02;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		RepositorioPessoas r1 = new RepositorioPessoas();

		Cliente c1 = new Cliente("Apolo", LocalDate.of(2000, 06, 03), 001);
		Cliente c2 = new Cliente("Maria", LocalDate.of(2000, 10, 30), 002);
		Cliente c3 = new Cliente("Orlando", LocalDate.of(2000, 05, 06), 003);
		Cliente c4 = new Cliente("Vithoria", LocalDate.of(2000, 04, 21), 004);
		Cliente c5 = new Cliente("José", LocalDate.of(1999, 03, 03), 005);

		Cliente c6 = new Cliente("Apolo", LocalDate.of(2000, 06, 03), 001);

		r1.cadastrarPessoa(c1);
		r1.cadastrarPessoa(c2);
		r1.cadastrarPessoa(c3);
		r1.cadastrarPessoa(c4);
		r1.cadastrarPessoa(c5);

		r1.cadastrarPessoa(c6);

		Funcionario f1 = new Funcionario("Dadá", LocalDate.of(2000, 06, 03), 2000);
		Funcionario f2 = new Funcionario("Dedé", LocalDate.of(2000, 10, 30), 9000);
		Funcionario f3 = new Funcionario("Didi", LocalDate.of(2000, 05, 06), 5500);
		Funcionario f4 = new Funcionario("Dodó", LocalDate.of(2000, 04, 21), 6000);
		Funcionario f5 = new Funcionario("Dudu", LocalDate.of(1999, 03, 03), 1800);

		Funcionario f6 = new Funcionario("Dadá", LocalDate.of(2000, 06, 03), 001);

		r1.cadastrarPessoa(f1);
		r1.cadastrarPessoa(f2);
		r1.cadastrarPessoa(f3);
		r1.cadastrarPessoa(f4);
		r1.cadastrarPessoa(f5);

		r1.cadastrarPessoa(f6);

		Gerente g1 = new Gerente("Fernanda", LocalDate.of(2000, 06, 03), 8000, "Projetos");
		Gerente g2 = new Gerente("Paty", LocalDate.of(2000, 10, 30), 5200, "Projetos");
		Gerente g3 = new Gerente("Luiz", LocalDate.of(2000, 05, 06), 10000, "Comercial");
		Gerente g4 = new Gerente("Gabriel", LocalDate.of(2000, 04, 21), 9600, "Comercial");
		Gerente g5 = new Gerente("Thomas", LocalDate.of(1999, 03, 03), 6500, "Departamento Pessoal");

		Gerente g6 = new Gerente("Fernanda", LocalDate.of(2000, 06, 03), 8000, "Projetos");

		r1.cadastrarPessoa(g1);
		r1.cadastrarPessoa(g2);
		r1.cadastrarPessoa(g3);
		r1.cadastrarPessoa(g4);
		r1.cadastrarPessoa(g5);

		r1.cadastrarPessoa(g6);

		System.out.println();

		for (int i = 0; i < 50; i++)
			System.out.printf("*");
		System.out.println();
		System.out.println("Pessoas Maiores de Idade");
		for (int i = 0; i < 50; i++)
			System.out.printf("*");
		for (Pessoa p : r1.listarPessoasMaioresIdade()) {
			System.out.println();
			for (int i = 0; i < 50; i++)
				System.out.printf("-");
			System.out.println(p.toString());
			for (int i = 0; i < 50; i++)
				System.out.printf("-");
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < 50; i++)
			System.out.printf("*");
		System.out.println();
		System.out.println("Clientes Maiores de Idade");
		for (int i = 0; i < 50; i++)
			System.out.printf("*");
		for (Pessoa p : r1.listarClientesMaioresIdade()) {
			System.out.println();
			for (int i = 0; i < 50; i++)
				System.out.printf("-");
			System.out.println(p.toString());
			for (int i = 0; i < 50; i++)
				System.out.printf("-");
			System.out.println();
		}
		for (int i = 0; i < 50; i++)
			System.out.printf("*");

		System.out.println();

		System.out.println("Funcionários Com Salário Maior Que R$5.000,00");
		for (int i = 0; i < 50; i++)
			System.out.printf("*");
		for (Pessoa p : r1.listarFuncionariosComSalarioMaiorQue(5000)) {
			System.out.println();
			for (int i = 0; i < 50; i++)
				System.out.printf("-");
			System.out.println(p.toString());
			for (int i = 0; i < 50; i++)
				System.out.printf("-");
			System.out.println();
		}
		for (int i = 0; i < 50; i++)
			System.out.printf("*");

		System.out.println();

		System.out.println("Gerentes Da Área de Projetos");
		for (int i = 0; i < 50; i++)
			System.out.printf("*");
		for (Pessoa p : r1.listarGerentesDaArea("Projetos")) {
			System.out.println();
			for (int i = 0; i < 50; i++)
				System.out.printf("-");
			System.out.println(p.toString());
			for (int i = 0; i < 50; i++)
				System.out.printf("-");
			System.out.println();
		}
		for (int i = 0; i < 50; i++)
			System.out.printf("*");
	}

}
