package questao02;

import java.util.ArrayList;

public class RepositorioPessoas {
	ArrayList<Pessoa> pessoas;

	public RepositorioPessoas() {
		this.pessoas = new ArrayList<Pessoa>();
	}

	public void cadastrarPessoa(Pessoa p) {
		boolean verificador = false;
		for (Pessoa pessoa : this.pessoas) {
			if (p.equals(pessoa)) {
				verificador = true;
			} else {
				continue;
			}
		}
		if (!verificador) {
			this.pessoas.add(p);
			System.out.printf("\n%s cadastrada(o) com sucesso!\n",p.getNome());
		} else {
			System.out.printf("\nNão foi possível cadastrar %s, Essa(e) pessoa/código de cliente já está na base de dados.\n", p.getNome());
		}

	}

	public ArrayList<Pessoa> listarPessoasMaioresIdade() {
		ArrayList<Pessoa> maioresIdade = new ArrayList<Pessoa>();
		for (Pessoa pessoa : this.pessoas) {
			if (pessoa.calcularIdade() >= 18) {
				maioresIdade.add(pessoa);
			}
		}
		return maioresIdade;
	}

	public ArrayList<Cliente> listarClientesMaioresIdade() {
		ArrayList<Cliente> maioresIdade = new ArrayList<Cliente>();
		for (Pessoa pessoa : this.pessoas) {
			if (pessoa instanceof Cliente && pessoa.calcularIdade() >= 18) {
				maioresIdade.add((Cliente) pessoa);
			}
		}
		return maioresIdade;
	}

	public ArrayList<Funcionario> listarFuncionariosComSalarioMaiorQue(double salario) {
		ArrayList<Funcionario> salariosMaioresQue = new ArrayList<Funcionario>();
		for (Pessoa pessoa : this.pessoas) {
			if (pessoa instanceof Funcionario && ((Funcionario) pessoa).getSalario() > salario) {
				salariosMaioresQue.add((Funcionario) pessoa);
			}
		}
		return salariosMaioresQue;
	}

	public ArrayList<Gerente> listarGerentesDaArea(String area) {
		ArrayList<Gerente> gerentesDaArea = new ArrayList<Gerente>();
		for (Pessoa pessoa : this.pessoas) {
			if (pessoa instanceof Gerente && ((Gerente) pessoa).getArea().equals(area)) {
				gerentesDaArea.add((Gerente) pessoa);
			}
		}
		return gerentesDaArea;
	}
}
