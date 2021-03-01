package br.com.java8.capitulo07.exemplo_07_07;

import java.security.SecureRandom;

// Figura 7.7: RollDie.java
// Programa de jogo de dados utilizando arrays em vez de switch

public class RollDie {

	public static void main(String[] args) {
		
		SecureRandom randomNumbers = new SecureRandom();
		int[] frequency = new int[7]; // array de contadores de frequencia.
		
		// lança o dado 6 milhões de vezes; usa o valor do dado como indice de frequencia
		for(int roll = 1; roll <= 6000000; roll++) {
			++frequency[1 + randomNumbers.nextInt(6)];
		}
		
		System.out.printf("%s%10s%n", "Face", "Frequency");

		// Gera saída do valor de cada elemento do array
		for(int face = 1; face  < frequency.length; face++) {
			System.out.printf("%4d%10d%n", face, frequency[face]);
		}
		
	}

} // fim da classe RollDie
