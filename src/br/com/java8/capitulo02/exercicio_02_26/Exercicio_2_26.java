package br.com.java8.capitulo02.exercicio_02_26;

//Autor: Anderson Misson

import java.util.Scanner;

public class Exercicio_2_26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, y;

		System.out.println("Eles são Múltiplos?");

		System.out.print("1° Número: ");
		x = sc.nextInt();

		System.out.print("2° Número: ");
		y = sc.nextInt();

		if (x % y == 0)
			System.out.printf("O Número %d é múltiplo de %d", x, y);

		if (x % y != 0)
			System.out.printf("O Número %d não é múltiplo de %d", x, y);

	}

}
