package questao03;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class RelacaoVacinados {
	private ArrayList<RegistroVacina> vacinados;

	public RelacaoVacinados() {
		this.vacinados = new ArrayList<RegistroVacina>();
	}
	public void adicionar(RegistroVacina registro) {
		this.vacinados.add(registro);
	}

	public int calcularTotalVacinadosAcimaDe(int idade) {
		int total = 0;
		for (RegistroVacina registro : this.vacinados) {
			if (registro.getVacinado().calcularIdade() >= idade && registro.getDose() == 1) {
				total += 1;
			}
		}
		return total;
	}

	public void listarPessoasQueNãoTomaram2aDose() {
		int primeiradose = 0;
		int segundadose = 0;
		ArrayList<String> listaverificacao = new ArrayList<String>();
		System.out.printf("%-12s|%-14s|%-7s|%25s\n", "CPF", "Nome", "Idade", "Data Indicada p. 2a Dose");
		for (int i = 0; i < 61; i++)
			System.out.printf("-");
		System.out.println();
		for (RegistroVacina registro : this.vacinados) {
			if (registro.getDose() == 1 && !listaverificacao.contains(registro.getVacinado().getCpf())) {
				listaverificacao.add(registro.getVacinado().getCpf());
				primeiradose += 1;
				String dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy")
						.format(registro.getData_vacinacao().plusDays(21));
				System.out.printf("%-12s|%-14s|%7s|%25s\n", registro.getVacinado().getCpf(),
						registro.getVacinado().getNome(), registro.getVacinado().calcularIdade(), dataFormatada);
			} else {
				segundadose += 1;
			}
		}
		for (int i = 0; i < 61; i++)
			System.out.printf("-");
		System.out.printf("\nTotal de vacinados acima de 65 anos: %s\n", this.calcularTotalVacinadosAcimaDe(65));
		System.out.printf("Total de vacinados que não tomaram a 2a. dose: %s\n", (primeiradose-segundadose));
		System.out.printf("Total de vacinados que tomaram a 2a. dose: %s\n", segundadose);
	}

	public ArrayList<RegistroVacina> getVacinados() {
		return vacinados;
	}

	public void setVacinados(ArrayList<RegistroVacina> vacinados) {
		this.vacinados = vacinados;
	}

}
