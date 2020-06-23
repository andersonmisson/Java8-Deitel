package br.com.java8.capitulo05.exercicio_05_21;

public class CalcularPitagoras {

	public static void main(String[] args) {
		int a = 0, b = 0, h = 0;
		
		System.out.println("Cateto\t\tCateto Oposto\t\tHipotenusa");
		
		for(int i=0; i<500; i++){
            checandoHipotenusa(++a, b, h);
            for(int j=0; j<500; j++){
                checandoHipotenusa(a, ++b, h);
                for(int k=0; k<500; k++){
                    checandoHipotenusa(a, b, ++h);
                }
                h = 0;
            }
            b = 0;
        }
    }
    
    public static void checandoHipotenusa(int a, int b, int h){
        if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(h, 2))
            pitagoras(a, b, h);
    }
    // print pythagorean triple
    public static void pitagoras(int a, int b, int h){
        System.out.printf("%d\t\t%d\t\t%d\n", a, b, h);
    }
}