package br.com.java8.capitulo02.exercicio_02_17;

//Autor: Anderson Misson

import java.util.Scanner;

public class Exercicio_2_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero1, numero2, numero3, soma, media, produto, maior, menor;
		
		System.out.print("Primeiro Número: ");
		numero1 = input.nextInt();
		
		System.out.print("Segundo Número: ");
		numero2 = input.nextInt();
		
		System.out.print("Terceiro Número: ");
		numero3 = input.nextInt();
		
		soma = numero1 + numero2 + numero3;
		
		media = (numero1 + numero2 + numero3) / 3;
		
		produto = numero1 * numero2 * numero3;
				
		System.out.printf("Soma: %d + %d + %d = %d%n", numero1, numero2, numero3, soma);
		
		System.out.printf("Média: (%d + %d + %d) / 3 = %d%n", numero1, numero2, numero3, media);
		
		System.out.printf("Produto: %d * %d * %d = %d%n", numero1, numero2, numero3, produto);
		
		if (numero1 > numero2)
			if (numero1 > numero3)
				System.out.printf("Maior: É O Primeiro Número: %d%n", numero1);
		
		if (numero2 > numero1)
			if (numero2 > numero3)
				System.out.printf("Maior: É O Segundo Número: %d%n", numero2);
		
		if (numero3 > numero1)
			if (numero3 > numero2)
				System.out.printf("Maior: É O Terceiro Número: %d%n", numero3);

		if (numero1 < numero2)
			if (numero1 < numero3)
				System.out.printf("Menor: É O Primeiro Número: %d%n", numero1);
		
		if (numero2 < numero1)
			if (numero2 < numero3)
				System.out.printf("Menor: É O Segundo Número: %d%n", numero2);
		
		if (numero3 < numero1)
			if (numero3 < numero2)
				System.out.printf("Menor: É O Terceiro Número: %d%n", numero3);		
	}

}
