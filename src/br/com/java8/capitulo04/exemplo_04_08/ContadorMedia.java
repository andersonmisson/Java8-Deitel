package br.com.java8.capitulo04.exemplo_04_08;

import java.util.Scanner;

public class ContadorMedia {

	public static void main(String[] args) {

		// Criar Scanner para obter a entrada a partir da janela de comando
		Scanner sc = new Scanner(System.in);

		// Fase de inicialização
		int total = 0; // Inicializa a soma das notas inseridas pelo usuário
		int contador = 1; // Inicializa número de notas a ser inserido em seguida

		// Fase de processamento utiliza repetição controlada por contador
		while (contador <= 10) { // faz o loop 10 vezes
			System.out.print("Notas: "); // prompt
			int notas = sc.nextInt(); // insere a proxima nota
			total = total + notas; // adiciona grade a total
			contador = contador + 1; // Incrementa o contador por 1
		}

		// fase de termino
		int media = total / 10; // divisão de inteiros produz um resultado inteiro

		// exibe o total e a média das notas
		System.out.printf("%nTotal de todas as 10 notas: %d%n", total);
		System.out.printf("Média da Classe: %d%n", media);

	}

}
