package br.com.java8.capitulo09.exemplo_09_06;

// Figura 09.07: BasePlusCommissionEmployeeTest.java
// Programa de teste BasePlusCommissionEmployee.

public class BasePlusCommissionEmployeeTest {

	public static void main(String[] args) {
		// instancia o objeto BasePlusCommissionEmployee
		BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04, 300);

		// obtém os dados do empregado comissionado com salário-base
		System.out.println("Employee information obtained by get methods: %n");
		System.out.printf("%s %s%n", "First name is", employee.getFirstName());
		System.out.printf("%s %s%n", "Last name is", employee.getLastName());
		System.out.printf("%s %s%n", "Social security number is", employee.getSocialSecurityNumber());
		System.out.printf("%s %.2f%n", "Gross sales is", employee.getGrossSales());
		System.out.printf("%s %.2f%n", "Commission rate is", employee.getCommissionRate());
		System.out.printf("%s %.2f%n", "Base salary is", employee.getBaseSalary());
		
		employee.setBaseSalary(1000);
		
		System.out.printf("%n%s: %n%n%s%n", "Update employee information obtained by toString", employee.toString());
	}// fim do main

}// fim da classe BasePlusCommissionEmployeeTest
