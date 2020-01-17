package br.com.java8.capitulo2.exercicio2_6;

import java.util.Scanner;

// Exercício 2.6: Produto.java
// Calcula o produto de três inteiros

public class Exercicio_2_6 {
	
	public static void main(String[] args) {
		// Cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		int x; // primeiro número inserido pelo usuário
		int y; // segundo número inserido pelo usuário
		int z; // terceiro número inserido pelo usuário
		int resultado; // produto dos números
		
		System.out.print("Entre Com o Primeiro Inteiro: ");
		x = input.nextInt(); // lê o primeiro inteiro
		
		System.out.print("Entre Com o Segundo Inteiro: ");
		y = input.nextInt(); // lê o segundo inteiro
		
		System.out.print("Entre Com o Terceiro Inteiro: ");
		z = input.nextInt(); // lê o terceiro inteiro
		
		resultado = x * y * z; // calcula o produto dos números
		
		System.out.printf("Produto é %d%n", resultado);

	} //fim do método main

} // fim do método main
