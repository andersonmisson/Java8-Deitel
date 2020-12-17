package br.com.java8.capitulo06.exemplo_07_09;

import java.security.SecureRandom;

// Figura 07.10: DeckOfCards.java
// Classe DeckOfCards representa um baralho

public class DeckOfCards {

	private Card[] deck; // Array de objetos Card
	private int currentCard; // indice da proxima Card a ser distribuida (0-51)
	private static final int NUMBER_OF_CARDS = 52; // Número constante de Cards
	
	// Gerador de número aleatório.
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	// Construtor preenche baralho de cartas
	public DeckOfCards() {
		String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
		deck = new Card[NUMBER_OF_CARDS]; // Cria array de objetos Card
		currentCard = 0;
		
		// Preenche Baralho com objeto Card
		for (int count = 0; count < deck.length; count++){
			deck[count] = new Card(faces[count % 13], suits[count / 13]);
		}
		
	}
		
		// Embaralha as cartas com um algoritmo de uma passagem
		public void shuffle() {
			// a proxima chamada para o método dealCard deve começar no deck[0] novamente
			currentCard = 0;
			
			// Para cada Card, seleciona outra Card Aleatória (0-51) e as compara
			for(int first = 0; first < deck.length; first++) {
				// seleciona um numero aleatorio entro 0 e 51
				int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
				
				// compara Card atual com Card aleatoriamente selecionada
				Card temp = deck[first];
				deck[first] = deck[second];
				deck[second] = temp;
			}
		}
		
		// Distribui uma Card
		public Card dealCard() {
			// Determina se ainda há Cards a serem distribuídas
			if(currentCard < deck.length) {
				return deck[currentCard++]; // retorna Card atual no array
			} else {
				return null; // retorna nulo para indicar que todos as Cards foram distribuidas
			}
		}

}// Fim da Classe DeckOfCards
