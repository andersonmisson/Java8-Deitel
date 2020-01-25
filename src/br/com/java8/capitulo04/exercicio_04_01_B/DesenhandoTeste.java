package br.com.java8.capitulo04.exercicio_04_01_B;

//Autor: Anderson Misson
//Exercicio 04_01_A - Desenhando.java

import javax.swing.JFrame;

public class DesenhandoTeste {

	public static void main(String[] args) {
		// Criar um Painel
		Desenhando linhas = new Desenhando();

		// Criando JFrame
		JFrame aplicacao = new JFrame();

		// configura o frame para ser encerrado quando ele é fechado
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		aplicacao.add(linhas);
		aplicacao.setSize(250, 250);
		aplicacao.setVisible(true);

	}

}