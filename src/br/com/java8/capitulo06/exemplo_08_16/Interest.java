package br.com.java8.capitulo06.exemplo_08_16;

import java.math.BigDecimal;
import java.text.NumberFormat;

// Interest.java
// Calculos de juros compostos com BigDecimal

public class Interest {

	public static void main(String[] args) {
		
		// Quantidade principal inicial inicial antes dos juros
		BigDecimal principal = BigDecimal.valueOf(1000.0);
		BigDecimal rate = BigDecimal.valueOf(0.05); // Taxa de juros
		
		// Exibe cabeçãlhos
		System.out.printf("%s%20s%n", "Year", "Amount on deposit");
		
		// Calcula quantidade de depósito para um dos dez anos
		for (int year = 1; year <=10; year++) {
			
			// Calcula nova quantidade durante ano especificado
			BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));
			
			// exibe o ano e a quantidade
			System.out.printf("%4d%20s%n", year, NumberFormat.getCurrencyInstance().format(amount));
		}

	}

}// fim da classe Interest
