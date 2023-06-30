package com.java.operadores;

public class FluxoControle {

	public static void main(String[] args) {
		
		int idade = 85;
		
		if  (idade >= 18 && idade < 70) {
			System.out.println("Maior Idade");
		}else if (idade >=70){
			System.out.println("Terceira Idade");
			if(idade>= 100) {
				System.out.println("Centenário");
			}
		}else {
			System.out.println("Menor Idade");
		}
	}
}
