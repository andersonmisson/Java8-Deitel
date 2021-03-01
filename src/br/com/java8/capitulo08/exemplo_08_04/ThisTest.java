package br.com.java8.capitulo08.exemplo_08_04;

// Figura 8.4: ThisTest.java
// this utilizado implícita e explicitamente para referência a membros de um objeto

public class ThisTest {

	public static void main(String[] args) {
		SimpleTime time = new SimpleTime(15, 30, 19);
		System.out.println(time.buildString());

	}

} // Fim da classe ThisTest

// classe SimpleTime demonstra a referencia "this"
class SimpleTime{
	private int hour; 	// 0-23
	private int minute; // 0-59
	private int second; // 0-59
	
	// se o construtor utilizar nomes de parametro identicos a 
	// nomes de variáveis de instância a referencia "this" será
	// exigida para distinguir entre os nomes
	
	public SimpleTime(int hour, int minute, int second) {
		
		this.hour = hour;		// configura a hora do objeto "this"
		this.minute = minute;   // configura o minuto do objeto "this"
		this.second = second;   // configura o segundo do objeto "this"
	}
	
	// utilizam "this" explicito e implícito para chamar toUniversalString
	public String buildString() {
		
		return String.format("%24s: %s%n24s: %s",
				"this.toUniversalString()", this.toUniversalString(),
				"toUniversalString()", toUniversalString());
	}
	
	// converte em String no formato de data/hora universal (HH:MM:SS)
	public String toUniversalString() {
		// "this" nao é requerido aqui para acessar variáveis de instancia,
		// porque o método não tem variaveis locais com os mesmos
		// nomes das variaveis de instancia
		return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
	}
}
