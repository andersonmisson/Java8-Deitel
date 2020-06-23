package br.com.java8.capitulo05.exercicio_05_22;

public class TrianglulosModificados {

	public static void main(String[] args) {

		// Tri�ngulo 1
        for(int i=0; i<10; i++){
            for(int j=0; j<i; j++){
                System.out.print('*');
            }
            System.out.println();
        }

        // Tri�ngulo B
        for(int i=10; i>=0; i--){
            for(int j=0; j<i; j++){
                System.out.print('*');
            }
            System.out.println();
        }

        // Tri�ngulo C
        for(int i=10; i>=0; i--){
            // Espa�o Em Branco
            for(int j=0; j<10 - i; j++){
                System.out.print(' ');
            }
            for(int k=0; k<i; k++){
                System.out.print('*');
            }
            System.out.println();
        }

        // Tri�ngulo D
        for(int i=1; i<=10; i++){
            // Espa�o Em Branco
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