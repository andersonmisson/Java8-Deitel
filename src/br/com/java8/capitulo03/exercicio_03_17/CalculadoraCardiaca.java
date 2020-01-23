package br.com.java8.capitulo03.exercicio_03_17;

public class CalculadoraCardiaca {

	private String nome;
	private String sobrenome;
	private int dia;
	private int mes;
	private int ano;
	private String sexo;
	private double peso;
	private double altura;

	public CalculadoraCardiaca() {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
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
	
	public double calcularImc() {
		double imc = (peso / ((altura * altura)/100));
		return imc;
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
