package br.com.java8.capitulo05.exercicio_05_17;

import java.util.Scanner;

public class CalculandoVendasTeste {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        CalculandoVendas cv = new CalculandoVendas();

        int produtoN, quantidade;

        do{
            produtoN = requestInput("Entre com o número do produto 1-5 (-1 para sair): ", sc);

            if((produtoN != -1) && !(produtoN > 5)){
                quantidade = requestInput("Entre com a quantidade do produto: " + produtoN + ": ", sc);
                cv.addProduct(produtoN, quantidade);
            }

        }while((produtoN != -1));

        System.out.printf("Total: %.2f\n", cv.getTotal());
    }
    public static int requestInput(String s, Scanner sc){
        System.out.print(s);
        return sc.nextInt();
    }
}