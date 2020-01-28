package br.com.java8.capitulo04.exercicio_04_25;

public class Misterio2 {

	public static void main(String[] args) {

		int count = 1;
		while (count <= 10) {
			System.out.println(count % 2 == 1 ? "****" : "++++++++");
			++count;
		}

	}

}
