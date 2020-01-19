package br.com.java8.capitulo02.exercicio_02_34;

import java.util.Scanner;

public class Exercicio_2_34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ano;
		double pm;
		
		System.out.println("Em 2020, somos aproximadamente 7.7 bilhões de pessoas");
		System.out.println("Teremos um aumento de 1.2% Ao Ano");
		System.out.print("Em que ano estamos: ");
		ano = sc.nextInt();
		System.out.print("Quantas pessoas existem no mundo atualmente: ");
		pm = sc.nextDouble();
		
		System.out.printf("Em %d, existem %.0f pessoas no mundo.%n", ano, pm);
		ano++;
		pm = pm + (pm * 0.012);
		System.out.printf("Em %d, existirão %.0f pessoas no mundo.%n", ano, pm);

		ano++;
		pm = pm + (pm * 0.012);
		System.out.printf("Em %d, existirão %.0f pessoas no mundo.%n", ano, pm);

		ano++;
		pm = pm + (pm * 0.012);
		System.out.printf("Em %d, existirão %.0f pessoas no mundo.%n", ano, pm);

		ano++;
		pm = pm + (pm * 0.012);
		System.out.printf("Em %d, existirão %.0f pessoas no mundo.%n", ano, pm);

		ano++;
		pm = pm + (pm * 0.012);
		System.out.printf("Em %d, existirão %.0f pessoas no mundo.%n", ano, pm);


	}

}
