package br.com.java8.capitulo04.exercicio_04_35;

import java.util.Scanner;

public class LadosTriangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 3 números inteiros: ");
		int lado1 = sc.nextInt();
		int lado2 = sc.nextInt();
		int lado3 = sc.nextInt();

		if (lado1 + lado2 > lado3) {
			if (lado1 + lado3 > lado2) {
				if (lado2 + lado3 > lado1)
					System.out.println("Forma Um Triângulo");
				else
					System.out.println("Não Forma Um Triângulo");
			} else
				System.out.println("Não Forma Um Triângulo");
		} else
			System.out.println("Não Forma Um Triângulo");

		sc.close();
	}

}