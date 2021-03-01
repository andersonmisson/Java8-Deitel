package br.com.java8.capitulo07.exemplo_07_03;

// Figura 7.3: InitArray.java
// Inicializando os elementos de um array com um inicializador de array

public class InitArray {

	public static void main(String[] args) {
		
		// Declara array variável e o inicializa com um objeto array
		int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37}; // cria um objeto array
		
		System.out.printf("%s%8s%n", "Index", "Value"); // Titulos da coluna
		
		// Gera saída do valor de cada elemento do array
		for(int counter = 0 ; counter < array.length; counter++) {
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}

	}

} // fim da classe InitArray
