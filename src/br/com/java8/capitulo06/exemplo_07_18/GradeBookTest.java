package br.com.java8.capitulo06.exemplo_07_18;

// Figura 07.19: GradeBookTest.java
// GradeBookTest cria o objeto GradeBook utilizando um array bidimensional
// das notas e, então, invoca o método processGrades para analisá-las.

public class GradeBookTest {

	// método main inicia a execução de programa
	public static void main(String[] args) {
		
		// Array Bidimensional de notas de aluno
		int[][] gradesArray = {{87, 96, 70},
				{68, 87, 90},
				{94, 100, 90},
				{100, 81, 82},
				{83, 65, 85},
				{78, 87, 65},
				{85, 75, 83},
				{91, 94, 100},
				{76, 72, 84},
				{87, 93, 73}};
		
		GradeBook myGradeBook = new GradeBook(
				"CS101 Introduction to Java Programming", gradesArray);
		System.out.printf("Welcome to the grade book for%n%s%n%n",
				myGradeBook.getCourseName());
		myGradeBook.processGrades();

	}

} // Fim da classe GradeBookTest
