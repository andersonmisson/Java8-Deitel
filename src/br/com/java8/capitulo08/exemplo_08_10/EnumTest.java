package br.com.java8.capitulo08.exemplo_08_10;

import java.util.EnumSet;

// Figura 08.11: EnumTest.java
// Testando o tipo enum Book

public class EnumTest {

	public static void main(String[] args) {
		
		System.out.println("All Books:");
		
		// imprime todos os livros em enum Book
		for(Book book : Book.values()) {
			System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), book.getCopyrightYear());
		}
		
		System.out.printf("%nDisplay a range of enum constants: %n");
		
		// imprime os primeiros quatro livros
		for (Book book : EnumSet.range(Book.JHTP, Book.CPPHTP)) {
			System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), book.getCopyrightYear());
		}

	}

} // Fim da classe EnumTest
