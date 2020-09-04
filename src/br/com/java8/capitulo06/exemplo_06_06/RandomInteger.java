package br.com.java8.capitulo06.exemplo_06_06;

import java.security.SecureRandom;

public class RandomInteger {

	public static void main(String[] args) {
		// O Objeto randomNumber produzirá números aleatórios seguros
		SecureRandom randomNumbers = new SecureRandom();

		// faz o loop 20 vezes
		for (int counter = 1; counter <= 20; counter++) {
			
			// seleciona o inteiro aleatório entre 1 e 6
			int face = 1 + randomNumbers.nextInt(6);
			
			System.out.printf("%d ", face); // Exibe o valor gerado
			
			// se o contador for divisível por 5, inicia uma nova linha de saída
			if (counter % 5 ==0)
				System.out.println();
			
		}
		
	}

} // fim da classe RandomIntegers
