package br.com.java8.capitulo03.exercicio_03_12;

import java.util.Scanner;

public class FaturaTeste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Fatura f1 = new Fatura();

		System.out.println("Relatorio Inicial");
		System.out.printf("%s : %s - %d unidades, R$ %.2f%n", f1.getNumero(), f1.getDescricao(), f1.getQuantidade(),
				f1.getPrecoUnidade());
		
		System.out.printf("----------------------------------%n");
		
		System.out.printf("Entre com um número: ");
		String num = sc.nextLine();
		f1.setNumero(num);
		
		System.out.printf("Entre Com a descrição: ");
		String desc = sc.nextLine();
		f1.setDescricao(desc);
		
		System.out.printf("Quantas Peças: ");
		int quant = sc.nextInt();
		f1.setQuantidade(quant);
		
		System.out.printf("Valor Por Cada Peça: ");
		double valor = sc.nextDouble();
		f1.setPrecoUnidade(valor);
		
		System.out.printf("NUM : %s,%nITEM: %s,%nQUANTIDADE: %d,%nVALOR: %.2f,%n", f1.getNumero(), f1.getDescricao(), f1.getQuantidade(), f1.getPrecoUnidade());

		System.out.printf("%d X %.2f = R$ %.2f", f1.getQuantidade(), f1.getPrecoUnidade(), f1.getContaFatura());
	}

}
