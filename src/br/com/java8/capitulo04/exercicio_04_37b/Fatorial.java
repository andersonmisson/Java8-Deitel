package br.com.java8.capitulo04.exercicio_04_37b;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número de Termos (Inteiros): ");
		double numero = sc.nextDouble();
		
		double estimativa = 1;
		
		while (numero > 0){
			estimativa += 1 / fatorialCalculadora(numero);
			numero--;
		}
		
		System.out.println("O Valor Estimado é: " + estimativa);
		sc.close();
	}

	public static double fatorialCalculadora(double numero) {
		double fatorial = numero;

		while (numero > 1) {
			numero--;
			fatorial *= numero;
		}
		return fatorial;
	}
}