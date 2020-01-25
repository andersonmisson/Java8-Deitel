package br.com.java8.capitulo04.exemplo_04_10;

import java.util.Scanner;

// Autor: Anderson Misson
// Figura 4.10: CkassAverage.java
// Resolvendo o problema da média da classe usando a repetição controlada por sentinela.

public class ClassAverage {

	public static void main(String[] args) {
		// Cria Scanner para Obter entrda a partir da janela de comando
		Scanner sc = new Scanner(System.in);

		// fase de inicialização
		int total = 0; // inicializa a soma das notas
		int contador = 0; // inicializa o n° de notas inseridas até agora

		// fase de processamento
		// solicita entrada e lê a nota do usuário
		System.out.print("Entre com as notas ou -1 para sair: ");
		int notas = sc.nextInt();

		// faz um loop até ler o valor de sentinela inserido pelo usuário
		while (notas != -1) {

			total = total + notas; // Adiciona Notas ao Total
			contador = contador + 1; // incrementa contador

			// solicita entrada e lê a próxima nota fornecida pelo usuário
			System.out.print("Entre com as notas ou -1 para sair: ");
			notas = sc.nextInt();
		}
		// fase de término
		// se o usuário inseriu pelo menos uma nota...

		if (contador != 0) {
			// usa número com ponto decimal para calcular média das notas
			double media = (double) total / contador;

			// exibe o total e a média (com dois digitos de precisão)
			System.out.printf("%nTotal de %d notas. Soma das notas: %d%n", contador, total);
			System.out.printf("Média da Classe : %.2f%n", media);

		} else // nenhuma nota foi inserida, assim gera a saída da mensagem apropriada
			System.out.println("Nenhuma nota foi inserida.");

	}

} // fim da classe ClassAverage
