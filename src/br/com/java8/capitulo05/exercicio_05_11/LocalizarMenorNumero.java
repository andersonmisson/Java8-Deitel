package br.com.java8.capitulo05.exercicio_05_11;

import java.util.Scanner;

public class LocalizarMenorNumero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int menorNumero, numero, contador;

		System.out.print("Número Inteiros(Primeiro o Valor de Vezes que você vai inserir os dados): ");
		contador = sc.nextInt();
		menorNumero = sc.nextInt();

		for (int i = 1; i < contador; i++) {

			numero = sc.nextInt();

			if (numero < menorNumero) {
				menorNumero = numero;
			}
		}
		System.out.printf("Menor Número é: %d", menorNumero);
		sc.close();
	}

}
