package br.com.java8.capitulo04.exercicio_04_37c;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Número De Termos Para Calcular: ");
		double numero = sc.nextDouble();
		double potencia = 1;
		double estimativa = 1;
		
		while (numero > 0){
			estimativa = estimativa + (Math.pow(numero + potencia - 1, potencia) / fatorialCalculadora(potencia));
			System.out.println(estimativa);
			numero--;
			potencia++;
		}
		
		System.out.println("O Valor Estimado de e^x é: " + estimativa);
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