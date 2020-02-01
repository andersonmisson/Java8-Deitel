package br.com.java8.capitulo04.exercicio_04_29;

public class QuadradoDeAsteriscos {

    int tamanhoLado;
    
    public  QuadradoDeAsteriscos(int tamanhoLado){
        this.tamanhoLado = tamanhoLado;
    }
    
    public String quadradoAsteriscos(){
        String quadradoAsteriscos = "";
        for (int i = 0 ; i<tamanhoLado ; i++){
            for (int j = 0 ; j<tamanhoLado ; j++){
                quadradoAsteriscos += "* ";
            }
            quadradoAsteriscos += "\n";
        }
        return quadradoAsteriscos;
    }
    
}