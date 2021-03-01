package br.com.java8.capitulo07.exemplo_07_14;

// Figura 7.14: GradeBook.java
// Classe GradeBook utilizando um array para armazenar notas de teste

public class GradeBook {

	private String courseName; // nome do curso que essa GradeBook representa
	private int[] grades; // array de notas de aluno
	
	// construtor
	public GradeBook(String courseName, int[] grades) {
		
		this.courseName = courseName;
		this.grades = grades;
	}
	
	// método para configurar o nome do curso
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	// Método para recuperar o nome do curso
	public String getCourseName() {
		return courseName;
	}
	
	// Realiza várias operações nos dados
	public void processGrades() {
		
		// gera saída de array de notas
		outputGrades();
		
		// chama método getAverage para calcular a nota média
		System.out.printf("%nClass average is %.2f%n", getAverage());
		
		// chama métodos getMinimum e getMaximum
		System.out.printf("Lowest grade is %d%nHeighest grade is %d%n%n", getMinimum(), getMaximum());
		
		// chama outputBarChart para imprimir gráfico de distribuição de nota
		outputBarChart();
		
	}
	
	// Localiza nota mínima
	public int getMinimum() {
		
		int lowGrade = grades[0]; // supões que grades[0] é a menor nota
		
		// faz um loop pelo array de notas
		for(int grade : grades) {
			
			// se nota dor mais baixa que lowGrade, atribui essa nota a lowGrade
			if(grade < lowGrade) {
				lowGrade = grade; // nova nota mais baixa
			}
		}
		
		return lowGrade;
	}
	
	// Localiza nota máxima
	public int getMaximum() {
		int highGrade = grades[0]; // supões que grades[0] é a maior nota
		
		// faz um loop pelo array de notas
		for(int grade: grades) {
			// se a nota for maior que highGrade, atribui essa nota a highGrade
			if (grade > highGrade) {
				highGrade = grade; // nova nota mais alta
			}
		}
		
		return highGrade;
	}
	
	// Determina média para o teste
	public double getAverage() {
		int total = 0;
		
		// soma notas de um aluno
		for (int grade : grades) {
			total += grade;
		}
		
		// retorna média de notas
		return (double) total / grades.length;
	}
	
	// gera a saída do gráfico de barras exibindo distribuição de notas
	public void outputBarChart(){
		
		System.out.println("Grades distribution:");
	
		// armazena frequencia de notas en cada intervalo de 10 notas
		int[] frequency = new int[11];
		
		// Para cada nota, incrementa a frequencia apropriada
		for (int grade: grades) {
			++frequency[grade / 10];
		}
		
		// para cada frequencia de nota, imprime barra no gráfico
		for(int count = 0; count < frequency.length; count++) {
			// gera saida do rotulo de barra ("00-09: ", ... , "90-99: ", "100: ")
			if (count == 10 ) {
				System.out.printf("%5d: ", 100);
			} else {
				System.out.printf("%02d-%02d: ",
						count * 10, count * 10 + 9);
			}
			
			// imprime a barraa de asteriscos
			for (int stars = 0; stars < frequency[count]; stars++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// gera a saida do conteudo do array de notas
	public void outputGrades() {
		System.out.printf("The grades are:%n%n");
		
		// gera a saida da nota de cada aluno
		for(int student=0; student < grades.length; student++) {
			System.out.printf("Student %2d: %3d%n", 
					student + 1, grades[student]);
		}
	}
} // fim da classe GradeBook



















