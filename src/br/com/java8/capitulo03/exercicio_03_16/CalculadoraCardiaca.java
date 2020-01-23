package br.com.java8.capitulo03.exercicio_03_16;

public class CalculadoraCardiaca {

	private String nome;
	private String sobrenome;
	private int dia;
	private int mes;
	private int ano;

	public CalculadoraCardiaca(String nome, String sobrenome, int dia, int mes, int ano) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int calcularIdade() {
		int idade = 2020 - ano;
		return idade;
	}

	public int calcularMax() {
		int maxFrequenciaCardiaca = 220 - this.calcularIdade();
		return maxFrequenciaCardiaca;
	}

	public int calcularAlvo() {
		int frequenciaCardiacaAlvo = ((int) (this.calcularMax() * (3.0 / 4.0)));
		return frequenciaCardiacaAlvo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
