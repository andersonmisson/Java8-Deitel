package br.com.java8.capitulo03.exemplo_03_01e02;

// Autor: Anderson Misson

// Figura 3.1: Account.java
// Classe Account que contém uma variável de instância name
// e métodos para configurar e obter seu valor

public class Account {

	private String name; // Variável de instância.

	// método para definir o nome no objeto
	public void setName(String name) {
		this.name = name;
	}

	// método para repurar o nome do objeto
	public String getName() {
		return name; // retorna valor do nome para o chamador
	}

} // Fim da Classe Account
