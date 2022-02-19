package com.apolo.controleremoto;

public class ClassePrincipal {

	public static void main(String[] args) {
		ControleRemoto c = new ControleRemoto();
		c.ligar();
		c.ligarMudo();
		c.menosVolume();
		c.play();
		c.abrirMenu();
		c.fecharMenu();
	}

}
