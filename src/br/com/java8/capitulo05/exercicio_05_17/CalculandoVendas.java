package br.com.java8.capitulo05.exercicio_05_17;

public class CalculandoVendas {

    int produtoN, quantidade;
    double total;

    public void addProduct(int produtoN, int quantidade){
        switch(produtoN){
            case 1:
                total += (2.98 * quantidade);
                break;
            case 2:
                total += (4.50 * quantidade);
                break;
            case 3:
                total += (9.98 * quantidade);
                break;
            case 4:
                total += (4.49 * quantidade);
                break;
            case 5:
                total += (6.89 * quantidade);
                break;
            default:
                break;
        }
    }

    // GETTERS
    public double getTotal(){
        return total;
    }
}