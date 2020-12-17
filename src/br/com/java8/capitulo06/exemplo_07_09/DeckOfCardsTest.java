package br.com.java8.capitulo06.exemplo_07_09;

// Figura 07.11: DeckOf Cards Test.java
// Embaralhando e distribuindo cartas

public class DeckOfCardsTest {
	
	// executa o aplicativo
	public static void main(String[] args) {
		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle(); // Coloca Cards em ordem Aleatoria.
		
		// imprime todas as 52 cartas em ordem em que elas são distribuidas
		for(int i= 1; i <= 52; i++) {
			// distribui e exibe uma Card
			System.out.printf("%-19s", myDeckOfCards.dealCard());
			
			if (i % 4 == 0) // Gera uma nova linha após cada quarta carta
				System.out.println();
		}
	}

} // Fim da Classe DeckOfCardTest
