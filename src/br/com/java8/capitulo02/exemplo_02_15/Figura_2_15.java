package br.com.java8.capitulo02.exemplo_02_15;

//Autor: Anderson Misson

import java.util.Scanner;

// Figura 2.15: Comparação.java
// Compara inteiros utilizando instruções IF, operadores relacionais
// e operadores de igualdade

public class Figura_2_15 {
	// método main inicia a execução do aplicativo Java
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero1; // primeiro número a comparar
		int numero2; // segundo número a comparar
		
		System.out.print("Entre com o primeiro número inteiro: ");
		numero1 = input.nextInt(); // lê o primeiro número fornecido pelo usuário
		
		System.out.print("Entre com o segundo número inteiro: ");
		numero2 = input.nextInt(); // lê o segundo número fornecido pelo usuário
		
		if (numero1 == numero2)
			System.out.printf("%d == %d%n", numero1, numero2);
		
		if (numero1 != numero2)
			System.out.printf("%d != %d%n", numero1, numero2);
		
		if (numero1 < numero2)
			System.out.printf("%d < %d%n", numero1, numero2);
		
		if (numero1 > numero2)
			System.out.printf("%d > %d%n", numero1, numero2);
		
		if (numero1 <= numero2)
			System.out.printf("%d <= %d%n", numero1, numero2);
		
		if (numero1 >= numero2)
			System.out.printf("%d >= %d%n", numero1, numero2);

	} // fim do método main

} // fim da classe Comparação (Figura 2.15)
