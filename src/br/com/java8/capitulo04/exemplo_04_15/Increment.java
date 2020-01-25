package br.com.java8.capitulo04.exemplo_04_15;

// Autor: Anderson Misson
// Figura 04.15: Increment.java
// Operadores de pré-incremento e de pós-incremento

public class Increment {

	public static void main(String[] args) {

		// Demonstra o operador de pós-incremento
		int c = 5;
		System.out.printf("C antes de  Pós-Incremento: %d%n", c); // imprime 5
		System.out.printf("	    Pós-Incremento: %d%n", c++); // imprime 5
		System.out.printf("C depois de Pós-Incremento: %d%n", c); // imprime 6

		System.out.println(); // Para pular uma linha

		// Demonstra o operador de pós-incremento
		c = 5;
		System.out.printf("C antes de  Pré-Incremento: %d%n", c); // imprime 5
		System.out.printf("	    Pré-Incremento: %d%n", ++c); // imprime 6
		System.out.printf("C depois de Pré-Incremento: %d%n", c); // imprime 6

	}

} // Fim da classe Increment
