package com.apolo.atividade6;

import javax.swing.JFrame;

public class Janela {

	public static void main(String[] args) {
		Cadastro janela = new Cadastro();
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(525, 330);
		janela.setVisible(true);
		}
	}

