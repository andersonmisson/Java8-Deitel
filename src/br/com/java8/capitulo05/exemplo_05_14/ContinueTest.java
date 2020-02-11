package br.com.java8.capitulo05.exemplo_05_14;

//Autor: Anderson Misson
//Figura 5.13: BreakTest.java
//Instrução continue que termina uma iteração de uma instrução for.

public class ContinueTest {

	public static void main(String[] args) {
		
		for(int contador = 1; contador <= 10; contador++) { // faz o loop 10 vezes
			if(contador == 5)
				continue; // pula o código restante no corpo do loop se a contagem for 5
			
			System.out.printf("%d ", contador);
		}
		
		System.out.printf("%nUse continue para pular a impressão 5%n");

	}

}// Fim da classe ContinueTest
