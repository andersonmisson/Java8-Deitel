package br.com.java8.capitulo03.exercicio_03_14;

public class Data {

	int dia;
	int mes;
	int ano;

	public Data() {
		this.dia = 01;
		this.mes = 01;
		this.ano = 1970;
	}

	public void setDia(int dia) {
		if (dia > 0 && dia < 32) {
			this.dia = dia;
		}

	}

	public int getDia() {
		return dia;
	}

	public void setMes(int mes) {
		if (mes > 0 && mes < 13) {
			this.mes = mes;
		}

	}

	public int getMes() {
		return mes;
	}

	public void setAno(int ano) {
		if (ano >= 0) {
			this.ano = ano;
		}

	}

	public int getAno() {
		return ano;
	}

}
