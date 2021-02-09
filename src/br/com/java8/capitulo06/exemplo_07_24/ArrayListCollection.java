package br.com.java8.capitulo06.exemplo_07_24;

// Figura 07.24: ArrayListCollection.java
// Demonstração de coleção ArrayList<T> generica

import java.util.ArrayList;

public class ArrayListCollection {

	public static void main(String[] args) {
		// cria um novo arrayList de strings com uma capacidade inicial de 10
		ArrayList<String> items = new ArrayList<String>();
		
		items.add("red"); // anexa um item a lista
		items.add(0, "yellow"); // insere  "yellow" no indice 0
		
		// cabeçalho
		System.out.print("Display list contents with counter-controlled loop:");
		
		// exibe as cores na lista
		for (int i = 0; i < items.size(); i++) {
			System.out.printf(" %s", items.get(i));
		}
		
		// exibe as cores usando for aprimorada no método display
		display(items, "%nDisplay list contents with enhanced for statement: ");
		
		items.add("green"); // adiciona "green" ao fim da lista
		items.add("yellow"); // adiciona "yellow" ao fim da lista
		display(items, "List with two new elements: ");
		
		items.remove("yellow"); // remove o item no indice 1
		display(items, "Remove first instance of yellow: ");
		
		items.remove(1); // remove o item no indice 1
		display(items, "Remove second list element (green):");
		
		// verifica se um valor esta na List
		System.out.printf("\"red\" is %sin the list%n", items.contains("red") ? "": "not ");
		
		// exibe o numero de elementos na List
		System.out.printf("Size: %s%n", items.size());

	}
	
	// exibe elementos do Arrayist no console
	public static void display(ArrayList<String> items, String header) {
		System.out.printf(header); // exibe o cabeçalho
		
		// exibe cada elemento em itens
		for (String item : items) {
			System.out.printf(" %s", item);
		}
		
		System.out.println();
	}

}
