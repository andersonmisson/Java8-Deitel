package br.com.java8.capitulo03.exemplo_03_08;

import java.util.Scanner;

// Autor: Anderson Misson

public class AccountTest {

	public static void main(String[] args) {

		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);

		// Exibe saldo inicial de cada objeto
		System.out.printf("%s Saldo: $%.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s Saldo: $%.2f %n", account2.getName(), account2.getBalance());

		// cria um Scanner para obter entrada a partir da janela de comando
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter deposit amount for account1: ");// prompt
		double depositAmount = sc.nextDouble(); // Obtém a entrada do usuário
		System.out.printf("%nadding %.2f to account1 balance %n%n", depositAmount);
		account1.deposit(depositAmount);// adiciona o saldo em account1

		// exibe os saldos
		System.out.printf("%s Saldo: $%.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s Saldo: $%.2f %n", account2.getName(), account2.getBalance());

		System.out.print("Enter deposit amount for account2: ");// prompt
		depositAmount = sc.nextDouble(); // Obtém a entrada do usuário
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account2.deposit(depositAmount);// adiciona o saldo em account2

		// exibe os saldos
		System.out.printf("%s Saldo: $%.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s Saldo: $%.2f %n", account2.getName(), account2.getBalance());

	}

}
