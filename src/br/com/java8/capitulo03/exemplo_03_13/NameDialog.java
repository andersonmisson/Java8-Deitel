package br.com.java8.capitulo03.exemplo_03_13;

import javax.swing.JOptionPane;

// Autor: Anderson Misson
// Figura 3.13: NameDialog.Java
// Obtendo a entrada de usuário a partir de um diálogo

public class NameDialog {

	public static void main(String[] args) {
		
		// Pede para o usuário inserir o seu nome
		String nome = JOptionPane.showInputDialog("Qual é o seu nome? ");
		
		// Cria a mensagem
		String mensagem = String.format("Bem Vindo, %s. Vamos Programar em Java", nome);
		
		// Exibe a mensagem para cumprimentar o usuário pelo nome
		JOptionPane.showMessageDialog(null, mensagem);

	}// Fim de main

}// termina NameDialog
