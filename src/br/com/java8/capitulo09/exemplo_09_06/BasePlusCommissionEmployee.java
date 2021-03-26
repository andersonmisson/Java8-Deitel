package br.com.java8.capitulo09.exemplo_09_06;

// Figura 09.06: BasePlusCommissionEmployee.java
// A classe BasePlusCommissionEmployee representa um empregado que recebe
// um sálario-base além da comissão

public class BasePlusCommissionEmployee {
	
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private double grossSales; // vendas brutas semanais
	private double commissionRate; // porcentagem da comissão
	private double baseSalary; // salário-base por semana


	
	// construtor de seis argumentos
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
		double commissionRate, double baseSalary) {
	
	// a chamada implícita para o contrutor padrão de Object ocorre aqui
		
	// se grossSales é inválido. lança um exceção
		if (grossSales < 0.0 ) {
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
	// Se commissionRate é invalido, lança uma excessão
		if (commissionRate <= 0.0 || commissionRate >=1.0) {
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}
				
	this.firstName = firstName;
	this.lastName = lastName;
	this.socialSecurityNumber = socialSecurityNumber;
	this.grossSales = grossSales;
	this.commissionRate = commissionRate;
	this.baseSalary = baseSalary;
	}// fim do construtor


	// Retorna o nome
	public String getFirstName() {
		return firstName;
	}


	// retorna o sobrenome
	public String getLastName() {
		return lastName;
	}


	// retorna o número de seguro social
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	// Configura a quantidade de vendas brutas
	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0) {
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
		
		this.grossSales = grossSales;
	}


	// Retorna a quantidade de vendas brutas
	public double getGrossSales() {
		return grossSales;
	}

	// configura a taxa de comissão
	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >= 1.0) {
		throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}
		this.commissionRate = commissionRate;
	}
	
	// Retorna a taca de comissão
	public double getCommissionRate() {
		return commissionRate;
	}

	
	// Configura o salário-base
	public void setBaseSalary(double baseSalary) {
		if(baseSalary < 0.0) {
			throw  new IllegalArgumentException("Base salary must be >= 0.0");
		}
		
		this.baseSalary = baseSalary;
	}
	
	
	// Retorna o salário-base
	public double getBaseSalary() {
		return baseSalary;
	}


	// Calcula os lucros
	public double earnings() {
		return baseSalary + (commissionRate * grossSales);
	}


	// Retorna a representação de String de BasePlusCommissionEmployee
	@Override
	public String toString() {
		return String.format(
				"%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
				"base-salaried commission employee", firstName, lastName,
				"social security number", socialSecurityNumber,
				"gross sales", grossSales, "commission rate", commissionRate,
				"base salary", baseSalary);
	}

} // fim da classe BasePlusCommissionEmployee
