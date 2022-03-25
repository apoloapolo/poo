package questao02;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
	private static double SALARIO_TETO_IMPOSTO = 5000.00;
	private double salario;

	public Funcionario(String nome, LocalDate dtNascimento, double salario) {
		super(nome, dtNascimento);
		this.salario = salario;
	}

	@Override
	public String toString() {
		if (this instanceof Gerente) {
			return "\nGerente: " + super.toString() + "\nSalário: R$ " + String.valueOf(this.salario)
					+ "\nImposto Devido: R$ " + String.valueOf(this.calcularImpostoDevido());
		} else {
			return "\nFuncionária(o): " + super.toString() + "\nSalário: R$ " + String.valueOf(this.salario)
					+ "\nImposto Devido: R$ " + String.valueOf(this.calcularImpostoDevido());
		}

	}

	public double calcularImpostoDevido() {
		if (this.salario > SALARIO_TETO_IMPOSTO) {
			double impostoDevido = this.salario * 0.075;
			return impostoDevido;
		} else {
			double impostoDevido = this.salario * 0.05;
			return impostoDevido;
		}
	}

	public double getSalario() {
		return salario;
	}

}
