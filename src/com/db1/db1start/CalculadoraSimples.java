package com.db1.db1start;

public class CalculadoraSimples {
	
	// Método que soma dois números
	public int somar(int numero1, int numero2) {
		return numero1 + numero2;
	}
	
	// Método que subtrai dois números
	public int subtrair(int numero1, int numero2) {
		return numero1 - numero2;
	}
	
	// Método que multiplica dois números
	public int multiplicar(int numero1, int numero2) {
		return numero1 * numero2;
	}
	
	// Método que divide dois números
	public int dividir(int numero1, int numero2) {
		return numero1 / numero2;
	}
	
	// Método que diga se o número é par 
	public boolean verificaPar(int numero) {
		if (numero % 2 == 0)
			return true;
		return false;
	}
	
	// Método que recebe dois números e diz qual é o maior entre dois inteiros
	public int verificaMaiorNum(int numero1, int numero2) {
		int maior = Math.max(numero1, numero2);
		return maior;
	}
	
	// Método que a partir de um valor inicial, informa a quantidade de n ímpares até 100
	public int contagemImpares(int inicio) {
		int impar = 0;
		for(int i = inicio; i <= 100; i++){
			if( i % 2 != 0)
				impar = impar + 1;
		}
		return impar;
	}

}
