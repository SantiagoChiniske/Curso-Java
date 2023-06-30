package com.java.operadores;

import java.util.Scanner;

public class LeituraDeDados {


		public static void main(String[] args) {

			int idade = 0;
			
			Scanner sc = new Scanner (System.in);
			System.out.println("Digite a Idade");
			idade = sc.nextInt();
			
			if(idade< 0) {
				System.out.println("Idade Inválida");
			}
			else if  (idade >= 18 && idade < 70) {
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
