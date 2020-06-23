package br.com.java8.capitulo05.exercicio_05_13;

public class Fatoriais {

	public static void main(String[] args) {
	
		long fat = 1;

		System.out.println("Número\tFatorial");
		
		for (int i = 1; i <= 20 ; i++ ) {
			fat *= i;
			System.out.printf("%d\t%d\n", i, fat);
		}
	}
		
} // fim da classe
