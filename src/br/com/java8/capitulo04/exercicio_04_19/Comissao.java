package br.com.java8.capitulo04.exercicio_04_19;

import java.util.Scanner;

public class Comissao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String vendedor = "Andy";
		double a = 239.99;
		double b = 129.75;
		double c = 99.95;
		double d = 350.89;
		double semanal = 200;
		
		System.out.print("Quantas peças do ITEM 1 - R$ 239.99, foram vendidas: ");
		int itemUm = sc.nextInt(); 
		
		System.out.print("Quantas peças do ITEM 2 - R$ 129.75, foram vendidas: ");
		int itemDois = sc.nextInt();
		
		System.out.print("Quantas peças do ITEM 3 - R$ 99.95, foram vendidas: ");
		int itemTres = sc.nextInt();
		
		System.out.print("Quantas peças do ITEM 4 - R$ 350.89, foram vendidas: ");
		int itemQuatro = sc.nextInt();
		
		double totalUm = itemUm * a;
		double totalDois = itemDois * b;
		double totalTres = itemTres * c;
		double totalQuatro = itemQuatro * d;
		double totalVendas = totalUm + totalDois + totalTres + totalQuatro;
		double totalComissao = totalVendas * 9 / 100;
		
		System.out.printf("%nVendedor: %s%n", vendedor);
		System.out.printf("Total De Vendas: %.2f%n", totalVendas);
		System.out.printf("Comissao: %.2f%n", totalComissao);
		System.out.printf("Semanal: %.2f%n", semanal);
		System.out.printf("Essa semana ele recebeu: R$ %.2f", totalComissao+semanal);
		
		
	}

}
