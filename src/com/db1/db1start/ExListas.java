package com.db1.db1start;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ExListas {
	
	
	// M�todo que retorne o nome das cores que voc� mais gosta.
	public List<String> minhasCores() {
		List<String> cores = new ArrayList<String>(); 
		cores.add("Verde");
		cores.add("Preto");
		cores.add("Azul");
		return(cores);
	}
	
	// M�todo que passado uma lista retorne a quantidade de itens.
	public int contaArray(List<String> lista) {
		int tamanhoLista = lista.size();
		return tamanhoLista;
	}

	
	// M�todo que receba 3 Strings adicione a uma lista e remova o valor da segunda posi��o.
	public List<String> addListArray(String item1, String item2, String item3) {
		List<String> itens = new ArrayList<String>();
		itens.add(item1);
		itens.add(item2);
		itens.add(item3);
		itens.remove(1);
		return itens;
	}
	
	
	// M�todo que apresente os nomes das cores do exercicio 1 ordenados.
	public List<String> ordenaArrayList(List<String> cores) {
		Collections.sort(cores);
		return cores;
	}
	
	
	// M�todo que receba uma lista com as cores que voc� mais gosta e 
	// um atributo que receba uma cor a ser removida.
	
	public List<String> recebeListaDeletaItem(List<String> lista, String deleta) {
		lista.remove(deleta);
		return lista;
	}
	
	
	
	// M�todo que recebido uma lista de String, retorne ordenado de forma decrescente
	public List<String> inverteArrayList(List<String> cores) {
		Collections.sort(cores);	// primeiro ordena
		Collections.reverse(cores);	// depois inverte a ordem
		return cores;
	}
	
	
	// M�todo que receba uma lista de n�meros inteiros e retorne uma lista de lista, 
	// contendo em uma das listas os n�meros pares e em outra lista o n�meros �mpares
	public List<List<Integer>> separaParesImpares(List<Integer> numeros) {
		List<Integer> pares = new ArrayList<Integer>();	// cria uma lista para inserir numeros pares
		List<Integer> impares = new ArrayList<Integer>();	// cria uma lista para inserir numeros impares
		List<List<Integer>> listaNumeros = new ArrayList<>();
		for (int i : numeros) {
            if (i % 2 == 0) { pares.add(i); }
            else {
            	impares.add(i);
            }
        }
		
		listaNumeros.add(pares);		// index 0
		listaNumeros.add(impares);		// index 1
		
		return listaNumeros;
		
	}
	
	// M�todo que receba a seguinte quantidade de dados e exiba os nomes distintos pelo primeiro caracter e ordenados
	
	
	
	// M�todo que receba uma lista de Integer e retorna a soma.
			// cria��o da lista de n�meros:
	public List<Integer> meusNumeros() {
		List<Integer> listaNum = new ArrayList<Integer>();
		listaNum.add(2);
		listaNum.add(5);
		listaNum.add(4);
		listaNum.add(3);
		listaNum.add(1);
		return listaNum;
	}
	
			// cria��o do m�todo
	public int somaLista(List<Integer> numeros) {
		int soma = 0;
		for(int i = 0; i < numeros.size(); i++)
		    soma = soma + numeros.get(i);
		return soma;
	}
	
	
	
	// M�todo que receba uma lista de double e retorne a m�dia.
			// cria��o da lista de n�meros double:
	public List<Double> meusNumerosDouble() {
		List<Double> listaNumDouble = new ArrayList<Double>();
		listaNumDouble.add(2.5);
		listaNumDouble.add(3.5);
		listaNumDouble.add(3.1);
		return listaNumDouble;
	}
			// cria��o do m�todo 
	public double somaListaDouble(List<Double> numeros) {
		double soma = 0;
		for(int i = 0; i < numeros.size(); i++)
		    soma = soma + numeros.get(i);
		return soma;
	}
	
	
	// M�todo que receba uma lista de Integer e devolva o menor valor.
	public int retornaMenorValorEmUmaLista(List<Integer> numeros) {
		int menor = Collections.min(numeros);
		return menor;
	}
	
	// M�todo que receba uma lista de Integer e devolva o maior valor.
	public int retornaMaiorValorEmUmaLista(List<Integer> numeros) {
		int maior = Collections.max(numeros);
		return maior;
	}
	
	// M�todo que receba uma lista de Integer e remova todos os �mpares.
	public List<Integer> removeNumerosImpares(List<Integer> numeros) {
		List<Integer> remover = new ArrayList<Integer>();	// cria uma lista para inserir numeros a remover
		for (int i : numeros) {
            if (i % 2 != 0) { remover.add(i); }
        }

        numeros.removeAll(remover);	// remove da lista <numeros> todos os numeros inclusos na lista <remover>
        return numeros;
	}
	
	// M�todo que receba uma frase e retorne uma lista com todas as vogais.
	/* public List<String> guardaVogais(String frase) {
		List<String> vogais = new ArrayList<String>();
		for (int i = 0; i < frase.length(); i++) {
	        if((frase.charAt(i) == 'a') ||
	            (frase.charAt(i) == 'e') ||
	            (frase.charAt(i) == 'i') ||
	            (frase.charAt(i) == 'o') ||
	            (frase.charAt(i) == 'u')) {
	            vogais.addAll(frase.charAt(i), vogais);
	        }
	    }
	    return vogais;
	} */
	
	
}
