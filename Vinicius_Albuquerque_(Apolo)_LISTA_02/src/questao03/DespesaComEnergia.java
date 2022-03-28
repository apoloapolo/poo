package questao03;

import java.time.LocalDateTime;

public class DespesaComEnergia extends Despesa {
	private double kWh;

	public DespesaComEnergia(LocalDateTime data, String descricao, double kWh) {
		super(data, descricao);
		this.kWh = kWh;
	}

	@Override
	public double calcularTotal() {
		double total = 2;

		if (this.kWh > 0) {
			if (this.kWh <= 50) {
				total += (this.kWh * 0.5);
			} else if (this.kWh > 50 && this.kWh <= 200) {
				total = 15;
				total += ((this.kWh * 0.5) + ((((int) this.kWh) / 100) * 1.2));
			} else {
				total = 35;
				total += ((this.kWh * 0.5) + ((((int) this.kWh) / 100) * 1.2));
			}
		}
		return total;
	}

}
