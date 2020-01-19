package br.com.java8.capitulo02.exercicio_02_24;

import java.util.Scanner;

public class Exercicio_2_24 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num1, num2, num3, num4, num5;

		System.out.println("Escolha Cinco Números Inteiros:");

		System.out.print("1° Número: ");
		num1 = input.nextInt();

		System.out.print("2° Número: ");
		num2 = input.nextInt();

		System.out.print("3° Número: ");
		num3 = input.nextInt();

		System.out.print("4° Número: ");
		num4 = input.nextInt();

		System.out.print("5° Número: ");
		num5 = input.nextInt();

		if (num1 > num2)
			if (num1 > num3)
				if (num1 > num4)
					if (num1 > num5)
						System.out.printf("Número %d é maior.%n", num1);

		if (num2 > num1)
			if (num2 > num3)
				if (num2 > num4)
					if (num2 > num5)
						System.out.printf("Número %d é maior.%n", num2);

		if (num3 > num1)
			if (num3 > num2)
				if (num3 > num4)
					if (num3 > num5)
						System.out.printf("Número %d é maior.%n", num3);

		if (num4 > num1)
			if (num4 > num2)
				if (num4 > num3)
					if (num4 > num5)
						System.out.printf("Número %d é maior.%n", num4);

		if (num5 > num1)
			if (num5 > num2)
				if (num5 > num3)
					if (num5 > num4)
						System.out.printf("Número %d é maior.%n", num5);

		if (num1 < num2)
			if (num1 < num3)
				if (num1 < num4)
					if (num1 < num5)
						System.out.printf("Número %d é menor.%n", num1);

		if (num2 < num1)
			if (num2 < num3)
				if (num2 < num4)
					if (num2 < num5)
						System.out.printf("Número %d é menor.%n", num2);

		if (num3 < num1)
			if (num3 < num2)
				if (num3 < num4)
					if (num3 < num5)
						System.out.printf("Número %d é menor.%n", num3);

		if (num4 < num1)
			if (num4 < num2)
				if (num4 < num3)
					if (num4 < num5)
						System.out.printf("Número %d é menor.%n", num4);

		if (num5 < num1)
			if (num5 < num2)
				if (num5 < num3)
					if (num5 < num4)
						System.out.printf("Número %d é menor.%n", num5);

	}

}
