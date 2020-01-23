package br.com.java8.capitulo04.exemplo_04_04;

public class Estudante {

	private String nome;
	private double media;

	// Construtor
	public Estudante(String nome, double media) {
		this.nome = nome;

		// Valida média é > 0.0 e <= 100; caso contrário,
		// armazena o valor padrão da média da variável de instãncia (0.0)
		if (media > 0.0)
			if (media <= 100.0)
				this.media = media; // atribui a variavel de instância
	}

	// Define o nome de Estudante
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	// Define a média do Estudante
	public void setMedia(double media) {
		// Valida média é > 0.0 e <= 100; caso contrário,
		// armazena o valor padrão da média da variável de instãncia (0.0)
		if (media > 0.0)
			if (media <= 100.0)
				this.media = media; // atribui a variavel de instância
	}

	public double getMedia() {
		return media;
	}

	// Determina a media com a nota tirada.	

	public String getBoletim() {
		String boletim = ""; // inicializando um String vazia
		
		if (media >= 90.0)
			boletim = "A";
		else if (media >= 80.0)
			boletim = "B";
		else if (media >= 70.0)
			boletim = "C";
		else if (media >= 60.0)
			boletim = "D";
		else
			boletim = "F";
		
		return boletim;
			
	}
	
} // Finaliza a classe Estudante
