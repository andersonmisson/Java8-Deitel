package br.com.java8.capitulo03.exercicio_03_12;

public class Fatura {
	
	private String numero;
	private String descricao;
	private int quantidade;
	private double precoUnidade;

	public Fatura() {
		this.numero = " Sem Número na Tela";
		this.descricao = " Nenhuma descrição ";
		this.quantidade = 0;
		this.precoUnidade = 0.0;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPrecoUnidade() {
		return precoUnidade;
	}

	public void setPrecoUnidade(double precoUnidade) {
		this.precoUnidade = precoUnidade;
	}

	public double getContaFatura() {
		return getQuantidade() * getPrecoUnidade();
	}

}