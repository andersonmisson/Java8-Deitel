package br.com.java8.capitulo04.exercicio_04_20;

// Autor: Anderson Misson
// Figura 4.20 - CalculandorDeSalarios.java

import java.util.Scanner;

public class CalculadorDeSalarios {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nome;
		double salario;
		double horas = 40;

		System.out.print("Vendedor: ");
		nome = sc.nextLine();

		System.out.print("Salario: ");
		salario = sc.nextDouble();

		System.out.print("Horas Trabalhadas: ");
		double horasTrabalhadas = sc.nextDouble();

		double salarioPorHora = salario / horas;
		double horasExtras = horasTrabalhadas - horas;
		double salarioExtra = (salarioPorHora * 1.50) * horasExtras;

		System.out.printf("vendedor: %s%n", nome);
		System.out.printf("Salario: %.2f%n", salario);
		System.out.printf("Horas Extras: %.0f%n", horasExtras);
		System.out.printf("Salario Extra: %.2f%n", salarioExtra);
		System.out.printf("Salario Total: %.2f + %.2f = %.2f", salario, salarioExtra, (salario + salarioExtra));

	}

}
