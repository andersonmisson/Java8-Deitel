package br.com.java8.capitulo03.exercicio_03_13;

import java.util.Scanner;

public class EmpregadoTeste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Empregado e1 = new Empregado();
		Empregado e2 = new Empregado();

		System.out.printf("Nome: %s%nSobrenome: %s%nSalário: %.2f%n%n", e1.getNome(), e1.getSobrenome(),
				e1.getSalario());
		System.out.printf("Nome: %s%nSobrenome: %s%nSalário: %.2f%n%n", e2.getNome(), e2.getSobrenome(),
				e2.getSalario());

		System.out.print("Empregado 1 - Nome: ");
		String nome = sc.nextLine();
		e1.setNome(nome);

		System.out.print("Empregado 1 - Sobrenome: ");
		String sobrenome = sc.nextLine();
		e1.setSobrenome(sobrenome);

		System.out.print("Empregado 1 - Salário: ");
		double salario = sc.nextDouble();
		e1.setSalario(salario);

		System.out.print("Empregado 2 - Nome: ");
		nome = sc.nextLine();
		e2.setNome(nome);

		System.out.print("Empregado 2 - Sobrenome: ");
		sobrenome = sc.nextLine();
		e2.setSobrenome(sobrenome);

		System.out.print("Empregado 2 - Salário: ");
		salario = sc.nextDouble();
    	e2.setSalario(salario);

		System.out.println("--------------------------------------");
		System.out.println("EMPREGADO 1");
		System.out.printf("Nome: %s%nSobrenome: %s%nSalário: R$ %.2f%n", e1.getNome(), e1.getSobrenome(),
				e1.getSalario());
		System.out.printf("Salario Anual: R$ %.2f%n", e1.getSalario() * 12);
		System.out.printf("Salário Anual + 10%%: R$ %.2f%n", (e1.getSalario() + e1.getSalario() * 10 / 100) * 12);

		System.out.println("--------------------------------------");
		System.out.println("EMPREGADO 2");
		System.out.printf("Nome: %s%nSobrenome: %s%nSalário: R$ %.2f%n", e2.getNome(), e2.getSobrenome(),
				e2.getSalario());
		System.out.printf("Salario Anual: R$ %.2f%n", e2.getSalario() * 12);
		System.out.printf("Salário Anual + 10%%: R$ %.2f%n", (e2.getSalario() + e2.getSalario() * 10 / 100) * 12);

	}

}
