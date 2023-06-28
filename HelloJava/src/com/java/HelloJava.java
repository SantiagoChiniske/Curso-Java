package com.java;

public class HelloJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Tipos de Dados
		int idade = 10;
		double preco = 10.0;
		char sexo ='M';
		boolean temFilhos = true;
		
		System.out.println(idade);
		System.out.println(preco);
		System.out.println(sexo);
		System.out.println(temFilhos);
		
		
		//Conversão de valores
		
		int x =   10; // Declaração de variavel do tipo  int
		double d = x; //variável double recebe um tipo int
		long l = x ; // variavel long recebe um tipo int
		float f = x; //variável float recebe um tipo int (atenção)
		short s = 20; // declaração de variável do tipo short
		x = s; //variavel int recebe um tipo short
		
		double valorDouble = 9.99;
		int valorInt = (int) valorDouble;
		System.out.println(valorInt);
		
		
		//Print na tela
		System.out.println("Hello Java");
	}

}
