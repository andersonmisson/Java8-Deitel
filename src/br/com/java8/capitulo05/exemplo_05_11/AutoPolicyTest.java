package br.com.java8.capitulo05.exemplo_05_11;

//Autor: Anderson Misson
//Figura 5.12: AutoPolicyTest.java
//Demonstrando Strings em um switch

public class AutoPolicyTest {

	public static void main(String[] args) {

		// cria dois objetos AutoPolicy
		AutoPolicy policy1 = new AutoPolicy(11111111, "Toyota Camry", "NJ");
		AutoPolicy policy2 = new AutoPolicy(22222222, "Ford Fusion", "ME");

		// exibe se cada apólice esta em um estado "sem culpa"
		politicaSemFalhas(policy1);
		politicaSemFalhas(policy2);
	}

	// método que mostra se um AutoPolicy
	// está em um estado com segura de automóvel "sem culpa"
	public static void politicaSemFalhas(AutoPolicy politica) {
		System.out.println("A Politica de Carros: ");
		System.out.printf("Conta #: %d\t Carro: %s\t Estado: %s\t %s um estado sem falhas %n%n",
				politica.getNumeroDaConta(), politica.getModelo(), politica.getEstado(),
				(politica.isSemFalhas() ? "é" : "não é"));
	}

} // fim da classe AutoPolicyTest
