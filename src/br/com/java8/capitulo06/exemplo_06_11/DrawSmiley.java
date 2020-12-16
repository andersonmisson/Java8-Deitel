package br.com.java8.capitulo06.exemplo_06_11;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

// Figura 6.11: DrawSmiley.java
// Desenhando um rosto sorridente com cores e formas preenchidas

public class DrawSmiley extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// Desenha o Rosto
		g.setColor(Color.YELLOW);
		g.fillOval(10, 10, 200, 200); // X, Y, WIDTH, HEIGHT
		
		// Desenha os Olhos
		g.setColor(Color.BLACK);
		g.fillOval(55, 65, 30, 30); // X, Y, WIDTH, HEIGHT
		g.fillOval(135, 65, 30, 30);
		
		// Desenha a Boca
		g.fillOval(50, 110, 120, 60);
		
		// "retoca" a boca para criar um sorriso
		g.setColor(Color.YELLOW);
		g.fillRect(50, 110, 120, 30);
		g.fillOval(50, 120, 120, 40);
		
	}

}// Fim da classe DrawSmiley
