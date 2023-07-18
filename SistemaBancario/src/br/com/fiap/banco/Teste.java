package br.com.fiap.banco;

public class Teste {
	
	public static void main(String[] args) {
		
		
		Conta conta1 = new Conta();
		
		conta1.deposito(1000);
		conta1.retirar(100);
		
		ContaCorrente conta2 = new ContaCorrente();
		conta2.deposito(1000);
		conta2.retirar(100);
		
		Conta conta3 = new ContaCorrente();
		conta3.deposito(1000);
		conta3.retirar(100);
		
		
		System.out.println("Conta1:"+ conta1.getSaldo());
		System.out.println("Conta2:"+ conta2.getSaldo());
		System.out.println("Conta3:"+ conta3.getSaldo());
}
}
