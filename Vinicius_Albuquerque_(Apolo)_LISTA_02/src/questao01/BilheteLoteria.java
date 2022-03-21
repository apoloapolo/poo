package questao01;

import java.util.Arrays;
import java.util.Random;

public class BilheteLoteria {
	private int[] bilhete;
	boolean contains;
	int valor;
	
	public BilheteLoteria(int tamanho) {
		Random gerador = new Random();
		
		this.bilhete = new int[tamanho];
		
		
		for (int i = 0; i < tamanho; i++) {
			this.valor = gerador.nextInt(61);
			this.contains = Arrays.stream(this.bilhete).anyMatch(x -> x == valor);
			while(this.contains) {
				this.valor = gerador.nextInt(61);
				this.contains = Arrays.stream(this.bilhete).anyMatch(x -> x == valor);
			}
			this.bilhete[i] = this.valor;
		}
		
		Arrays.sort(this.bilhete);
	}
	public String toString() {
		String print = "[ ";
		for (int i = 0; i < this.bilhete.length-1; i++) {
			print = print + String.valueOf(this.bilhete[i])+", ";
		}
		print = print + this.bilhete[bilhete.length-1];
		print = print + " ]";
		return print;
	}
	
	public int qtdNumerosContidos(BilheteLoteria b) {
		int qtd = 0;
		for ( int i: b.getBilhete()) {
			boolean contem = Arrays.stream(this.bilhete).anyMatch(x -> x == i);
			if(contem) {
				qtd++;
			}else {
				continue;
			}
		}
		return qtd;
		
	}
	public int[] getBilhete() {
		return this.bilhete;
	}
	
	
}
