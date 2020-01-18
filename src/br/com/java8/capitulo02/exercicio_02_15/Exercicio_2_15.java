package br.com.java8.capitulo02.exercicio_02_15;

import java.util.Scanner;

public class Exercicio_2_15 {

	public static void main(String[] args) {
		// Importando Scanner
		Scanner input = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int soma;
		int subtracao;
		int multiplicacao;
		int divisao;
		
		System.out.print("Entre Com O Primeiro Número Inteiro: ");
		numero1 = input.nextInt();
		
		System.out.print("Entre Com o Segundo Número Inteiro: ");
		numero2 = input.nextInt();

		soma = numero1 + numero2;
		subtracao = numero1 - numero2;
		multiplicacao = numero1 * numero2;
		divisao = numero1 / numero2;
		
		System.out.printf("%d + %d = %d%n", numero1, numero2, soma);
		System.out.printf("%d - %d = %d%n", numero1, numero2, subtracao);
		System.out.printf("%d * %d = %d%n", numero1, numero2, multiplicacao);
		System.out.printf("%d / %d = %d%n", numero1, numero2, divisao);
	}

}
