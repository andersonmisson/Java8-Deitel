package br.com.java8.capitulo09.exemplo_09_13;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelDemo {

	public static void main(String[] args) {
	
		// Cria um rótulo com texto simples
		JLabel northLabel = new JLabel("Norte");

		// cria um ícone de uma imagem para podermos colocar em um JLabel
		ImageIcon labelIcon = new ImageIcon("coracao.gif");
		
		// cria um rótulo com um Icon em vez de texto
		JLabel centerLabel = new JLabel(labelIcon);
		
		// cria outro rótulo com um Icon
		JLabel southLabel = new JLabel(labelIcon);
		
		// configura o rótulo para exibir texto (bem como um ícone)
		southLabel.setText("South");
		
		// cria um quadro para armazenar os rótulos
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// adicionar os rótulos ao frame; o segundo argumento especifica
		// onde adicionar o tótulo no frame
		application.add(northLabel, BorderLayout.NORTH);
		application.add(centerLabel, BorderLayout.CENTER);
		application.add(southLabel, BorderLayout.SOUTH);
		
		application.setSize(500, 500);
		application.setVisible(true);
		
	} // fim do Main

} // Fim da classe Label Demo
