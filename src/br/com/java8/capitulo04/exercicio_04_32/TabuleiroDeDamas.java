package br.com.java8.capitulo04.exercicio_04_32;

public class TabuleiroDeDamas {

	public static void main(String[] args) {

		for (int i = 1; i <= 8; i++) {

			if (i % 2 == 0) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 8; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}
	}

}