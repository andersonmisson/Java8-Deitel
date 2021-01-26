package br.com.java8.capitulo06.exemplo_07_17;

// Figura 07.17: InitArray.java
// Inicializando Array Bidimensionais

public class InitArray {

	public static void main(String[] args) {
		// Cria e gera saída de arrays bidimensionais
		int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
		int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};
		
		System.out.println("Values in array1 by row are");
		outputArray(array1); // exibe array1 por linha
		
		System.out.printf("%nValue in array 2 by row are%n");
		outputArray(array2); // exibe array2 por linha
	}

	public static void outputArray(int[][] array) {
		// Faz um loop pelas linhas do array
		for(int row=0; row < array.length; row++) {
			// faz um loop pelas linhas do array
			for(int column = 0; column < array[row].length; column++) {
				System.out.printf("%d ", array[row][column]);
			}
			
			System.out.println();
		}
		
	}

}// Fim da classe InitArray
