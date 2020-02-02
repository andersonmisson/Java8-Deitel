package br.com.java8.capitulo04.exercicio_04_38;

import java.util.Scanner;

public class Criptografia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int codificar;
		
		System.out.print("Entre com 4 Números Para Criptografar: ");
		codificar = sc.nextInt();
		
		int mil;
		int cem;
		int dez;
		int um;
		
		
		mil = codificar / 1000;
		codificar = codificar - mil * 1000;
		cem = codificar / 100;
		codificar = codificar - cem * 100;
		dez = codificar / 10;
		um = codificar % 10;
		
		
		mil = criptografado1(mil);
		cem = criptografado1(cem);
		dez = criptografado1(dez);
		um = criptografado1(um);
		
		
		int codedNumber = criptografado2(mil, cem, dez, um);
		
		
		System.out.println("Seu Número Criptografado é: " + codedNumber);
		
		sc.close();
	}
	
	public static int criptografado1(int numero){
		numero += 7;
		numero %= 10;
		return numero;
	}
	
	public static int criptografado2(int mil, int cem, int dez, int um){
		int criptografado = dez * 1000 + um * 100 + mil * 10 + cem;
		return criptografado;
	}
}