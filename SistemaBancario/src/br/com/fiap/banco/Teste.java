package br.com.fiap.banco;

public class Teste {
	
	public static void main(String[] args) {
		
		
		
		Conta cc = new Conta();
		
		
		cc.deposito(50); 
		cc.setAgencia(123); 
		cc.setNumero(321);
		
		cc.deposito(1000);
		
		System.out.println(cc.getSaldo());
		
		
		Conta poupanca = new Conta(111,222,1000);
		
		poupanca.retirar(50);
		
		System.out.println(poupanca.getSaldo());
		
		
		Conta cc2 = null;
		
		if(cc2 != null){
			
			cc2.deposito(1000);
		
		
		
		
		}

	}
}
