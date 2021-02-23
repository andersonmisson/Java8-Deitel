package br.com.java8.capitulo06.exemplo_08_14;

// Figura 08.14: StaticImportTest.java
// Importação static dos métodos da classe Math
import static java.lang.Math.*;

public class StaticImportTest {

	public static void main(String[] args) {
		
		System.out.printf("sqrt(900.0) = %.1f%n", sqrt(900.0));
		System.out.printf("ceil(-9.8) = %.1f%n", ceil(-9.8));
		System.out.printf("E = %f%n", E);
		System.out.printf("PI = %f%n", PI);

	}

}
