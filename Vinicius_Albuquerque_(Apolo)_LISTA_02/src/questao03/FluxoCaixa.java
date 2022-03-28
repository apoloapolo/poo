package questao03;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;

public class FluxoCaixa {
	private ArrayList<Transacao> transacoes;
	private String nomeEmpresa;
	private String cnpj;

	public FluxoCaixa(String nomeEmpresa, String cnpj) {
		this.transacoes = new ArrayList<Transacao>();
		this.nomeEmpresa = nomeEmpresa;
		this.cnpj = cnpj;
	}

	public void adicionarTransacao(Transacao transacao) {
		this.transacoes.add(transacao);
	}

	public double calcularDespesas(LocalDate inicio, LocalDate fim) {
		double despesas = 0;
		LocalDate data;
		for (Transacao t : this.transacoes) {
			if(t.getTipo().equals("DESPESA")) {
				data = t.getData().toLocalDate();
				if (data.equals(inicio) | data.equals(fim) | (data.isBefore(fim) & data.isAfter(inicio))) {
					despesas += t.calcularTotal();
				}
			}
		}
		return despesas;
	}

	public double calcularReceitas(LocalDate inicio, LocalDate fim) {
		double receitas = 0;
		LocalDate data;
		for (Transacao t : this.transacoes) {
			if(t.getTipo().equals("RECEITA")) {
				data = t.getData().toLocalDate();
				if (data.equals(inicio) | data.equals(fim) | (data.isBefore(fim) & data.isAfter(inicio))) {
					receitas += t.calcularTotal();
				}
			}
		}
		return receitas;
	}

	public double percentReceitas(int mes, int ano) {
		LocalDate dataInicial = LocalDate.of(ano, mes, 01);
		LocalDate dataFinal = LocalDate.of(ano, mes, 01).with(TemporalAdjusters.lastDayOfMonth());
		double receitas = this.calcularReceitas(dataInicial,dataFinal);
		double despesas = this.calcularDespesas(dataInicial,dataFinal);
		double total = receitas + despesas; 
		return (receitas/total)*100;
	}

	public double percentDespesas(int mes, int ano) {
		LocalDate dataInicial = LocalDate.of(ano, mes, 01);
		LocalDate dataFinal = LocalDate.of(ano, mes, 01).with(TemporalAdjusters.lastDayOfMonth());
		double receitas = this.calcularReceitas(dataInicial,dataFinal);
		double despesas = this.calcularDespesas(dataInicial,dataFinal);
		double total = receitas + despesas; 
		return (despesas/total)*100;
	}

	public double saldoAtual() {
		double receitas = 0;
		double despesas = 0;
		for (Transacao t : this.transacoes) {
			if(t.getTipo().equals("RECEITA")) {
				receitas += t.calcularTotal();
			}else {
				despesas += t.calcularTotal();
			}
		}
		return receitas - despesas;
	}

	public ArrayList<Transacao> listarTransacoesNoMes(int mes, int ano) {
		ArrayList<Transacao> lista = new ArrayList<Transacao>();
		LocalDate dataInicial = LocalDate.of(ano, mes, 01);
		LocalDate dataFinal = LocalDate.of(ano, mes, 01).with(TemporalAdjusters.lastDayOfMonth());
		for (Transacao t : this.transacoes) {
			LocalDate data = t.getData().toLocalDate();
			if (data.equals(dataInicial) | data.equals(dataFinal) | (data.isBefore(dataFinal) & data.isAfter(dataInicial))) {
				lista.add(t);
			}
		}
		return lista;
	}

}
