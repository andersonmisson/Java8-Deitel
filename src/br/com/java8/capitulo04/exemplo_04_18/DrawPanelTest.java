package br.com.java8.capitulo04.exemplo_04_18;

import javax.swing.JFrame;

// Autor: Anderson Misson
// Figura 04.19: DrawPanelTest.java
// Criando JFrame para exibir um DrawPanel

public class DrawPanelTest {

	public static void main(String[] args) {

		// cria um painel que contém nosso desenho
		DrawPanel painel = new DrawPanel();

		// cria um novo quadro para armazenar o painel
		JFrame aplicacao = new JFrame();

		// configura o frame para ser encerrado quando ele é fechado
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		aplicacao.add(painel); // Adiciona o painel ao frame
		aplicacao.setSize(250, 250); // Configura o tamanho do frame
		aplicacao.setVisible(true); // Torna o Frame Visível

	}

}// Fim da classe DrawPanelTest
