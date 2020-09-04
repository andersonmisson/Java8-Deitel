// Figura 6.8: Craps.java
// A classe Craps simula o jogo de dados craps.

package br.com.java8.capitulo06.exemplo_06_08;

import java.security.SecureRandom;

public class Craps {

	// cria um gerador seguro de números aleatórios para uso no método rollDice
			private static final SecureRandom randomNumbers = new SecureRandom();
			
	// tipo enum com constantes que presentam o estado do jogo
			private enum Status {CONTINUE, WON, LOST};
			
	// constantes que representam lançamentos comuns dos dados
			private static final int SNAKE_EYES = 2;
			private static final int TREY = 3;
			private static final int SEVEN = 7;
			private static final int YO_LEVEN = 11;
			private static final int BOX_CARS = 12;
	
	// jogar uma partida de craps
	public static void main(String[] args) {
		
		int myPoint = 0; // pontos se não ganhar ou perder na 1º rolagem
		Status gameStatus; // pode conter CONTINUE, WON, LOST
		
		int sumOfDice = rollDice(); // primeira rolagem de dados
		
		// determina o estado do jogo e a pontuação com base no primeiro lançamento
		switch (sumOfDice) {
		
			case SEVEN: // ganha com 7 no primeiro lançamento
			case YO_LEVEN: // ganha com 11 no primeiro lançamento
				gameStatus = Status.WON;
				break;
				
			case SNAKE_EYES: // perde com 2 no primeiro lançamento
			case TREY: // perde com 3 no primeiro lançamento
			case BOX_CARS: // perde com 2 no primeiro lançamento
				gameStatus = Status.LOST;
				break;
				
			default: // não ganhou nem perder, porntanto regista a pontuação
				gameStatus = Status.CONTINUE; // jogo não terminou
				myPoint = sumOfDice; // informa a Pontuação
				System.out.printf("Point is %d%n", myPoint);
				break;
		
		}
		
		// enquanto o jogo não estiver completo
		while (gameStatus == Status.CONTINUE) { // nem won, nem lost
		sumOfDice = rollDice(); // lança os dados novamente
		
		// determina o estado do jogo
		if (sumOfDice == myPoint) // vitoria por pontuação
			gameStatus = Status.WON;
		else
			if (sumOfDice == SEVEN) // perde obtendo 7 antes de atingir a pontuação
				gameStatus = Status.LOST;
		
		}
		
		// exibe uma mensagem ganhou ou perdeu
		if (gameStatus == Status.WON)
			System.out.println("Player Wins");
		else
			System.out.println("Player Loses");

	}
	
	// lança os dados, calcula a soma e exibe os resultados
	public static int rollDice() {
		// seleciona valores aleatórios do dado
		int die1 = 1 + randomNumbers.nextInt(6); // primeiro lançamento do dado
		int die2 = 1 + randomNumbers.nextInt(6); // segundo lançamento do dado
		
		int sum = die1 + die2; // soma dos valores dos dados
		
		// exibe os resultados desse lançamento
		System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
		
		return sum;
		
	}

}// fim da classe Craps
