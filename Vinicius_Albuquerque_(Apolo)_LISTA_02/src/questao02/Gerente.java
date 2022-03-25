package questao02;

import java.time.LocalDate;

public class Gerente extends Funcionario {

	private String area;

	public Gerente(String nome, LocalDate dtNascimento, double salario, String area) {
		super(nome, dtNascimento, salario);
		this.area = area;
	}

	@Override
	public String toString() {
		return super.toString() + "\nÁrea de atuação: " + this.area ;
	}

	public String getArea() {
		return area;
	}

}
