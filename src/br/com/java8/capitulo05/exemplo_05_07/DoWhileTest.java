package br.com.java8.capitulo05.exemplo_05_07;

//Autor: Anderson Misson
//Figura 5.7: DoWhileTest.java
//Introdução de repetição Do...While

public class DoWhileTest {

	public static void main(String[] args) {
		
		int contador = 1;
		
		do {
			System.out.printf("%d ", contador);
			++contador;
		}while(contador <= 10);// Fim da introdução DO...WHILE
		System.out.println();
	}

}// Fim da Classe DO...WHILE
