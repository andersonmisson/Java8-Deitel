package br.com.java8.capitulo04.exercicio_04_01_B;

// Autor: Anderson Misson
// Exercicio 04_01_A - Desenhando.java

import java.awt.Graphics;

import javax.swing.JPanel;

public class Desenhando extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		int largura = 0; // Começa a Largura
		int altura = getHeight(); // Pega Altura
		int passosLargura = getWidth() / 15;
		int passosAltura = altura / 15;

		// Desenho especifico de linhas em loop
		while (altura >= 0) {

			g.drawLine(0, 0, largura, altura);
			g.drawLine(getWidth(), 0, getWidth() - largura, altura);
			g.drawLine(0, getHeight(), getWidth() - largura, altura);
			g.drawLine(getWidth(), getHeight(), largura, altura);			
			largura = largura + passosLargura;
			altura = altura - passosAltura;

		}

	}

}
