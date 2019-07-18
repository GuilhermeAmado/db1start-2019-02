package com.db1.db1start;

public class CalculadoraSimples {
	
	// M�todo que soma dois n�meros
	public int somar(int numero1, int numero2) {
		return numero1 + numero2;
	}
	
	// M�todo que subtrai dois n�meros
	public int subtrair(int numero1, int numero2) {
		return numero1 - numero2;
	}
	
	// M�todo que multiplica dois n�meros
	public int multiplicar(int numero1, int numero2) {
		return numero1 * numero2;
	}
	
	// M�todo que divide dois n�meros
	public int dividir(int numero1, int numero2) {
		return numero1 / numero2;
	}
	
	// M�todo que diga se o n�mero � par 
	public boolean verificaPar(int numero) {
		if (numero % 2 == 0)
			return true;
		return false;
	}
	
	// M�todo que recebe dois n�meros e diz qual � o maior entre dois inteiros
	public int verificaMaiorNum(int numero1, int numero2) {
		int maior = Math.max(numero1, numero2);
		return maior;
	}
	
	// M�todo que a partir de um valor inicial, informa a quantidade de n �mpares at� 100
	public int contagemImpares(int inicio) {
		int impar = 0;
		for(int i = inicio; i <= 100; i++){
			if( i % 2 != 0)
				impar = impar + 1;
		}
		return impar;
	}

}
