package com.apolo.atividade5.questao2;

public class Triangulo {
	private int lado1;
	private int lado2;
	private int lado3;
	
	public Triangulo(int l1, int l2, int l3) throws DimensoesInvalidasException {
		this.verificaLados(l1, l2, l3);
	}
	public int getLado1() {
		return lado1;
	}
	public void setLado1(int lado1) throws DimensoesInvalidasException {
		this.verificaLados(lado1, this.lado2, this.lado3);
	}
	public int getLado2() {
		return lado2;
	}
	public void setLado2(int lado2) throws DimensoesInvalidasException {
		this.verificaLados(this.lado1, lado2, this.lado3);
	}
	public int getLado3() {
		return lado3;
	}
	public void setLado3(int lado3) throws DimensoesInvalidasException {
		this.verificaLados(this.lado1, this.lado2, lado3);
	}
	
	private void verificaLados(int lado1, int lado2,int lado3) throws DimensoesInvalidasException {
		if((lado1 < Math.abs(lado2-lado3)) || (lado2 < Math.abs(lado1-lado3)) || (lado3 < Math.abs(lado1-lado2))) {
			throw new DimensoesInvalidasException("Um lado é menor que a diferença dos outros lados");
		}else if((lado1 > lado2+lado3) || (lado2 > lado1+lado3) || (lado3 > lado1+lado2)) {
			throw new DimensoesInvalidasException("Um lado é maior que a soma dos outros lados");
		}else {
			this.lado1 = lado1;
			this.lado2 = lado2;
			this.lado3 = lado3;
		}
	}
}
