package br.com.java8.capitulo04.exercicio_04_23;

import java.util.Scanner;

public class DoisNumerosMaiores {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int contador = 1;
		int maiorNumero = 0;
		int segundoMaior = 0;

		while (contador <= 10) {

			System.out.print("Número: ");
			int numero = sc.nextInt();

			if (numero > maiorNumero) {
				segundoMaior = maiorNumero;
				maiorNumero = numero;
			} else if (numero > segundoMaior) {
				segundoMaior = numero;
			}
			contador++;

		}
		System.out.printf("Maior Número: %d%n", maiorNumero);
		System.out.printf("Segundo Maior: %d%n", segundoMaior);
		sc.close();

	}

}
