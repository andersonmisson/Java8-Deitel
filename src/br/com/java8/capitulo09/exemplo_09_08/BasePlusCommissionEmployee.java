package br.com.java8.capitulo09.exemplo_09_08;

// Figura 9.8: BasePlusCommissionEmployed.java
// Membro private da superclasse não podem ser acessador em um subclasse

public class BasePlusCommissionEmployee extends CommissionEmployee{

	private double baseSalary;
	
	// construtor de seis argumentos
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialsecurityNumber,
			double grossSales, double commissionRate ,double baseSalary) {
		
		// Chamada explicita para o construtor CommissionEmployee da superclasse
		super(firstName, lastName, socialsecurityNumber, grossSales, commissionRate);
	
	// se baseSalary é inválido, lança uma exceção
		if(baseSalary < 0.0)
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		
		this.baseSalary = baseSalary;
	
	}
			
	// configura o salário-base

	public void setBaseSalary(double baseSalary) {
		
		if(baseSalary < 0.0) {
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}
	}
	
	// Retorna Salario Base
	public double getBaseSalary() {
		return baseSalary;
	}
	
	// Calcula os lucros
	
	@Override
	public double earnings() {
		// não permitido: commissionRate e grossSales privado em superClasse
		return baseSalary + (commissionRate * grossSales);
	}
	
	// retorna a representação de String de BasePlusCommissionEmployee
	@Override
	public String toString() {
		// não é permitido: tenta acessar membro private da superclasse
		return String.format(
				"%s: %s %s%n%s: %s%n%s: %.2f%n%s: %2.f",
				"base-salaried commission employee", firstName, lastName,
				"social security number", socialSecurityNumber,
				"gross sales", grossSales, "commission rate", commissionRate,
				"base salary", baseSalary); 
		
		}
} // Fim da classe BasePlusCommissionEmployee
