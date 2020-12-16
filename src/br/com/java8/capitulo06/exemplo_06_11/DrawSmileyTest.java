package br.com.java8.capitulo06.exemplo_06_11;

import javax.swing.JFrame;

// Figura 6.12: DrawSmileyTest.java
// Aplicativo de teste que exibe um rosto sorridente

public class DrawSmileyTest {
	public static void main(String[] args) {
		DrawSmiley panel = new DrawSmiley();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(230, 250);
		application.setVisible(true);
	}

}// Fim da classe DrawSmileyTest
