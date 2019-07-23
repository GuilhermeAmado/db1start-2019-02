package com.db1.db1start;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ExListas {
	
	
	// Método que retorne o nome das cores que você mais gosta.
	public List<String> minhasCores() {
		List<String> cores = new ArrayList<String>(); 
		cores.add("Verde");
		cores.add("Preto");
		cores.add("Azul");
		return(cores);
	}
	
	// Método que passado uma lista retorne a quantidade de itens.
	public int contaArray(List<String> lista) {
		int tamanhoLista = lista.size();
		return tamanhoLista;
	}

	
	// Método que receba 3 Strings adicione a uma lista e remova o valor da segunda posição.
	public List<String> addListArray(String item1, String item2, String item3) {
		List<String> itens = new ArrayList<String>();
		itens.add(item1);
		itens.add(item2);
		itens.add(item3);
		itens.remove(1);
		return itens;
	}
	
	
	// Método que apresente os nomes das cores do exercicio 1 ordenados.
	public List<String> ordenaArrayList() {
		List<String> cores = minhasCores();
		Collections.sort(cores);
		return cores;
	}
	
	
	// Método que receba uma lista com as cores que você mais gosta e 
	// um atributo que receba uma cor a ser removida.
	
	public List<String> recebeListaDeletaItem(List<String> lista, String deleta) {
		lista.remove(deleta);
		return lista;
	}
	
	
	
	// Método que recebido uma lista de String, retorne ordenado de forma decrescente
	public List<String> inverteArrayList() {
		List<String> cores = minhasCores();
		Collections.sort(cores);	// primeiro ordena
		Collections.reverse(cores);	// depois inverte a ordem
		return cores;
	}
	
	
	// Método que receba uma lista de números inteiros e retorne uma lista de lista, 
	// contendo em uma das listas os números pares e em outra lista o números ímpares
	
	// Método que receba a seguinte quantidade de dados e exiba os nomes distintos pelo primeiro caracter e ordenados
	
	
	
	// Método que receba uma lista de Integer e retorna a soma.
			// criação da lista de números:
	public List<Integer> meusNumeros() {
		List<Integer> listaNum = new ArrayList<Integer>();
		listaNum.add(2);
		listaNum.add(5);
		listaNum.add(4);
		listaNum.add(3);
		listaNum.add(1);
		return listaNum;
	}
	
			// criação do método
	public int somaLista(List<Integer> numeros) {
		int soma = 0;
		for(int i = 0; i < numeros.size(); i++)
		    soma = soma + numeros.get(i);
		return soma;
	}
	
	
	
	// Método que receba uma lista de double e retorne a média.
	
	// Método que receba uma lista de Integer e devolva o menor valor.
	
	// Método que receba uma lista de Integer e devolva o maior valor.
	
	// Método que receba uma lista de Integer e remova todos os ímpares.
	
	// Método que receba uma frase e retorne todas as vogais.
	
	
	
}
