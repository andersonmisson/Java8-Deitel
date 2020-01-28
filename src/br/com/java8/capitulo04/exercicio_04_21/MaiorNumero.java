package br.com.java8.capitulo04.exercicio_04_21;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int contador = 1;
		int maiorNumero = 0;

		System.out.println("Entre com 10 números");

		while (contador <= 10) {
			System.out.print("Número:");
			int numero = sc.nextInt();

			if (numero > maiorNumero) {
				maiorNumero = numero;
			}
			contador++;
		}
		System.out.printf("Maior Número: %d%n", maiorNumero);
		sc.close();

	}

}
