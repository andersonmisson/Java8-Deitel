package br.com.java8.capitulo06.exemplo_08_12;

public class EmployeeTest {

	public static void main(String[] args) {
		System.out.printf("Employee before instantiation: %d%n", Employee.getCount());

		// cria dois Employees; a contagem deve ser 2
		Employee e1 = new Employee("Susan", "Baker");
		Employee e2 = new Employee("Bob", "Blue");
		
		// Mostra que a contagem é 2 depois de criar dois Employees
		System.out.printf("%nEmployees after instantiation:%n");
		System.out.printf("via e1.getCount(): %d%n", e1.getCount());
		System.out.printf("via e2.getCount(): %d%n", e2.getCount());
		System.out.printf("via Employee.getCount(): %d%n", Employee.getCount());
		
		// Obtém nomes de Employees
		System.out.printf("%nEmployee 1: %s %s%nEmployee 2: %s %s%n",
				e1.getFirstName(), e1.getLastName(),
				e2.getFirstName(), e2.getLastName());
	}

} // Fim da classe EmployeeTest
