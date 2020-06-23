package br.com.java8.capitulo05.exercicio_05_22;

public class TrianglulosModificados {

	public static void main(String[] args) {

		// Triângulo 1
        for(int i=0; i<10; i++){
            for(int j=0; j<i; j++){
                System.out.print('*');
            }
            System.out.println();
        }

        // Triângulo B
        for(int i=10; i>=0; i--){
            for(int j=0; j<i; j++){
                System.out.print('*');
            }
            System.out.println();
        }

        // Triângulo C
        for(int i=10; i>=0; i--){
            // Espaço Em Branco
            for(int j=0; j<10 - i; j++){
                System.out.print(' ');
            }
            for(int k=0; k<i; k++){
                System.out.print('*');
            }
            System.out.println();
        }

        // Triângulo D
        for(int i=1; i<=10; i++){
            // Espaço Em Branco
            for(int j=10 - i; j>0; j--){
                System.out.print(' ');
            }
            for(int k=0; k<i; k++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}