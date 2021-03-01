package br.com.java8.capitulo07.exemplo_07_05;

//Figura 7.5: SumArray.java
//Calculando a soma dos elementos de um array

public class SumArray {

	public static void main(String[] args) {
		
		int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		int total = 0;
		
		for(int counter =0; counter < array.length; counter++) {
			total += array[counter];
		}

		System.out.printf("Total of Array elements: %d%n", total);
	}

} // Fim da classe SumArray
