package br.com.java8.capitulo04.exemplo_04_18;

import java.awt.Graphics;

import javax.swing.JPanel;

// Autor: Anderson Misson
// Figura 04.18 - DrawPanel.java
// Utilizando DrawLine para conectar os cantos de um painel

public class DrawPanel extends JPanel {

	// desenha um X a partir dos cantos do paine
	public void paintComponent(Graphics g) {

		// chama paintComponent para assegurar que o painel é exibido corretamente
		super.paintComponent(g);
		
		int largura = getWidth(); // Largura Total
		int altura = getHeight(); // Altura Total
		
		// Desenha uma linha a partir do canto superior esquerdo até o inferior direito
		g.drawLine(0, 0,largura, altura);
		
		// Desenha uma linha a partir do canto inferior esquerdo até o superior direito
		g.drawLine(0, altura, largura, 0);
	}
} // fim da classe DrawPanel
