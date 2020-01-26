package br.com.java8.capitulo04.exercicio_04_18;

import java.util.Scanner;

public class LimiteCredito {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int contador = 1;

		System.out.print("Você gostaria de fazer compras: (1 = SIM) e (0 = NÃO): ");
		contador = sc.nextInt();

		while (contador != 0) {

			System.out.print("Número da Conta: ");
			int conta = sc.nextInt();

			System.out.print("Saldo: ");
			int saldo = sc.nextInt();

			System.out.print("Despesas: ");
			int despesas = sc.nextInt();

			System.out.print("Crédito: ");
			int credito = sc.nextInt();

			double limite = saldo + credito;
			
			double novoSaldo = limite - despesas;
			
			if (novoSaldo < 0) {
				System.out.println("Exedeu o limite de crédito.");
			} else {
				System.out.println("Obrigado pelas compras.");
			}

			System.out.print("Você gostaria de fazer novas compras: (1 = SIM) e (0 = NÃO): ");
			contador = sc.nextInt();
		}

		sc.close();

	}

}
