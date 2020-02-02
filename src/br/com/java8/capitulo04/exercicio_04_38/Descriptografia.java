package br.com.java8.capitulo04.exercicio_04_38;

import java.util.Scanner;

public class Descriptografia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int descodificar;

		System.out.print("Entre com os 4 números para Descriptografar: ");
		descodificar = sc.nextInt();

		int mil;
		int cem;
		int dez;
		int um;


		mil = descodificar / 1000;
		descodificar = descodificar - mil * 1000;
		cem = descodificar / 100;
		descodificar = descodificar - cem * 100;
		dez = descodificar / 10;
		um = descodificar % 10;


		mil = descriptografado1(mil);
		cem = descriptografado1(cem);
		dez = descriptografado1(dez);
		um = descriptografado1(um);


		int numeroDecodificado = descriptografado2(mil, cem, dez, um);

		System.out.println("Seu Número Decodificado é: " + numeroDecodificado);

		sc.close();
	}

	public static int descriptografado1(int numero) {
		if (numero == 0) {
			numero = 3;
		} else if (numero == 1) {
			numero = 4;
		} else if (numero == 2) {
			numero = 5;
		} else if (numero == 3) {
			numero = 6;
		} else if (numero == 4) {
			numero = 7;
		} else if (numero == 5) {
			numero = 8;
		} else if (numero == 6) {
			numero = 9;
		} else if (numero == 7) {
			numero = 0;
		} else if (numero == 8) {
			numero = 1;
		} else if (numero == 9) {
			numero = 2;
		}
		return numero;
	}

	public static int descriptografado2(int mil, int cem, int dez, int um) {
		int descriptografado = dez * 1000 + um * 100 + mil * 10 + cem;
		return descriptografado;
	}
}