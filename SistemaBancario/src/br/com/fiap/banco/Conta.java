package br.com.fiap.banco;


/**
 * Classe que abstrai uma Conta Bancária
 * @author Santiago Chiniske
 * @version 1.0
 */
public class Conta {
	
	//Atributos da classes
	int agencia;
	int numero;
	double saldo;
	
	
	//contrututores
	public Conta() {
		
	}
	
	  public Conta(int agencia,int numero,double saldo) {
	  
	  this.agencia = agencia; this.numero = numero; this.saldo = saldo;
	  
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
	
	public double verificarSaldo() {
		
		return this.saldo;
	}
	
	
}
