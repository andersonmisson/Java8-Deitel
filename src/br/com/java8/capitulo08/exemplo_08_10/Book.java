package br.com.java8.capitulo08.exemplo_08_10;

public enum Book {
	
	// Declara constantes do tipo enum
	JHTP("Java How To Program", "2015"),
	CHTP("C How To Program", "2013"),
	IW3HTP("Internet & World Wide Web How To Program", "2012"),
	CPPHTP("C++ How to Program", "2014"),
	VBHTP("Visual Basic How To Program", "2014"),
	CSHARPHTP("Visual C# How To Program", "2014");
	
	// Campos de instância
	private final String title; // titulo dos livros
	private final String copyrightYear; // ano dos direitos autorais
	
	// construtor enum
	Book(String title, String copyrightYear){
		
		this.title = title;
		this.copyrightYear = copyrightYear;
	}
	
	// Acessor para titulo de campo
	public String getTitle() {
		return title;
	}
	
	// Acessor para o campo copyrightYear
	public String getCopyrightYear() {
		return copyrightYear;
	}

}// Fim do enum Book
