package questao03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RegistroVacina {
	private String id;
	private LocalDate data_vacinacao;
	private String atendente;
	private int dose;
	private String local;
	private String grupo;
	private Vacina vacina;
	private Pessoa vacinado;

	List<String> grupos = new ArrayList<String>(
			Arrays.asList(new String[] { "IDOSOS", "TRABALHADORES DA SAÚDE", "OUTRAS PRIORIDADES" }));
	List<String> locais = new ArrayList<String>(Arrays.asList(new String[] { "DRIVE THRU - UFRPE - UNIVERSIDADE RURAL",
			"DRIVE THRU GERALDÃO", "CENTRO DE VACINAÇÃO PARQUE DE EXPOSIÇÃO",
			"CENTRO DE VACINAÇÃO  COMPAZ ARIANO SUASSUNA", "DRIVE THRU PARQUE DE EXPOSIÇÃO", "DRIVE THRU ARRUDA" }));

	public RegistroVacina(String id, LocalDate data_vacinacao, String atendente, int dose, String local, String grupo, Vacina vacina, Pessoa vacinado) {
		if (dose == 1 | dose == 2) {
			if (locais.contains(local)) {
				if (grupos.contains(grupo)) {
					this.id = id;
					this.data_vacinacao = data_vacinacao;
					this.atendente = atendente;
					this.dose = dose;
					this.local = local;
					this.grupo = grupo;
					this.vacina = vacina;
					this.vacinado = vacinado;
				} else {
					System.out.println("Registro não criado, grupo inválido");
				}
			} else {
				System.out.println("Registro não criado, local inválido");
			}
		} else {
			System.out.println("Registro não criado, número da dose inválido");
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDate getData_vacinacao() {
		return data_vacinacao;
	}

	public void setData_vacinacao(LocalDate data_vacinacao) {
		this.data_vacinacao = data_vacinacao;
	}

	public String getAtendente() {
		return atendente;
	}

	public void setAtendente(String atendente) {
		this.atendente = atendente;
	}

	public int getDose() {
		return dose;
	}

	public void setDose(int dose) {
		if (dose == 1 | dose == 2) {
			this.dose = dose;
		} else {
			System.out.println("Dose não alterada, número da dose inválido");
		}

	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		if (locais.contains(local)) {
			this.local = local;
		} else {
			System.out.println("Local não alterado, local inválido");
		}
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		if (grupos.contains(grupo)) {
			this.grupo = grupo;
		} else {
			System.out.println("Grupo não alterado, grupo inválido");
		}

	}

	public Vacina getVacina() {
		return vacina;
	}

	public void setVacina(Vacina vacina) {
		this.vacina = vacina;
	}

	public Pessoa getVacinado() {
		return vacinado;
	}

	public void setVacinado(Pessoa vacinado) {
		this.vacinado = vacinado;
	}

}
