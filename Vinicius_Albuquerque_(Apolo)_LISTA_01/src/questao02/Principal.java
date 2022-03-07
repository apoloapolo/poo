package questao02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int dia = leitor.nextInt();
		int mes = leitor.nextInt();
		int ano = leitor.nextInt();

		LocalDate data = LocalDate.of(ano, mes, dia);

		long diferenca = data.until(LocalDate.now(), ChronoUnit.DAYS);

		System.out.println("Diferença, em dias, do dia de hoje: " + Math.abs(diferenca));
		
		String dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(data.plusDays(110));
		
		System.out.println("Data somada 110 dias: " + dataFormatada);
		
		data = LocalDate.of(ano, 8, dia);
		
		String dataFormatada2 = DateTimeFormatter.ofPattern("dd/MMM/YYYY").format(data);
		
		System.out.println("Data formatada: " + dataFormatada2);
		

	}

}
