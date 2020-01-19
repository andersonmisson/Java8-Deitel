package br.com.java8.capitulo02.exercicio_02_33;

import java.util.Scanner;

public class Exercicio_2_33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double peso, altura, imc;
		
		System.out.print("Qual é o seu peso: ");
		peso = sc.nextDouble();

		System.out.print("Qual é a sua altura. Em cm, ex: 1.75m = 175: ");
		altura = sc.nextDouble();

		imc = (peso / ((altura * altura) /10000));
		
		System.out.printf("Seu IMC: %.2f. ", imc);

		if (imc <= 18.5)
			System.out.println("Você está Magro Demais");

		if (imc > 18.5 && imc < 25)
			System.out.println("Você está Normal");

		if (imc >= 25 && imc < 30)
			System.out.println("Você está Gordo");

		if (imc > 30)
			System.out.println("Você está Obeso Demais");

	}

}
