package br.com.java8.capitulo03.exercicio_03_17;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dia;
		int mes;
		int ano;
		String nome;
		String sobrenome;
		String sexo;
		double peso;
		double altura;
		
		CalculadoraCardiaca cc = new CalculadoraCardiaca();
		
		System.out.print("Nome: ");
		nome = sc.nextLine();
		
		System.out.print("Sobrenome: ");
		sobrenome = sc.nextLine();
		
		System.out.print("Sexo: ");
		sexo = sc.nextLine();
		
		System.out.print("Dia:");
		dia = sc.nextInt();
		
		System.out.print("Mês: ");
		mes = sc.nextInt();
		
		System.out.print("Ano: ");
		ano = sc.nextInt();
		
		System.out.print("Kg: ");
		peso = sc.nextDouble();
		
		System.out.print("Altura em metros: ");
		altura = sc.nextDouble();

		System.out.printf("Olá %s %s!%nVocê nasceu em %d/%02d/%d%n", nome, sobrenome, dia, mes, ano);
		
		System.out.printf("Você tem %d anos.%nSua Maxima frequência Cardiaca é de - %dbpm%nSua frequência deve estar em - %dbpm%n",
				cc.calcularIdade(), cc.calcularMax(), cc.calcularAlvo());
		System.out.printf("Peso: %.2fkg. Sua altura é: %.2fm.%n", peso, altura);
		
		System.out.printf("Seu IMC: %f%n", cc.calcularImc());
		
		sc.close();
	}

}
