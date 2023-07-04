package com.java;

public class Conta {

	//variaveis
	private int numero;
	private double saldo;
	int agencia;
	
	
	public Conta () {
		
	}
	
	public Conta (int numero) {
		this.numero = numero;
		this.saldo = 0;
	}
	
	public Conta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	
	public Conta (double saldo) {
		this.saldo = saldo;
	}
	
	//Herdar de outra clase
	Cliente cliente = new Cliente();
	
	//Metódos
	public double recuperarSaldo() {
		return saldo;
	}
	
	public void depositar (double valor) {
		saldo = saldo + valor;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void retirar(double valor) {
		saldo = saldo-valor;
	}
	
	public void retirar (double valor, double taxa) {
		saldo = saldo - valor - taxa;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	
}
