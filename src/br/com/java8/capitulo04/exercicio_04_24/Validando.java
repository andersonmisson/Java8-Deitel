package br.com.java8.capitulo04.exercicio_04_24;

import java.util.Scanner;

public class Validando {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int contador;
		boolean continuar = true;
		
		while (continuar) {
			System.out.print("Escolha um número (1 ou 2 para Sair): ");
			int num = sc.nextInt();
			
			if ( num == 1 || num == 2) {
				continuar = false;
			}
		}
		System.out.println("Você saiu do programa.");

	}

}
