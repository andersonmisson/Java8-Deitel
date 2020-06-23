package br.com.java8.capitulo05.exercicio_05_16;

import java.util.Scanner;

public class DesenhandoAsterisco {

	public static void main(String[] args) {
		
		int num1,num2,num3,num4,num5;

		Scanner input = new Scanner(System.in);
		
		System.out.println("Escolha 5 números de 1 a 30");

	      do{ 
	            System.out.print("Entre com o 1° número: ");
	            num1 = input.nextInt();
	        }while(num1 < 0 || num1 > 30);
	      
	      do{ 
	            System.out.print("Entre com o 2° número: ");
	            num2 = input.nextInt();
	        }while(num2 < 0 || num2 > 30);
	      do{ 
	            System.out.print("Entre com o 3° número: ");
	            num3 = input.nextInt();
	        }while(num3 < 0 || num3 > 30);
	      do{ 
	            System.out.print("Entre com o 4° número: ");
	            num4 = input.nextInt();
	        }while(num4 < 0 || num4 > 30);
	      do{ 
	            System.out.print("Entre com o 5° número: ");
	            num5 = input.nextInt();
	        }while(num5 < 0 || num5 > 30);
	      
	      System.out.println("");

	        for (int i = 1; i <= num1 ; i++ ) {
	        	if(i == 1){
	        		System.out.print(num1+": ");
	        	}
	        	System.out.print("*");
	        }
	        System.out.println("");

	        for (int i = 1; i <= num2 ; i++ ) {
	        	if(i == 1){
	        		System.out.print(num2+": ");
	        	}
	        	System.out.print("*");
	        }
	        System.out.println("");

	        for (int i = 1; i <= num3 ; i++ ) {
	        	if(i == 1){
	        		System.out.print(num3+": ");
	        	}
	        	System.out.print("*");
	        }
	        System.out.println("");

	        for (int i = 1; i <= num4 ; i++ ) {
	        	if(i == 1){
	        		System.out.print(num4+": ");
	        	}
	        	System.out.print("*");
	        }
	        System.out.println("");

	        for (int i = 1; i <= num5 ; i++ ) {
	        	if(i == 1){
	        		System.out.print(num5+": ");
	        	}
	        	System.out.print("*");
	        }
	        System.out.println("");
	}

}