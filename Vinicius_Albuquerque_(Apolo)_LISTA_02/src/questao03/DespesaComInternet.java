package questao03;

import java.time.LocalDateTime;

public class DespesaComInternet extends Despesa {
	private double dadosTrafegados;

	public DespesaComInternet(LocalDateTime data, String descricao, double dadosTrafegados) {
		super(data, descricao);
		this.dadosTrafegados = dadosTrafegados;
	}

	@Override
	public double calcularTotal() {
		double total = 90.90;
		if (this.dadosTrafegados > 20) {
			if (this.dadosTrafegados < 100) {
				total += ((this.dadosTrafegados - 20) * 3.9);
			} else if (this.dadosTrafegados >= 100 && this.dadosTrafegados < 500) {
				total = 240.90;
				total += ((this.dadosTrafegados - 100) * 4.4);
			} else {
				total = 590.9;
				total += ((this.dadosTrafegados - 500) * 5.1);
			}
		}
		return total;
	}

}
