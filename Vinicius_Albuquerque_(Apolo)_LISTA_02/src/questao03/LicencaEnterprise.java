package questao03;

import java.time.LocalDateTime;

public class LicencaEnterprise extends Receita{
	private int totalContas;

	public LicencaEnterprise(LocalDateTime data, String descricao, int totalContas) {
		super(data, descricao);
		this.totalContas = totalContas;
	}

	@Override
	public double calcularTotal() {
		double total = this.totalContas * 150;
		return total;
	}
	
	
}
