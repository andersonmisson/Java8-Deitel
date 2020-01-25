package br.com.java8.capitulo04.exemplo_04_12;

import java.util.Scanner;

// Autor: Anderson Misson
// Figura 04.12 - Analysis.java

public class Analysis {

	public static void main(String[] args) {

		// Cria Scanner para obter entrada a partir da janela de comando
		Scanner sc = new Scanner(System.in);

		// Iniciando variáveis nas declarações
		int passou = 0;
		int reprovou = 0;
		int contador = 1;

		// processa 10 alunos utilizando o loop controlado por contador
		while (contador <= 10) {

			// solicita ao usuário uma entrada e obtém valor fornecido pelo usuário
			System.out.print("Resultado: (1 = Passou, 2 = Reprovou): ");
			int resultado = sc.nextInt();

			// if... else está aninhado na instrução while
			if (resultado == 1) {
				passou = passou + 1;
			} else {
				reprovou = reprovou + 1;
			}

			// incrementa contador até o loop terminar
			contador = contador + 1;

		} // Fim do While

		// fase de término; prepara e exibe os resultados
		System.out.printf("APROVADO: %d%nREPROVADO: %d%n", passou, reprovou);

		// determina se mais de 8 alunos foram aprovados
		if (passou > 8) {
			System.out.println("Bonus para o Professor.");
		}

	}

}// fim da classe Analysis
