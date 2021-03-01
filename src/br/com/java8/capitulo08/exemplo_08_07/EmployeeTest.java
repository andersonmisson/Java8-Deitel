package br.com.java8.capitulo08.exemplo_08_07;

// Figura 08.09: EmployeeTest.java
// Demonstração de composição

public class EmployeeTest {

	public static void main(String[] args) {
		
		Date birth = new Date(7, 24, 1949);
		Date hire = new Date(3, 12, 1988);
		Employee employee = new Employee("Bob", "Blue", birth, hire);
		
		System.out.println(employee);

	}

}
