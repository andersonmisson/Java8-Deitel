package br.com.java8.capitulo03.exercicio_03_14;

import java.util.Scanner;

public class DataTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Data data = new Data();

		System.out.printf("Data Inicial: %d/%d/%d%n", data.getDia(), data.getMes(), data.getAno());

		System.out.print("Dia: ");
		int dia = sc.nextInt();
		data.setDia(dia);

		System.out.print("Mês: ");
		int mes = sc.nextInt();
		data.setMes(mes);

		System.out.print("Ano: ");
		int ano = sc.nextInt();
		data.setAno(ano);

		System.out.printf("Data Alterada: %d/%d/%d%n", data.getDia(), data.getMes(), data.getAno());
	}

}
