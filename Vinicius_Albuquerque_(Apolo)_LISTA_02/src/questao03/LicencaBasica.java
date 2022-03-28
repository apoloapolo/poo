package questao03;

import java.time.LocalDateTime;

public class LicencaBasica extends Receita{
	private int totalContas;

	public LicencaBasica(LocalDateTime data, String descricao, int totalContas) {
		super(data, descricao);
		this.totalContas = totalContas;
	}

	@Override
	public double calcularTotal() {
		double total = this.totalContas * 20;
		return total;
	}
	
	
}
