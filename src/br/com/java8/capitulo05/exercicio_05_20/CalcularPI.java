package br.com.java8.capitulo05.exercicio_05_20;


public class CalcularPI {
	private static final long TERMOS = 200000;
	
	public static void main(String[] args) {
		double serieInfinita = 0.0f;
        boolean aviso = true;
        long contador = 0;

        for(int i=1; i<=TERMOS; i+=2){
            
            if(i % 2 == 0)
                continue;

            if(aviso)
                serieInfinita += (4.0 / (double)i);
            else
                serieInfinita -= (4.0 / (double)i);

            System.out.printf("%d. i = %d, Serie Infinita = %f\n", ++contador, i, serieInfinita);

            aviso = !aviso;
        }

        System.out.printf("PI calculated from the infinite series 20,000 times: %f\n",
                serieInfinita);
    }
}