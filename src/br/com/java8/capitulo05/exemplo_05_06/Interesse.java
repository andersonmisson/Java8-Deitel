package br.com.java8.capitulo05.exemplo_05_06;

//Autor: Anderson Misson
//Figura 5.6: Interesse.java
//Calculo de juros compostos com for

public class Interesse {

	public static void main(String[] args) {
		
		double montante; // Quantia em deposito ao fim de cada ano
		double principal = 1000.0; // quantidade inicial antes do juros
		double taxa = 0.05; // taxa de juros
		
		// exibe cabeçalhos
		System.out.printf("%s%20s %n", "Ano", " Deposito do Montante:");
		
		// Calcula quantidade de depositos para cada um dos dez anos
		for(int ano = 1; ano <=10; ano++) {
			
			// Calcula nova quantidade durante ano especifico
			montante = principal * Math.pow(1.0 + taxa, ano);
			
			// Exibe o Ano e a Quantidade
			System.out.printf("%3d%, 20.2f%n", ano, montante);
			
		}
		

	}

}// Fim Da Classe Interesse
