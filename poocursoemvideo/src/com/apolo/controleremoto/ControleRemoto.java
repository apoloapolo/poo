package com.apolo.controleremoto;

public class ControleRemoto implements Controlador{
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}
	
	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		if(this.getLigado()) {
			System.out.println("---- MENU ----");
			System.out.println("Está ligado? " + this.getLigado());
			System.out.println("Está tocando? " + this.getTocando());
			System.out.print("Volume: " + this.getVolume()+ " ");
			if(this.getVolume()> 0) {
				for ( int i = 0; i <= this.getVolume(); i += 10) {
					System.out.print("|");
			}
			}
		}else {
			System.out.println("Impossível abrir menu");
		}
	}
	
	@Override
	public void fecharMenu() {
		if(this.getLigado()) {
			System.out.println("\nFechando Menu...");
		}else {
			System.out.println("Impossível fechar menu");
		}
	}

	@Override
	public void maisVolume() {
		if(this.getLigado() && this.getVolume() <=100) {
			this.setVolume(this.getVolume() + 10);
		}else {
			System.out.println("Impossível aumentar volume");
		}
	}
	
	@Override
	public void menosVolume() {
		if(this.getLigado() && this.getVolume() >= 10) {
			this.setVolume(this.getVolume()-10);
		}else {
			System.out.println("Impossível diminuir volume");
		}
	}
	
	@Override
	public void ligarMudo() {
		if (this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {
		if (this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}

	@Override
	public void play() {
		if(this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}else {
			System.out.println("Não posso reproduzir");
		}
	}

	@Override
	public void pause() {
		if(this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}else {
			System.out.println("Não posso pausar");
		}
	}
}
