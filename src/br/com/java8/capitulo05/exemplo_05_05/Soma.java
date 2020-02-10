package br.com.java8.capitulo05.exemplo_05_05;

//Autor: Anderson Misson
//Figura 5.5: Soma.java
//Somando inteiro com o FOR

public class Soma {

	public static void main(String[] args) {

		int total = 0;

		// Total de Inteiros pares de 2 a 20

		for (int numero = 2; numero <= 20; numero += 2) {
			total += numero;
		}
		System.out.printf("Soma é %d%n", total);
	}
}// Fim da Classe Soma
