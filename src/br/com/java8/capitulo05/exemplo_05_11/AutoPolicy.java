package br.com.java8.capitulo05.exemplo_05_11;

//Autor: Anderson Misson
//Figura 5.11: AutoPolicy.java
// Classe que representa uma apólice de segura de automóvel

public class AutoPolicy {

	private int numeroDaConta; // Número da Conta da Apólice
	private String modelo; // Carro ao qual a apólice é aplicada
	private String estado; // abreviatura do estado com duas letras

	// construtor
	public AutoPolicy(int numeroDaConta, String modelo, String estado) {
		this.numeroDaConta = numeroDaConta;
		this.modelo = modelo;
		this.estado = estado;
	}

	// Define o numedoDaConta
	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	// Retorna o numeroDaConta
	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	// configura modelo
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	// retorna o modelo
	public String getModelo() {
		return modelo;
	}

	// define estado
	public void setEstado(String estado) {
		this.estado = estado;
	}

	// retorna estado
	public String getEstado() {
		return estado;
	}

	// Metodo predicado é retornado se o estado tem seguros "Sem Culpa"
	public boolean isSemFalhas() {
		boolean semFalhas;

		// determina se o estado tem seguros de automóvel "Sem Culpa"
		switch (getEstado()) { // obtém a abreviatura do estado do objeto AutoPolicy
		case "MA":
		case "NJ":
		case "NY":
		case "PA":
			semFalhas = true;
			break;
		default:
			semFalhas = false;
			break;

		}
		return semFalhas;
	}

} // Fim Da Classe AutoPolicy
