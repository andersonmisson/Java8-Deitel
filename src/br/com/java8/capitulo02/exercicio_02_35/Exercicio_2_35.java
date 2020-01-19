package br.com.java8.capitulo02.exercicio_02_35;

//Autor: Anderson Misson

import java.util.Scanner;

public class Exercicio_2_35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double tanque = 54, litro = 0.95f, gasolina = 4.558, encherotanque, km, km2;

		System.out.println("Escolhi o Celta para fazer Programa.");
		System.out.println("O Tanque cheio dele é 54 Litros");
		System.out.println("O Consumo é de 9.5km Por Litro");
		System.out.println("Dia: 19-01-2020 a gasolina estava R$ 4,558 por Litro");
		System.out.println("----------------------------------------------------------");

		encherotanque = tanque * gasolina;

		System.out.print("Quantos quilômetros você rodou hoje: ");
		km = sc.nextDouble();
		km2 = km * litro * gasolina;
		
		System.out.printf("Celta: Tanque %.0f Litros , Gasolina: R$%.3f, Tanque Cheio: R$ %.3f%n", tanque, gasolina,
				encherotanque);
		
		System.out.printf("Você rodou %.0fkm, e gastou R$ %.3f em gasolina", km, km2);
	}

}
