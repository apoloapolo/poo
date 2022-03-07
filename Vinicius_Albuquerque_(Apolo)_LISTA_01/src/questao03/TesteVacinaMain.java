package questao03;

import java.time.LocalDate;

public class TesteVacinaMain {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("José Maria", "0333787383", "IDOSOS", LocalDate.of(1955, 01, 01));
		Pessoa p2 = new Pessoa("Maria José", "3830333787", "IDOSOS", LocalDate.of(1953, 01, 01));
		Pessoa p3 = new Pessoa("José Silva", "7870333383", "IDOSOS", LocalDate.of(1951, 01, 01));
		Pessoa p4 = new Pessoa("Maria Silva", "3787303383", "IDOSOS", LocalDate.of(1956, 01, 01));
		Pessoa p5 = new Pessoa("Apolo", "123456789", "IDOSOS", LocalDate.of(1957, 01, 01));
		
		Vacina v1 = new Vacina(1, "CORONAVAC", "LT1");
		Vacina v2 = new Vacina(2, "OXFORD", "LT1");
		
		RegistroVacina r1 = new RegistroVacina("R1", LocalDate.of(2021, 04, 22), "Maria", 1, "DRIVE THRU - UFRPE - UNIVERSIDADE RURAL", "IDOSOS", null, null);
		RegistroVacina r2 = new RegistroVacina("R2", LocalDate.of(2021, 04, 25), "Maria", 1, "DRIVE THRU GERALDÃO", "IDOSOS", null, null);
		RegistroVacina r3 = new RegistroVacina("R3", LocalDate.of(2021, 04, 24), "Maria", 1, "CENTRO DE VACINAÇÃO PARQUE DE EXPOSIÇÃO", "IDOSOS", null, null);
		RegistroVacina r4 = new RegistroVacina("R4", LocalDate.of(2021, 04, 30), "Maria", 1, "CENTRO DE VACINAÇÃO  COMPAZ ARIANO SUASSUNA", "IDOSOS", null, null);
		RegistroVacina r5 = new RegistroVacina("R5", LocalDate.of(2021, 04, 22), "Maria", 1, "DRIVE THRU PARQUE DE EXPOSIÇÃO", "IDOSOS", null, null);
		RegistroVacina r6 = new RegistroVacina("R6", LocalDate.of(2021, 04, 30), "Maria", 2, "DRIVE THRU ARRUDA", "IDOSOS", null, null);
		
		r1.setVacina(v1);
		r1.setVacinado(p1);
		
		r2.setVacina(v1);
		r2.setVacinado(p2);
		
		r3.setVacina(v1);
		r3.setVacinado(p3);
		
		r4.setVacina(v1);
		r4.setVacinado(p4);
		
		r5.setVacina(v2);
		r5.setVacinado(p5);
		
		r6.setVacina(v2);
		r6.setVacinado(p5);
		
		RelacaoVacinados rv1 = new RelacaoVacinados();
		
		rv1.adicionar(r1);
		rv1.adicionar(r2);
		rv1.adicionar(r3);
		rv1.adicionar(r4);
		rv1.adicionar(r5);
		rv1.adicionar(r6);
		
		rv1.listarPessoasQueNãoTomaram2aDose();
	}

}
