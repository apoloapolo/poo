package questao01;

import java.util.ArrayList;

public class MinhaLoteria {

	public static void main(String[] args) {
		BilheteLoteria bilhetePremiado = new BilheteLoteria(6);

		for (int i = 6; i <= 15; i++) {
			int n = 0;
			int qtd = 0;
			int quadras = 0;
			int quinas = 0;
			int megasena = 0;
			ArrayList<BilheteLoteria> bilhetes = new ArrayList<BilheteLoteria>();
			while (megasena != 1) {
				n++;
				BilheteLoteria bilheteSorteado = new BilheteLoteria(i);
				bilhetes.add(bilheteSorteado);
				qtd = bilheteSorteado.qtdNumerosContidos(bilhetePremiado);
				switch (qtd) {
				case 4:
					quadras++;
					break;
				case 5:
					quinas++;
					break;
				case 6:
					megasena++;
					System.out.printf("PARABÉNS VOCÊ GANHOU NA MEGASENA DEPOIS DE %d TENTATIVAS DE JOGO!\n", n);
					System.out.printf("O bilhete sorteado foi %s e o bilhete premiado é  %s\n", bilheteSorteado.toString(), bilhetePremiado.toString());
					break;
				}
			}
			System.out.printf(
					"Jogos de %d números: você apostou %d vezes para ganhar na mega-sena. Dentre esses jogos, você acertou %d quadras e %d quinas.\n\n",
					i, n, quadras, quinas);
		}
	}
}
