package br.com.java8.capitulo02.exercicio_02_28;

import java.util.Scanner;

public class Exercicio_2_28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float PI = 3.14159f, r, diametro, circunferencia, area;

		System.out.print("Informe o valor do RAIO: ");
		r = sc.nextFloat();
		
		diametro = r * r;
		circunferencia = 2 * PI * r;
		area = PI * (r * r);
		
		System.out.printf("Diâmentro: %.2f%n", diametro);
		System.out.printf("Circunferência: %f%n", circunferencia);
		System.out.printf("Área: %f%n", area);
		
	}

}
