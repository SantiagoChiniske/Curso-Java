package com.java.operadores;

public class OperadorIgualdadeRelacionais {

	public static void main(String[] args) {
		
		int idade = 10;
		
		boolean maioridade = idade > 18;
		
		System.out.println(maioridade);
		
		 idade = 18;
		
		 maioridade = idade == 18;
		
		System.out.println(maioridade);
		
		idade = 20;
		
		 maioridade = idade != 18;
		
		System.out.println(maioridade);
		
		idade = 20;
		
		 maioridade = idade >= 18;
		
		System.out.println(maioridade);
	}
}
