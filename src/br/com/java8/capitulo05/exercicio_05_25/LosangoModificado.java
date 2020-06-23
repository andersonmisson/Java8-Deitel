package br.com.java8.capitulo05.exercicio_05_25;

import java.util.Scanner;

public class LosangoModificado {

	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);

	        System.out.print("Entre Com Um Número Impar (1 a 19): ");
	        int i = sc.nextInt();

	        int metade = (i / 2) + 1;
	        int extra = 0;

	        
	        for(i=1; i<metade; i++){
	            
	            for(int j=metade - i; j>0; j--){
	                System.out.print(' ');
	            }
	            for(int k=0; k<i + extra; k++){
	                System.out.print('*');
	            }
	            System.out.println();
	            extra++;
	        }

	        
	        for(i=metade; i>=0; i--){
	            
	            for(int j=0; j<metade - i; j++){
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