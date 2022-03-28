package questao04;

public class AlertaPreco {
	private Usuario consumidor;
	private OfertaProduto oferta;
	private double precoDesejado;

	public AlertaPreco(Usuario consumidor, OfertaProduto oferta, double precoDesejado) {
		this.consumidor = consumidor;
		this.oferta = oferta;
		this.precoDesejado = precoDesejado;
	}

	public void precoDesejadoAtingido(OfertaProduto oferta) {
		if (oferta.getPreco() <= this.precoDesejado) {
			System.out.printf("%s, o produto \"%s\" atingiu o preço desejado e está por %.2f",
					this.consumidor.getNome(), this.oferta.getProduto().getNome(), this.oferta.getPreco());
		}
	}

	public boolean equals(AlertaPreco a) {
		if (this.consumidor.equals(a.getConsumidor()) && this.oferta.equals(a.getOferta())
				&& (this.precoDesejado == a.getPrecoDesejado())) {
			return true;
		} else {
			return false;
		}
	}

	public Usuario getConsumidor() {
		return consumidor;
	}

	public OfertaProduto getOferta() {
		return oferta;
	}

	public double getPrecoDesejado() {
		return precoDesejado;
	}

}
