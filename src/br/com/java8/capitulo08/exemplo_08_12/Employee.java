package br.com.java8.capitulo08.exemplo_08_12;

// Figura 08.12: Employee.java
// Variável static utilizada para manter uma contagem do número de
// Objetos Employee na memória

public class Employee {

	private static int count = 0; // número de employees criados
	private String firstName;
	private String lastName;
	
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		++count; // Incrementa contagem estática de empregados
		System.out.printf("Employee constructor: %s %s; count = %d%n", firstName, lastName, count);
	}

	// Obtém o primeiro nome
	public String getFirstName() {
		return firstName;
	}

	// Obtém o ultimo nome
	public String getLastName() {
		return lastName;
	}
	
	// Método estático para obter valor de contagem de estática
	public static int getCount() {
		return count;
	}
	
} // fim da classe Employee
