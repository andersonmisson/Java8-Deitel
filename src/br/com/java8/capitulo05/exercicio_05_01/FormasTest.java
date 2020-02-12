package br.com.java8.capitulo05.exercicio_05_01;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

//Autor: Anderson Misson
//Exercício 05.01: FormasTest.java

public class FormasTest {

	public static void main(String[] args) {

		// Obtém a escolha do usuário
		String[] botao = { "Desenhar Circúlos", "Cancelar" };

		int escolha = JOptionPane.showOptionDialog(null, "Seleciona A Opção", "Formas", JOptionPane.PLAIN_MESSAGE, 3,
				null, botao, botao[0]);

		if(escolha !=1) {
		// cria o painel com a entrada do usuário
		Formas painel = new Formas(escolha);

		JFrame aplicacao = new JFrame(); // cria um novo JFrame

		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacao.add(painel);
		aplicacao.setSize(300, 300);
		aplicacao.setVisible(true);
		}
	}

}// fim da classe FormasTest
