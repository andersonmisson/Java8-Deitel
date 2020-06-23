package br.com.java8.capitulo05.exercicio_05_23;

import java.util.Random;

public class LeisDeMorgan {

	public static void main(String[] args) {
	       Random rand = new Random();

	        int a = getNextInt(rand);
	        int b = getNextInt(rand);
	        int g = getNextInt(rand);
	        int i = getNextInt(rand);
	        int j = getNextInt(rand);
	        int x = getNextInt(rand);
	        int y = getNextInt(rand);

	        System.out.println("\nVALORES ALEATORIOS DE TESTE: ");
	        System.out.printf("a = %d, b = %d, g = %d, i = %d, j = %d, x = %d, y = %d\n",
	                a, b, g, i, j, x, y);

	        // A
	        // original - !(x < 5) && !(y >= 7)
	        // equivalente - !((x < 5 ) || (y >= 7))
	        System.out.println("\nEXPRESSÃO A\n");
	        System.out.printf("!(x < 5) && !(y >= 7)  - %s\n",
	                getResult(!(x < 5) && !(y >= 7)));
	        System.out.printf("!((x < 5) || (y >= 7)) - %s\n",
	                getResult(!((x < 5) || (y >= 7))));

	        // B
	        // original - !(a == b) || !(g != 5)
	        // equivalente - !((a == b) && (g != 5))
	        System.out.println("\nEXPRESSÃO B\n");
	        System.out.printf("!(a == b) || !(g != 5)) - %s\n",
	                getResult(!(a == b) || !(g != 5)));
	        System.out.printf("!((a == b) && (g != 5)) - %s\n",
	                getResult(!((a == b) && (g != 5))));

	        // C
	        // original - !((x <= 8) && (y > 4))
	        // equivalente - !(x <= 8) || !(y > 4)
	        System.out.println("\nEXPRESSÃO C\n");
	        System.out.printf("!((x <= 8) && (y > 4)) - %s\n",
	                getResult(!((x <= 8) && (y > 4))));
	        System.out.printf("!(x <= 8) || !(y > 4)  - %s\n",
	                getResult(!(x <= 8) || !(y > 4)));

	        // D
	        // original - !((i > 4) || (j <= 6))
	        // equivalente - !(i > 4) && !(j <= 6)
	        System.out.println("\nEXPRESSÃO D\n");
	        System.out.printf("!((i > 4) || (j <= 6)) - %s\n",
	                getResult(!((i > 4) || (j <= 6))));
	        System.out.printf("!(i > 4) && !(j <= 6)  - %s\n",
	                getResult(!(i > 4) && !(j <= 6)));
	    }
	    
	    public static int getNextInt(Random r){
	        return r.nextInt(150);
	    }
	
	    public static String getResult(boolean expr){
	        return expr ? "TRUE": "FALSE";
	    }
	}