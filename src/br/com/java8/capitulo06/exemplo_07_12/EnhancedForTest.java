package br.com.java8.capitulo06.exemplo_07_12;

public class EnhancedForTest {

	public static void main(String[] args) {
		
		int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		int total = 0;
		
		// adiciona o valor de cada elemento ao total
		for (int number: array) {
			total += number;
		}
		System.out.printf("Total of Array elements: %d%n", total);
	}

}
