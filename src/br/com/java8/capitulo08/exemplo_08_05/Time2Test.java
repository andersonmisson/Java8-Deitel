package br.com.java8.capitulo08.exemplo_08_05;

// Figura 8.6: Time2Test.java
// Construtores sobrecarregados utilizados para iniciar objetos Time2

public class Time2Test {

	public static void main(String[] args) {
		
		Time2 t1 = new Time2(); // 00:00:00
		Time2 t2 = new Time2(2); // 02:00:00
		Time2 t3 = new Time2(21,34); // 21:34:00
		Time2 t4 = new Time2(12,25,42); // 12:25:42
		Time2 t5 = new Time2(t4); // 12:25:42
		
		System.out.println("Constructed with:");
		displayTime("t1: all default arguments", t1);
		displayTime("t2: all default arguments", t2);
		displayTime("t3: all default arguments", t3);
		displayTime("t4: all default arguments", t4);
		displayTime("t5: all default arguments", t5);
		
		try {
			Time2 t6 = new Time2(27,74,99); // valores inválidos
		} catch (IllegalArgumentException e) {
			System.out.printf("%nException while initializing t6: %s%n", e.getMessage());
		}

	}
	
	// exibe um objeto Time2 nos formatos de 24 horas e 12 horas
	private static void displayTime(String header, Time2 t) {
		System.out.printf("%s%n  %s%n  %s%n",
				header, t.toUniversalString(), t.toString());
	}

}
