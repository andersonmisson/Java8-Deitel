package br.com.java8.capitulo05.exercicio_05_14;

public class InteresseModificado {

	public static void main(String[] args) {
		
		double montante;
		double principal = 1000.0;
		double taxa = 1;
		
		for(taxa = 5; taxa <=10; taxa++) {
			
			System.out.printf("%s%20s %n", "Ano", "Montante:");
				
			for(int ano = 1; ano <=10; ano++) {
			
				montante = principal * Math.pow(1.0 + (taxa/100), ano);
			
				System.out.printf("%3d%, 20.2f%n", ano, montante);
			
			}
			System.out.println("");
		}
	}

  }