package br.com.fiap.banco;

public class Conta {
	
	protected int agencia;
	int numero;
	double saldo;
	
	//contrututores
	public Conta() {
		
	}
	
	
	public Conta(int agencia,int numero,double saldo) {
		
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
				
	}


	//metódos
	public void deposito(double valor) {
		
		this.saldo += valor;
		
	}
	
	
	public void retirar(double valor) {
		this.saldo -= valor;
	}
	
	
	public double verificarSaldo() {
		
		return this.saldo;
	}
	
	
}
