package br.com.fiap.banco;

import java.io.Serializable;

/**
 * Classe que abstrai uma Conta Bancária
 * @author Santiago Chiniske
 * @version 1.0
 */
public class Conta implements Serializable {
	
	//Atributos da classes
	private int agencia;
	private int numero;
	private double saldo;
	
	
	//contrututores
	public Conta() {
		
	}
	
	  public Conta(int agencia,int numero,double saldo) {
	  
	  this.agencia = agencia; this.numero = numero; this.saldo = saldo;
	  
	  }
	  
	  
	 


	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	

	/**
	 * Acrescentar valor ao Saldo da Conta
	 * @param valor que será depositado
	 */
	public void deposito(double valor) {
	
		this.saldo += valor;
		
	}
	
	
	/**Retira um valor do Saldo da Conta
	 * @param valor
	 * @see deposito
	 */
	public void retirar(double valor) {
		this.saldo -= valor;
	}
	
	
	/**
	 * Verificar o Saldo da conta
	 * @return Valor do Saldo da Conta
	 */
	
	public double getSaldo() {
		
		return this.saldo;
	}
	
	
}
