package br.com.java8.capitulo03.exercicio_03_11;

public class Conta {

	private String nome; // Variavel de Instância
	private double saldo; // Variável de Instância

	// Construtor
	public Conta(String nome, double saldo) {
		// Atribui NOME a variável de instância NOME
		this.nome = nome;

		if (saldo > 0.0) { // Se o saldo for válido
			this.saldo = saldo; // atribui SALDO a varável de instânia SALDO
		}

	}// Fechando o Construtor

	// Função Para Adicionar Dinheiro na conta

	public void deposito(double valorDoDeposito) {
		if (valorDoDeposito > 0.0) { // Se o deposito for maior que zero, ele é valido
			saldo = saldo + valorDoDeposito;
		}
	}

	// Função para Retirar o Dinheiro da Conta

	public void retirada(double valorDaRetirada) {
		if (valorDaRetirada <= saldo) {
			saldo = saldo - valorDaRetirada;

		if (valorDaRetirada > saldo) {
			System.out.println("Valor Do Débito Excedeu o saldo da conta");
			}
		}
	}

	// GETTERS AND SETTERS

	// Método que retorna o nome
	public String getNome() {
		return nome;
	}

	// Método que define o nome
	public void setNome(String nome) {
		this.nome = nome;
	}

	// Metodo que pega o Saldo
	public double getSaldo() {
		return saldo;
	}

}
