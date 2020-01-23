package br.com.java8.capitulo03.exercicio_03_13;

public class Empregado {

	String nome;
	String sobrenome;
	double salario;

	public Empregado() {
		this.nome = "Nome";
		this.sobrenome = "Sobrenome";
		this.salario = salario;
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (salario > 0.0) {
			this.salario = salario;
		}

	}
}
