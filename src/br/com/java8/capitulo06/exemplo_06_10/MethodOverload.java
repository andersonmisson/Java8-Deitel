package br.com.java8.capitulo06.exemplo_06_10;

// Figura 06.10: MethodOverload.java
// Declarações de méthodos sobrecarregados

public class MethodOverload {

	// teste de métodos square sobrecarregados
	public static void main(String[] args) {
		
		System.out.printf("Square of intefer 7 is %d%n", square(7));
		System.out.printf("Square of double 7.5 is %f%n", square(7.5));

	}

	// método square com argumento de int
	public static int square(int intValue) {
		System.out.printf("%nCalled square with int argument: %d%n", intValue);
		return intValue * intValue;
	}
	
	private static double square(double doubleValue) {
		
		System.out.printf("%nCalled square with double argument: %f%n", doubleValue);
		return doubleValue * doubleValue;
	}

} // Fim da classe MethodOver Load
