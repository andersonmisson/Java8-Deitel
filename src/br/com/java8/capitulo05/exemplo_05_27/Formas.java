package br.com.java8.capitulo05.exemplo_05_27;

import java.awt.Graphics;

import javax.swing.JPanel;

//Autor: Anderson Misson
//Figura 5.27: Formas.java
//Desenhando uma cascata de formas com base na escolha do usuário

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

		for (int i = 0; i < 10; i++) {

			// seleciona a forma com base na escolha do usuário
			switch (escolha) {
			case 1: // Desenha Retângulos
				g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
				break;
			case 2: // Desenha ovais
				g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
				break;
			}
		}
	}

} // Fim da Classe Formas
