package br.com.java8.capitulo04.exercicio_04_29;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamanhoLado;

		do {
			System.out.print("Entre com o tamanho do lado do quadrado(1 - 20): ");
			tamanhoLado = sc.nextInt();
		} while (tamanhoLado > 20 || tamanhoLado < 1);
		QuadradoDeAsteriscos Q = new QuadradoDeAsteriscos(tamanhoLado);

		System.out.println();
		System.out.println(Q.quadradoAsteriscos());

		sc.close();
	}
	
}