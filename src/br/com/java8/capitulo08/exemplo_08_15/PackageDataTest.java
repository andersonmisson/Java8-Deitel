package br.com.java8.capitulo08.exemplo_08_15;

// Figura 08.15: PackageDataTest.java
// Membros de acesso de pacote de uma classe permanecem acessiveis a outras classes
// no mesmo pacote

public class PackageDataTest {

	public static void main(String[] args) {
		
		PackageData packageData = new PackageData();
		
		// gera saida da representação String de packageData()
		System.out.printf("After instantiation:%n%s%n", packageData);
		
		// muda os dados de acesso de pacote no objeto packageData
		packageData.number = 77;
		packageData.string = "Goobye";
		
		// gera saída da representação String de packageData
		System.out.printf("%nAfter changing value:%n%s%n", packageData);
	}

}

// Classe com variaveis de instancia de acesso de pacote
class PackageData{
	
	int number; // Variável de instância de acesso de pacote
	String string; // variável de instância de acesso de pacote
	
	// constructor
	public PackageData() {
		
		number = 0;
		string = "Hello";
	}
	
	// retorna a representação String do Objeto PackageData
	public String toString() {
		
		return String.format("number: %d; string: %s", number, string);
	}
} // fim da classe PackageData
