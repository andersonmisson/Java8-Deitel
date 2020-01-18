package br.com.java8.capitulo02.exercicio_02_16;

import java.util.Scanner;

public class Exercicio_2_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numero1;
		int numero2;
		
		System.out.print("Primeiro Número Inteiro: ");
		numero1 = input.nextInt();
		
		System.out.print("Segundo Número Inteiro: ");
		numero2 = input.nextInt();
		
		if (numero1 > numero2)
			System.out.printf("%d É Maior %n", numero1);
		
		if (numero1 < numero2)
			System.out.printf("%d É Maior %n", numero2);
		
		if (numero1 == numero2)
			System.out.printf("São Iguais");
	}

}
