package br.com.java8.capitulo04.exercicio_04_33;

public class LoopInfinito {

	public static void main(String[] args) {

		int numero = 2;

		while (true) {

			numero *= 2;
			System.out.println(numero);
		}

	}

}
