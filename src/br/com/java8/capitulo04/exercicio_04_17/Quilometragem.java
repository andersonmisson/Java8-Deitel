package br.com.java8.capitulo04.exercicio_04_17;

import java.util.Scanner;

public class Quilometragem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int contador = 1;
		int totalQuilometros = 0;
		int totalGasolina = 0;

		System.out.println("Calcular a viagem: (0 - não, 1 - sim)");
		contador = sc.nextInt();

		while (contador != 0) {
			System.out.println("Quantos quilometros você fez: ");
			int quilometros = sc.nextInt();
			System.out.println("Quanta gasolina você usou:");
			int gasolina = sc.nextInt();
			
			totalQuilometros += quilometros; 
									
			totalGasolina += gasolina; 
										
			if (gasolina > 0) {
				double kmPorL = (double) quilometros / gasolina;
				System.out.printf("Nesta viagem, você fez %.2f de quilometros por litro.%n", kmPorL);
			}else{
				System.out.println("Nenhuma quantidade de gasolina fornecida!");
			}
			
			System.out.println("Calcular a proxima viagem: (0 - não, 1 - sim)");
			contador = sc.nextInt();
		}

		
		if (totalGasolina > 0) {
			double totalKmPorL = (double) totalQuilometros / totalGasolina;
			System.out.printf("A média de quilometros por litro de todas as viagens foram: %.2f", totalKmPorL);
		}
	}

}
