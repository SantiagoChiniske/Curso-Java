package com.java.operadores;

public class OpeadorLogico {

	public static void main(String[] args) {
		
		
		//Operador lógico E
		int idade = 20;
		
		boolean precisaVotar= idade >= 18 && idade< 70;
		
		System.out.println(precisaVotar);
		
		//Operador lógico OU
		
		int nrAmarelo = 2, nrVermelho = 1;
		
		boolean suspenso = nrAmarelo == 2 || nrVermelho ==1;
		
		System.out.println(suspenso); 
		
		
		int x = 9, y =11;
		
		boolean teste = x > 10 ^ y >  10;
		
		System.out.println(teste);
		
		
		idade = 20;
		
		boolean maiorIdade = !(idade>=18);
		System.out.println(maiorIdade);
	}
}
