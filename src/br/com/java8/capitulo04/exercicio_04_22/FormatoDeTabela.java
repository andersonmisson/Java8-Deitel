package br.com.java8.capitulo04.exercicio_04_22;

public class FormatoDeTabela {

	public static void main(String[] args) {

		int contador = 1;

		System.out.print("N\t10*N\t100*N\t1000*N\n\n");
		while (contador <= 5) {

			if (contador == 1) {
				System.out.printf("%d\t%d\t%d\t%d\n", contador, contador * 10, contador * 100, contador * 1000);
				contador++;
			}

			if (contador == 2) {
				System.out.printf("%d\t%d\t%d\t%d\n", contador, contador * 10, contador * 100, contador * 1000);
				contador++;
			}

			if (contador == 3) {
				System.out.printf("%d\t%d\t%d\t%d\n", contador, contador * 10, contador * 100, contador * 1000);
				contador++;
			}

			if (contador == 4) {
				System.out.printf("%d\t%d\t%d\t%d\n", contador, contador * 10, contador * 100, contador * 1000);
				contador++;
			}

			if (contador == 5) {
				System.out.printf("%d\t%d\t%d\t%d\n", contador, contador * 10, contador * 100, contador * 1000);
				contador++;
			}
		}
	}

}