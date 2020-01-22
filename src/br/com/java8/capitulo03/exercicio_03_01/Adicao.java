package br.com.java8.capitulo03.exercicio_03_01;

import javax.swing.JOptionPane;

// Autor: Anderson Misson
// Figura 2.7 para Criar com JOptionPane
// Adição que insere dois números, então exibe a soma deles

public class Adicao {

	public static void main(String[] args) {
		int z;
		
		String num1 = JOptionPane.showInputDialog("Número1:");
		int x = Integer.parseInt(num1);
		
		String num2 = JOptionPane.showInputDialog("Número2: ");
		int y = Integer.parseInt(num2);
		
		z = x + y;
		
		String mensagem = String.format("%d + %d = %d%n", x,y,z);
		
		JOptionPane.showMessageDialog(null, mensagem);

	}

}
