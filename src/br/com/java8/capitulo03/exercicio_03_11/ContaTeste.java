package br.com.java8.capitulo03.exercicio_03_11;

import java.util.Scanner;

public class ContaTeste {

	public static void main(String[] args) {

		Conta conta1 = new Conta("Jane Green", 100.00);
		Conta conta2 = new Conta("John Blue", 50.00);

		// Exibindo o saldo inicial de cada objeto
		System.out.printf("Cliente: %s. Saldo: R$ %.2f.%n", conta1.getNome(), conta1.getSaldo());
		System.out.printf("Cliente: %s. Saldo: R$ %.2f.%n", conta2.getNome(), conta2.getSaldo());

		// Primeiro Criar a Classe SCANNER para Fazermos os Depositos e as Retiradas
		Scanner sc = new Scanner(System.in);

		System.out.printf("------------------------------%n");
		System.out.print("Entre com o Valor do Depósito da Conta 1: R$ ");
		double valorDoDeposito = sc.nextDouble(); // Entrada do Usuário
		System.out.printf("Adicionado R$ %.2f no Saldo da Conta %s%n", valorDoDeposito, conta1.getNome());
		conta1.deposito(valorDoDeposito); // Adiciona o dinheiro ao Saldo da Conta 1

		System.out.printf("------------------------------%n");
		System.out.print("Entre com o Valor do Depósito da Conta 2: R$ ");
		valorDoDeposito = sc.nextDouble(); // Entrada do Usuário
		System.out.printf("Adicionado R$ %.2f no Saldo da Conta %s%n", valorDoDeposito, conta2.getNome());
		conta2.deposito(valorDoDeposito); // Adiciona o dinheiro ao Saldo da Conta 1

		System.out.printf("-------------------------------%n");
		// Exibindo Saldo Com Dinheiro Adicionado
		System.out.printf("Cliente: %s. Saldo: R$ %.2f.%n", conta1.getNome(), conta1.getSaldo());
		System.out.printf("Cliente: %s. Saldo: R$ %.2f.%n", conta2.getNome(), conta2.getSaldo());
		
		System.out.printf("-------------------------------%n");
		System.out.print("Entre com o Valor da Retirada Da Conta 1: R$ ");
		double valorDaRetirada = sc.nextDouble();
		System.out.printf("Retirando R$ %.2f no Saldo da Conta %s%n", valorDaRetirada, conta1.getNome());
		conta1.retirada(valorDaRetirada);
		
		System.out.printf("-------------------------------%n");
		System.out.print("Entre com o Valor da Retirada Da Conta 2: R$ ");
		valorDaRetirada = sc.nextDouble();
		System.out.printf("Retirando R$ %.2f no Saldo da Conta %s%n", valorDaRetirada, conta2.getNome());
		conta2.retirada(valorDaRetirada);
		
		System.out.printf("-------------------------------%n");
		// Exibindo Saldo Com Dinheiro Adicionado
		System.out.printf("Cliente: %s. Saldo: R$ %.2f.%n", conta1.getNome(), conta1.getSaldo());
		System.out.printf("Cliente: %s. Saldo: R$ %.2f.%n", conta2.getNome(), conta2.getSaldo());
		

	}

}
