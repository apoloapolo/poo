package com.apolo.contabancaria;

public class ContaBancaria {
	
	private String numConta;
	private String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	public void estadoAtual() {
		System.out.println("------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
	
	public ContaBancaria() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.setSaldo(50);
		}else if (t== "CP") {
			this.setSaldo(150); 
		}
		System.out.println("Conta aberta");
	
	}
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta ainda contém dinheiro");
		}else if (this.getSaldo() < 0) {
			System.out.println("Conta tem débito");
		}else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso");
		}
	}
	public void depositar(double v) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Deposito feito na conta de " + this.getDono());
		}else {
			System.out.println("Não é possível depositar");
		}
	}
	public void sacar(double v) {
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque feito na conta de " + this.getDono());
			}else {
				System.out.println("Saldo insuficiente");
			}
		}else {
			System.out.println("Não é possível sacar");
		}
	}
	public void pagarMensal() {
		int v = 0;
		if (this.getTipo() == "CC") {
			v = 12;
		}else {
			v = 20;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo()- v);
			System.out.println("Mensalidade paga por " + this.getDono());
		}else {
			System.out.println("Impossível pagar mensalidade");
		}
	}
}
