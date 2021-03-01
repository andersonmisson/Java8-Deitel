package br.com.java8.capitulo08.exemplo_08_17;

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;

// Figura 08.18: DrawPanel.java
// Programa que utiliza a classe MyLine
// para desenhar linhas aleatorias

import javax.swing.JPanel;

public class DrawPanel extends JPanel{

	private SecureRandom randomNumbers = new SecureRandom();
	private MyLine[] lines; // Array de linhas
	
	// construtor, cria um painel com formas aleatórias
	public DrawPanel() {
		
		setBackground(Color.WHITE);
		
		lines = new MyLine[5 + randomNumbers.nextInt(5)];
		
		// cria linha
		for(int count = 0; count < lines.length; count++) {
			
			// Gera coordenadas aleatórias
			int x1 = randomNumbers.nextInt(300);
			int y1 = randomNumbers.nextInt(300);
			int x2 = randomNumbers.nextInt(300);
			int y2 = randomNumbers.nextInt(300);
			
			// Gera uma cor aleatoria
			Color color = new Color(randomNumbers.nextInt(256),
					randomNumbers.nextInt(256), randomNumbers.nextInt(256));
			
			// Adiciona a linha a lista de linhas a ser exibida
			lines[count] = new MyLine(x1, y1, x2, y2, color);
		}
	}
	
	// para cada array de forma, desenha as formas individuais
	public void paintComponent(Graphics g) {
	
		super.paintComponent(g);
		
		// desenha as linhas
		for(MyLine line : lines) {
			line.draw(g);
		}
	}
	
} // Fim da classe DrawPanel
