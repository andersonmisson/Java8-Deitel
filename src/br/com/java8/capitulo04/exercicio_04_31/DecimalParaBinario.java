package br.com.java8.capitulo04.exercicio_04_31;

import java.util.Scanner;

public class DecimalParaBinario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com o número Decimal,(Exemplo 234):  ");
		int contador = sc.nextInt();
		System.out.print("Entre com o número Binário,(Exemplo 1101: ");
		int numero = sc.nextInt();
		int totalDecimal = 0;

		while(contador > 1){
			int digito = numero / (int) Math.pow(10, contador - 1);
			numero = numero % (1 * (int) Math.pow(10, contador - 1));
			totalDecimal += digito * (int)Math.pow(2, contador - 1);
			contador--;
		}
		int digito = numero % 10;
		totalDecimal += digito;
		System.out.println(totalDecimal + " É Equivalente Decimal Ao Número Binário " + numero);
		sc.close();
	}
}