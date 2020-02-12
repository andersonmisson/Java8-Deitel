package br.com.java8.capitulo05.exemplo_05_27;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

//Autor: Anderson Misson
//Figura 5.28: FormasTest.java
//Obtendo a entrada de usuário e criando um JFrame para exibir as Formas

public class FormasTest {

	public static void main(String[] args) {

		// Obtém a escolha do usuário
		String input = JOptionPane
				.showInputDialog("Aperte 1 para desenhar Retângulos\n" + "Aperte 2 para desenhar Ovais");

		int escolha = Integer.parseInt(input); // converte a entrada em int

		// cria o painel com a entrada do usuário
		Formas painel = new Formas(escolha);

		JFrame aplicacao = new JFrame(); // cria um novo JFrame

		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacao.add(painel);
		aplicacao.setSize(300, 300);
		aplicacao.setVisible(true);

	}

}// fim da classe FormasTest
