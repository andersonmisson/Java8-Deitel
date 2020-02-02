package br.com.java8.capitulo04.exercicio_04_37a;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um Número Inteiro: ");
		int numero = sc.nextInt();
		int num = numero;
		int fatorial = numero;
		
		while(numero > 1) {
			numero--;
			fatorial *= numero;
		}
		System.out.printf("O Fatorial de %d! é %d%n", num, fatorial);
		sc.close();
	}

}
