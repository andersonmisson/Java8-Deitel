package br.com.java8.capitulo04.exercicio_04_06;

public class Calcular {

	public static void main(String[] args) {

		int soma = 0;
		int x = 1;

		while (x <= 10) // enquanto x é menor ou igual a 10
		{
			soma += x; // adiciona x a soma
			++x; // incrementa x
		}
		System.out.printf("A soma é: %d%n", soma);
	}

}
