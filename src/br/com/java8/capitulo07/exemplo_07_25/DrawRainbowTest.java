package br.com.java8.capitulo07.exemplo_07_25;

import javax.swing.JFrame;

public class DrawRainbowTest {

	public static void main(String[] args) {
		
		DrawRainbow panel = new DrawRainbow();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(400, 250);
		application.setVisible(true);

	}

} // Fim da Classe DrawRainbowTest
