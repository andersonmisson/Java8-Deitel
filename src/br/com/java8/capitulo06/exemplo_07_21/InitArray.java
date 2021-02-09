package br.com.java8.capitulo06.exemplo_07_21;

// Figura 7.21: InitArray.java
// Inicializando um array com argumentos de linha de comando

public class InitArray {

	public static void main(String[] args) {
		
		// Verifica número de argumentos de linha de comando
		if(args.length !=3) {
			System.out.printf(
					"Error: Please re-enter the entire command, incluing%n" +
					"an array size, initial value ad increment. %n");
			
		}else {
			// Obtém o tamanho do array a partir do primeiro argumento de linha de comando
			int arrayLenght = Integer.parseInt(args[0]);
			int[] array = new int[arrayLenght];
			
			// Obtém o valor inicial e o incrementa a partir dos argumentos de linha de comando
			int initialValue = Integer.parseInt(args[1]);
			int increment = Integer.parseInt(args[2]);
			
			// Calcula valor de cada elemento do array
			for(int counter = 0; counter < array.length; counter++) {
				array[counter] = initialValue + increment * counter;
			}
			
			System.out.printf("%s%8s%n", "Index", "Value");
			
			// exibe o valor e o índice de array
			for(int counter = 0; counter < array.length; counter++) {
				System.out.printf("%5d%8d%n", counter, array[counter]);
			}
		}
		
	}

} // Fim da classe InitArray
