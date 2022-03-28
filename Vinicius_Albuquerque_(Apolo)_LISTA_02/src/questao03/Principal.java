package questao03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		LocalTime horaAgora = LocalTime.now();
		Random random = new Random();
		int ano = 2021;

		FluxoCaixa f1 = new FluxoCaixa("Apolo's INC.", "11.111.111/0001-01");

		for (int i = 0; i < 12; i++) {
			int dia = random.nextInt(26) + 1;
			int qtd = random.nextInt(100) + 1;
			LocalDate data = LocalDate.of(ano, i+1, dia);
			Transacao t1 = new LicencaBasica(LocalDateTime.of(data, horaAgora),
					"Licenças Básicas " + Integer.toString(i+1) + "/" + Integer.toString(ano), qtd);
			f1.adicionarTransacao(t1);
		}
		
		for (int i = 0; i < 12; i++) {
			int dia = random.nextInt(26) + 1;
			int qtd = random.nextInt(100) + 1;
			LocalDate data = LocalDate.of(ano, i+1, dia);
			Transacao t1 = new LicencaPlus(LocalDateTime.of(data, horaAgora),
					"Licenças Plus " + Integer.toString(i+1) + "/" + Integer.toString(ano), qtd);
			f1.adicionarTransacao(t1);
		}
		
		for (int i = 0; i < 12; i++) {
			int dia = random.nextInt(26) + 1;
			int qtd = random.nextInt(100) + 1;
			LocalDate data = LocalDate.of(ano, i+1, dia);
			Transacao t1 = new LicencaBasica(LocalDateTime.of(data, horaAgora),
					"Licenças Enterprise " + Integer.toString(i+1) + "/" + Integer.toString(ano), qtd);
			f1.adicionarTransacao(t1);
		}

		for (int i = 0; i < 12; i++) {
			int dia = random.nextInt(26) + 1;
			double valor = random.nextInt(200) + 1;
			LocalDate data = LocalDate.of(ano, i+1, dia);
			Transacao t1 = new DespesaComAgua(LocalDateTime.of(data, horaAgora),
					"Água " + Integer.toString(i+1) + "/" + Integer.toString(ano), valor);
			f1.adicionarTransacao(t1);
		}
		
		for (int i = 0; i < 12; i++) {
			int dia = random.nextInt(26) + 1;
			double valor = random.nextInt(200) + 1;
			LocalDate data = LocalDate.of(ano, i+1, dia);
			Transacao t1 = new DespesaComEnergia(LocalDateTime.of(data, horaAgora),
					"Energia " + Integer.toString(i+1) + "/" + Integer.toString(ano), valor);
			f1.adicionarTransacao(t1);
		}
		
		for (int i = 0; i < 12; i++) {
			int dia = random.nextInt(26) + 1;
			double valor = random.nextInt(200) + 1;
			LocalDate data = LocalDate.of(ano, i+1, dia);
			Transacao t1 = new DespesaComInternet(LocalDateTime.of(data, horaAgora),
					"Internet " + Integer.toString(i+1) + "/" + Integer.toString(ano), valor);
			f1.adicionarTransacao(t1);
		}
		
		System.out.printf("Total de despesas em jan/2021: R$%.2f\n", f1.calcularDespesas(LocalDate.of(ano, 01, 01), LocalDate.of(ano, 01, 31)));
		System.out.printf("Total de receitas em jan/2021: R$%.2f\n", f1.calcularReceitas(LocalDate.of(ano, 01, 01), LocalDate.of(ano, 01, 31)));
		System.out.printf("Percentual de receitas em jan/2021: %.2f%%\n", f1.percentReceitas(01,ano));
		System.out.printf("Percentual de despesas em jan/2021: %.2f%%\n", f1.percentDespesas(01,ano));
		System.out.printf("Saldo Atual: R$%.2f\n", f1.saldoAtual());
		
		System.out.println("\n---Lista de Transações no mês de jan/2021---\n");
		for(Transacao t: f1.listarTransacoesNoMes(01,ano)) {
			LocalDate data = t.getData().toLocalDate();
			String dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(data);
			System.out.printf("%s | %s | %s | Valor: R$%.2f\n", dataFormatada, t.getTipo(), t.getDescricao(), t.calcularTotal());
		}
		
		
	}

}
