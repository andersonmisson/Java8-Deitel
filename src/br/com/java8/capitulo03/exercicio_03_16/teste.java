package br.com.java8.capitulo03.exercicio_03_16;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dia;
		int mes;
		int ano;
		String nome;
		String sobrenome;
		
		System.out.print("Nome: ");
		nome = sc.nextLine();
		
		System.out.print("Sobrenome: ");
		sobrenome = sc.nextLine();
		
		System.out.print("Dia:");
		dia = sc.nextInt();
		
		System.out.print("Mês: ");
		mes = sc.nextInt();
		
		System.out.print("Ano: ");
		ano = sc.nextInt();

		CalculadoraCardiaca cc = new CalculadoraCardiaca(nome, sobrenome, dia, mes, ano);
		
		System.out.printf("Olá %s %s!%nVocê nasceu em %d/%02d/%d%n%n", nome, sobrenome, dia, mes, ano);
		System.out.printf("Você tem %d anos.%nSua Maxima frequência Cardiaca é de - %dbpm%nSua frequência deve estar em - %dbpm",
				cc.calcularIdade(), cc.calcularMax(), cc.calcularAlvo());
		
		sc.close();
	}

}
