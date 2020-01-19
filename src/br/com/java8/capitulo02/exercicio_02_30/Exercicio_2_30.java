package br.com.java8.capitulo02.exercicio_02_30;

//Autor: Anderson Misson

import java.util.Scanner;

public class Exercicio_2_30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero, resultado;
		
		System.out.print("Coloque 5 digitos inteiros: ");
		numero = sc.nextInt();
		
		resultado = numero % 100000 / 10000;
		System.out.printf("%d   ", resultado);
		
		resultado = numero % 10000 / 1000;
		System.out.printf("%d   ", resultado);
		
		resultado = numero % 1000 / 100;
		System.out.printf("%d   ", resultado);
		
		resultado = numero % 100 / 10;
		System.out.printf("%d   ", resultado);
		
		resultado = numero % 10;
		System.out.printf("%d", resultado);

	}

}
