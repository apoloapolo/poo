package questao04;

import java.time.LocalDate;

public class OfertaProduto {
	private Produto produto;
	private Loja loja;
	private LocalDate dataOferta;
	private double preco;

	public OfertaProduto(Produto produto, Loja loja, LocalDate dataOferta, double preco) {
		this.produto = produto;
		this.loja = loja;
		this.dataOferta = dataOferta;
		this.preco = preco;
	}

	public boolean equals(OfertaProduto o) {
		if (this.produto.equals(o.getProduto()) && this.loja.equals(o.getLoja())
				&& this.dataOferta.equals(o.getDataOferta()) && (this.preco == o.getPreco())) {
			return true;
		} else {
			return false;
		}
	}

	public Produto getProduto() {
		return produto;
	}

	public Loja getLoja() {
		return loja;
	}

	public LocalDate getDataOferta() {
		return dataOferta;
	}

	public double getPreco() {
		return preco;
	}

}
