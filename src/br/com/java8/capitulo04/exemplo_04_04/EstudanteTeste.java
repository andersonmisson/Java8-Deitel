package br.com.java8.capitulo04.exemplo_04_04;

public class EstudanteTeste {

	public static void main(String[] args) {
		
		Estudante e1 = new Estudante("Kochan", 93.5);
		Estudante e2 = new Estudante("Kote", 72.75);
		Estudante e3 = new Estudante("Mamu", 62.75);
		Estudante e4 = new Estudante("Junior", 12.75);
		
		System.out.printf("Estudante: %s - Média: %s%n", e1.getNome(), e1.getBoletim());
		System.out.printf("Estudante: %s - Média: %s%n", e2.getNome(), e2.getBoletim());
		System.out.printf("Estudante: %s - Média: %s%n", e3.getNome(), e3.getBoletim());
		System.out.printf("Estudante: %s - Média: %s%n", e4.getNome(), e4.getBoletim());
	}

}
