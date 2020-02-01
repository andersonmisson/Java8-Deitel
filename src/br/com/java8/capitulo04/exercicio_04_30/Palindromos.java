package br.com.java8.capitulo04.exercicio_04_30;

import java.util.Scanner;

public class Palindromos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero;
		int dezMil;
		int mil;
		int cem;
		int dez;
		int um;
		int ePalindromo = 0;

		while (ePalindromo == 0) {
			System.out.print("Entre Com Cinco Números Inteiros: "); 
			numero = sc.nextInt();

			dezMil = numero / 10000;
			numero = numero - dezMil * 10000;
			mil = numero / 1000;
			numero = numero - mil * 1000;
			cem = numero / 100;
			numero = numero - cem * 100;
			dez = numero / 10;
			um = numero % 10;
			

			if(dezMil == um){
				if(mil == dez){
					System.out.println("É um Palíndromo!");
					ePalindromo = 1;
				}else{
					System.out.println("Não é um Palíndromo.\n");
				}
			}else{
				System.out.println("Não é um Palíndromo.\n");
			}
		}
		sc.close();
	}
}