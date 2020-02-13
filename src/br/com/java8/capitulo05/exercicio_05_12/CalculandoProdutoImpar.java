package br.com.java8.capitulo05.exercicio_05_12;

//Autor: Anderson Misson
//Exercício 05.12: CalculandoProdutoImpar.java

public class CalculandoProdutoImpar {

	public static void main(String[] args) {

		int numero = 1, produto = 1;

		for (numero = 1; numero <= 15; numero += 2) {
			
			produto = produto * numero;
		
			System.out.println(produto);

		}
	}

}
