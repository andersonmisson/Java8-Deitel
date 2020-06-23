package br.com.java8.capitulo05.exercicio_05_15;

public class DesenhandoTriangulos {

	public static void main(String[] args) {
		
		
		for(int linha = 0; linha < 10; linha++){
			for(int coluna = 0; coluna < linha+1; coluna++){
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int linha = 0; linha < 10; linha++){
			for(int coluna = 0; coluna < 10 - linha; coluna++){
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int linha = 0; linha < 10; linha++){
			for(int coluna = 1; coluna < linha+1; coluna++){
				System.out.print(' ');
			}
			for(int coluna = 0; coluna < 10 - linha; coluna++){
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println();

		for(int linha = 0; linha < 10; linha++){
			for(int coluna = 0; coluna < 10 - (linha+1); coluna++){
				System.out.print(' ');
			}
			for(int coluna = 0; coluna < linha + 1; coluna++){
				System.out.print('*');
			}
			System.out.println();
		}

	}

}
