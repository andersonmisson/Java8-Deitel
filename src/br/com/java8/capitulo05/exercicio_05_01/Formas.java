package br.com.java8.capitulo05.exercicio_05_01;

import java.awt.Graphics;

import javax.swing.JPanel;

//Autor: Anderson Misson
//Exercício 05.01: FormasGUI.java


public class Formas extends JPanel {

	private int escolha; // uscolha do usuário de qual forma desenhar

	// construtor configura a escolha do usuário
	public Formas(int escolhaUsuario) {

		escolha = escolhaUsuario;
	}

	// desenha uma cascata de formas que iniciam do canto superior esquerdo
	public void paintComponent(Graphics g) {

		// paintComponent está na biblioteca GRAPHICS
		super.paintComponent(g);
		
		int largura = getWidth(); // Largura Total
		int altura = getHeight(); // Altura Total

		for (int i = 0; i < 12; i++) {

			// seleciona a forma com base na escolha do usuário
			switch (escolha) {
			case 0: // Desenha Circulos
				g.drawOval(largura / 2 - i * 10, altura / 2 - i * 10, 20 + i * 20, 20 + i * 20);
				break;
			}
		}
	}

} // Fim da Classe Formas
