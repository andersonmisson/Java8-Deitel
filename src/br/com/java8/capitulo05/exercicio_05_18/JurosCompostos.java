package br.com.java8.capitulo05.exercicio_05_18;

public class JurosCompostos {

	public static void main(String[] args) {
		int montante;
        int valor = 1000; 
        int juros = 5; 

        System.out.printf("%s%20s\n", "ANO", "MONTANTE");

        for(int ano=0; ano<=10; ano++){
        	
            montante = valor * (int)Math.pow(1 + juros, ano);

            System.out.printf("%4d%,20d\n", ano, montante);
        }
    }
}