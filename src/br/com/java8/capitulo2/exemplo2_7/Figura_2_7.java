package br.com.java8.capitulo2.exemplo2_7;

import java.util.Scanner; // Programa ultiliza a classe Scanner

// Figura 2.7: Adição.java
// Programa que faz a adição de dois números e a soma deles
public class Figura_2_7 {

	// Metodo main inicia a execução do aplicativo Java
	public static void main(String[] args) {
		// Cria um Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);

		int numero1; // Primeiro número para somar
		int numero2; // Segundo número para somar
		int soma; // soma de numero1 e numero2

		System.out.print("Entre com o primeiro número inteiro: "); // prompt
		numero1 = input.nextInt(); // lê primeiro número fornecido pelo usuário;

		System.out.print("Entre com o segundo número inteiro: ");
		numero2 = input.nextInt(); // lê segundo número fornecido pelo usuário

		soma = numero1 + numero2; // Soma os números, e armazena na variavel soma

		System.out.printf("Soma é %d%n", soma); // Exibe a soma

	}

}
