package br.com.java8.capitulo05.exemplo_05_09;

import java.util.Scanner;

//Autor: Anderson Misson
//Figura 5.6: Interesse.java
//A classe LetterGrades utiliza a instrução switch para contar as letras das notas escolares.

public class LetterGrades {

	public static void main(String[] args) {

		int total = 0; // Soma das Notas
		int contadorDeNotas = 0; // Número de notas inseridas
		int aContador = 0; // Contage de notas A
		int bContador = 0; // Contage de notas B
		int cContador = 0; // Contage de notas C
		int dContador = 0; // Contage de notas D
		int fContador = 0; // Contage de notas F

		Scanner sc = new Scanner(System.in);

		System.out.printf("%s%n%s%n   %s%n   %s%n", "Digite as notas inteiras no intervalo de 0 a 100.",
				"Digite o indicador de fim de arquivo para finalizar a entrada:",
				"No UNIX / Linux / Mac OS X, digite <Ctrl> d e pressione Enter",
				"No Windows, digite <Ctrl> z e pressione Enter");

		// Faz loop até o usuário inserir o indicador de fim do arquivo
		while (sc.hasNext()) {

			int notas = sc.nextInt(); // Lê a nota
			total += notas; // Adiciona nota a total
			++contadorDeNotas; // incrementa o número de notas

			// incrementa o contador de letras de nota adequado
			switch (notas / 10) {

			case 9: // a nota estava entre 90
			case 10: // e 100, inclusivo
				++aContador;
				break; // sai do switch

			case 8: // nota estava entre 80 e 89
				++bContador;
				break; // sai do switch

			case 7: // nota estava entre 70 e 79
				++cContador;
				break;// sai do switch

			case 6: // nota estava entre 60 e 69
				++dContador;
				break; // sai do switch

			default: // a nota era menor que 60
				++fContador;
				break; // opcional, fecha switch de qualquer maneira

			}// fim do switch

		} // fim do while

		// Exibe relatório da nota
		System.out.printf("%nRelátorio de Notas:%n");

		// Se o usuário inseriu pelo menos uma nota...
		if (contadorDeNotas != 0) {

			// gera a saída de resumo de resultados
			double media = (double) total / contadorDeNotas;

			// gera a saida de resumo de resultados
			System.out.printf("Total de %d notas inseridas é %d%n", contadorDeNotas, total);
			System.out.printf("Média da Classe é %.2f%n", media);
			System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n", "Número de Alunos que receberam cada nota:",
					"A: ", aContador, // exibe número de notas A
					"B: ", bContador, // exibe número de notas B
					"C: ", cContador, // exibe número de notas C
					"D: ", dContador, // exibe número de notas D
					"F: ", fContador); // exibe número de notas F
		} // fim do if
		else { // nenhuma nota foi inserida, assim gera a saída da mensagem spropriada
			System.out.println("Nenhuma nota foi inserida.");
		}
	}// fim de main

}// finaliza a classe letterGrades
