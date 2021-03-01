package br.com.java8.capitulo09.exemplo_09_04;

// Figura 9.5: CommissionEmployeeTest.java
// Programa de teste da classe CommissionEmployee

public class CommissionEmployeeTest {

	public static void main(String[] args) {
		// instancia o objeto CommissionEmployee
		CommissionEmployee employee = new CommissionEmployee("Sue", "Jones", "222-22-2222", 100000, .06);
		
		//obtem os dados de empregado comissionado
		System.out.println("Employee information obtained bt get methods:");
		System.out.printf("%n%s %s%n", "First name is", employee.getFirstName());
		System.out.printf("%s %s%n", "Last name is", employee.getLastName());
		System.out.printf("%s %s%n", "Social security number is", employee.getSocialSecurityNumber());
		System.out.printf("%s %.2f%n", "Gross sales is", employee.getGrossSales());
		System.out.printf("%s %.2f%n", "Commission rate is", employee.getCommisionRate());
		
		employee.setGrossSales(5000);
		employee.setCommissionRate(.1);
		
		System.out.printf("%n%s: %n%n%s%n", "Update employee information obtained by toString", employee);
		
	} // fim de main

} // fim da classe ComissionEmployeeTest
