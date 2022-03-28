package questao03;

import java.time.LocalDateTime;

public class LicencaPlus extends Receita{
	private int totalContas;

	public LicencaPlus(LocalDateTime data, String descricao, int totalContas) {
		super(data, descricao);
		this.totalContas = totalContas;
	}

	@Override
	public double calcularTotal() {
		double total = this.totalContas * 35;
		return total;
	}
	
	
}
