package br.com.java8.capitulo02.exercicio_02_25;

import java.util.Scanner;

public class Exercicio_2_25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num;
		
		System.out.print("Escolha Um Número, Vou Dizer Se É Par Ou Ímpar: ");
		num = input.nextInt();
		
		if (num %2 == 0)
			System.out.printf("%d é par", num);
		
		if (num %2 == 1)
			System.out.printf("%d é ímpar", num);
		
	}

}
