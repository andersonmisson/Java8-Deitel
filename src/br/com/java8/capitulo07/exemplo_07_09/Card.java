package br.com.java8.capitulo07.exemplo_07_09;

// Figura 07.09: Card.java
// Classe Card representa uma carta de baralho

public class Card {
	private final String face; // face da carta ("Ace", "Deuce", ...)
	private final String suit; // naipe da carta("Hearts","Diammonds", ...)
	
	// Construtor de dois argumentos inicializa face e naipe da carta
	public Card(String face, String suit) {
		super();
		this.face = face;
		this.suit = suit;
	}
	
	// retorna representação String de Card
	public String toString() {
		return face + " of " + suit;
	}
	

} // fim da classe Card
