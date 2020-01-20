package br.com.java8.capitulo03.exemplo_03_01e02;

import java.util.Scanner;

// Autor: Anderson Misson

// Figura 3.2: AccountTest.java
// Cria e manipula um objeto Account

public class AccountTest {

	public static void main(String[] args) {
		
		// Cria um objeto Scanner para obter entrada a partir da janela de comando
		Scanner sc = new Scanner(System.in);

		// Cria um objeto Account e o atribui em MyAccount
		Account myAccount = new Account();
		
		// Exibe o valor inicial do nome (null)
		System.out.printf("Nome Inicial: %s%n%n", myAccount.getName());
		
		// Solicita e lê o nome
		System.out.println("Por Favor, Entre com o Nome: ");
		String theName = sc.nextLine(); //lê uma linha do texto
		myAccount.setName(theName); // insete theName em myAccount
		System.out.println(); // gera saída de uma linha em branco
		
		// Exibe o nome armazenado no objeto myAccount
		System.out.printf("Nome no Objeto myAccount é: %n%s%n", myAccount.getName());
		
	} // Fim da Classe AccountTest

}
