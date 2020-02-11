package br.com.java8.capitulo05.exemplo_05_19;

//Autor: Anderson Misson
//Figura 5.19: OperadoresLogicos.java
//Operadores Lógicos

public class OperadoresLogicos {

	public static void main(String[] args) {

		// cria a tabela-verdade para o operador && (E Condicional)
		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n", "Condiciona AND (&&)", "false && false",
				(false && false), "false && true", (false && true), "true && false", (true && false), "true && true",
				(true && true));

		// cria a tabela-verdade para o operador || (OU Condicional)
		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n", "Condiciona OR (||)", "false || false",
				(false || false), "false || true", (false || true), "true || false", (true || false), "true || true",
				(true || true));

		// cria a tabela-verdade para o operador & (E lógico booleano)
		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n", "Lógica Booleana Inclusiva AND (&)",
				"false & false", (false & false), "false & true", (false & true), "true & false", (true & false),
				"true & true", (true & true));

		// cria a tabela-verdade para o operador | (OR lógico booleano)
		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n", "Lógica Booleana Exclusiva OR (|)", "false | false",
				(false | false), "false | true", (false | true), "true | false", (true | false), "true | true",
				(true | true));

		// cria a tabela-verdade para o operador ! (Negação Lógica)
		System.out.printf("%s%n%s: %b%n%s: %b%n", "Lógica NOT(!)", "!false", (!false), "!true", (!true));

	}

}// fim da classe OperadoresLogicos
