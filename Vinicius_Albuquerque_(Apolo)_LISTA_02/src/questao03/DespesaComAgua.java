package questao03;

import java.time.LocalDateTime;

public class DespesaComAgua extends Despesa {
	private double totalM3;

	public DespesaComAgua(LocalDateTime data, String descricao, double totalM3) {
		super(data, descricao);
		this.totalM3 = totalM3;
	}

	@Override
	public double calcularTotal() {
		double total = 45;

		if (this.totalM3 > 10) {
			if (this.totalM3 <= 20) {
				total += ((this.totalM3 - 10) * 5);
			} else {
				total += 50;
				total += ((this.totalM3 - 20) * 6);
			}
		}
		return total;
	}

}
