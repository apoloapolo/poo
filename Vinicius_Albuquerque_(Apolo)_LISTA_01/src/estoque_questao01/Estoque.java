package estoque_questao01;

public class Estoque {
	private Produto produto;
	private int qtdAtual;
	private int qtdMinima;

	public Estoque() {
		this.produto = null;
		this.qtdAtual = 0;
		this.qtdMinima = 0;
	}

	public Estoque(Produto produto, int qtdAtual, int qtdMinima) {
		this.produto = produto;
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
	}

	public void mudarQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}

	public void reporEstoque(int qtd) {
		this.qtdAtual += qtd;
	}

	public void darBaixa(int qtd) {
		if (this.qtdAtual - qtd >= this.qtdMinima) {
			this.qtdAtual -= qtd;
		} else {
			System.out.println(
					"Baixa não realizada: quantidade que seria retirada deixa o estoque abaixo da quantidade mínima");
		}
	}

	public void relatorio() {
		System.out.printf("Produto: %s\n", this.produto.getNome());
		System.out.printf("Quantidade Atual: %s\n", this.qtdAtual);
		System.out.printf("Quandidade Mínima: %s\n", this.qtdMinima);
	}

}
