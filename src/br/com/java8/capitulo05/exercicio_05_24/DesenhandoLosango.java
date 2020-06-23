package br.com.java8.capitulo05.exercicio_05_24;

public class DesenhandoLosango {

	public static void main(String[] args) {
        
        int extra = 0;

        
        for(int i=1; i<5; i++){
            
            for(int j=5 - i; j>0; j--){
                System.out.print(' ');
            }
            for(int k=0; k<i + extra; k++){
                System.out.print('*');
            }
            System.out.println();
            extra++;
        }

        
        for(int i=5; i>=0; i--){
            
            for(int j=0; j<5 - i; j++){
                System.out.print(' ');
            }
            for(int k=0; k<i + extra; k++){
                System.out.print('*');
            }
            System.out.println();
            extra--;
        }
    }
}