package br.com.java8.capitulo06.exemplo_07_02;

public class InitArray {

	public static void main(String[] args) {
		
		// Declara array variável e o inicializa com um objeto array
		int[] array = new int[10]; // cria um objeto array
		
		System.out.printf("%s%8s%n", "Index", "Value");
		
		// Gera saída do valor de cada elemento do array
		for(int counter =0 ; counter < array.length; counter++) {
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}

	}

} // Fim da classe InitArray
