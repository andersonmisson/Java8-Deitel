package br.com.java8.capitulo05.exemplo_05_13;

//Autor: Anderson Misson
//Figura 5.13: BreakTest.java
// a instrução break sai de uma instrução for


public class BreakTest {

	public static void main(String[] args) {
		
		int contador; // variável de controle também utilizada depois que loop termina
		
		for(contador = 1; contador <= 10; contador++) {
			if(contador == 5)
				break; // termina o loop se a contagem for 5
			
			System.out.printf("%d ", contador);
		}
		System.out.printf("%nQuebrou o Loop na contagem: %d%n", contador);

	}

} // fim da classe BreakTest
