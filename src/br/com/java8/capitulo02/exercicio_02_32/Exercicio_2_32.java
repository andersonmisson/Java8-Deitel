package br.com.java8.capitulo02.exercicio_02_32;

import java.util.Scanner;

public class Exercicio_2_32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b, c, d, e, pos = 0, neg = 0, zero = 0;

		System.out.println("Cinco Números Inteiros:");

		System.out.print("1° Número: ");
		a = sc.nextInt();

		System.out.print("2° Número: ");
		b = sc.nextInt();

		System.out.print("3° Número: ");
		c = sc.nextInt();

		System.out.print("4° Número: ");
		d = sc.nextInt();

		System.out.print("5° Número: ");
		e = sc.nextInt();

		if (a > 0)
			pos += 1;
		if (a < 0)
			neg += 1;
		if (a == 0)
			zero += 1;

		if (b > 0)
			pos += 1;
		if (b < 0)
			neg += 1;
		if (b == 0)
			zero += 1;

		if (c > 0)
			pos += 1;
		if (c < 0)
			neg += 1;
		if (c == 0)
			zero += 1;

		if (d > 0)
			pos += 1;
		if (d < 0)
			neg += 1;
		if (d == 0)
			zero += 1;

		if (e > 0)
			pos += 1;
		if (e < 0)
			neg += 1;
		if (e == 0)
			zero += 1;

		System.out.println("--------------------");
		System.out.printf("Positivos: %d%n", pos);
		System.out.printf("Negativos: %d%n", neg);
		System.out.printf("Zeros: %d%n", zero);

	}

}
