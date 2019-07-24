package com.db1.db1start;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;

public class ExListas {
	
	
	// 1 - M�todo que retorne o nome das cores que voc� mais gosta.
	public List<String> minhasCores() {
		List<String> cores = new ArrayList<String>(); 
		cores.add("Verde");
		cores.add("Preto");
		cores.add("Azul");
		return(cores);
	}
	
	// 2 - M�todo que passado uma lista retorne a quantidade de itens.
	public int contaArray(List<String> lista) {
		int tamanhoLista = lista.size();
		return tamanhoLista;
	}

	
	// 3 - M�todo que receba 3 Strings adicione a uma lista e remova o valor da segunda posi��o.
	public List<String> addListArray(String item1, String item2, String item3) {
		List<String> itens = new ArrayList<String>();
		itens.add(item1);
		itens.add(item2);
		itens.add(item3);
		itens.remove(1);
		return itens;
	}
	
	
	// 4 - M�todo que apresente os nomes das cores do exercicio 1 ordenados.
	public List<String> ordenaArrayList(List<String> cores) {
		Collections.sort(cores);
		return cores;
	}
	
	
	// 5 - M�todo que receba uma lista com as cores que voc� mais gosta e 
	// um atributo que receba uma cor a ser removida.
	
	public List<String> recebeListaDeletaItem(List<String> lista, String deleta) {
		lista.remove(deleta);
		return lista;
	}
	
	
	
	// 6 - M�todo que recebido uma lista de String, retorne ordenado de forma decrescente
	public List<String> inverteArrayList(List<String> cores) {
		Collections.sort(cores);	// primeiro ordena
		Collections.reverse(cores);	// depois inverte a ordem
		return cores;
	}
	
	
	// 7 - M�todo que receba uma lista de n�meros inteiros e retorne uma lista de lista, 
	// contendo em uma das listas os n�meros pares e em outra lista o n�meros �mpares
	public List<List<Integer>> separaParesImpares(List<Integer> numeros) {
		List<Integer> pares = new ArrayList<Integer>();	// cria uma lista para inserir numeros pares
		List<Integer> impares = new ArrayList<Integer>();	// cria uma lista para inserir numeros impares
		List<List<Integer>> listaNumeros = new ArrayList<>();
		for (int i : numeros) {
			if (i % 2 == 0) {
				pares.add(i); 
			} else { 
				impares.add(i); 
			}
        }
		
		listaNumeros.add(pares);		// index 0
		listaNumeros.add(impares);		// index 1
		
		return listaNumeros;
		
	}
	
	
	// 8 - M�todo que receba a seguinte quantidade de dados e exiba os nomes distintos pelo primeiro caracter e ordenados
			// cria��o da lista de pessoas:
	public List<String> listaNomes() {
		List<String> nomes = new ArrayList<String>();
		nomes.add("ANA");
		nomes.add("ANA LAURA");
		nomes.add("JOSE");
		nomes.add("WAGNER");
		nomes.add("RODOLFO");
		nomes.add("ROBERVAL");
		nomes.add("RODOLPHO");
		nomes.add("VAGNER");
		nomes.add("JOS�");
		nomes.add("JOALDO");
		nomes.add("CLECIO");
		nomes.add("JOS�");
		nomes.add("MARIA");
		nomes.add("MARCOS");
		
		return nomes;
	}
	
			// cria��o do m�todo (lista de lista)
	public List<List<String>> distingueOrdenaNomes(List<String> listaNomes) {
		Collections.sort(listaNomes);
		return new ArrayList<>(listaNomes.stream().collect(Collectors.groupingBy(nome -> nome.charAt(0))).values());
	}
		
	
	
	// 9 - M�todo que receba uma lista de Integer e retorna a soma.
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
	
	
	
	// 10 - M�todo que receba uma lista de double e retorne a m�dia.
			// cria��o da lista de n�meros double:
	public List<Double> meusNumerosDouble() {
		List<Double> listaNumDouble = new ArrayList<Double>();
		listaNumDouble.add(2.5);
		listaNumDouble.add(3.5);
		listaNumDouble.add(3.1);
		return listaNumDouble;
	}
			// cria��o do m�todo 
	public double mediaListaDouble(List<Double> numeros) {
		double soma = 0;
		for(int i = 0; i < numeros.size(); i++)
		    soma = soma + numeros.get(i);
		return soma/numeros.size();
	}
	
	
	// 11 - M�todo que receba uma lista de Integer e devolva o menor valor.
	public int retornaMenorValorEmUmaLista(List<Integer> numeros) {
		int menor = Collections.min(numeros);
		return menor;
	}
	
	// 12 - M�todo que receba uma lista de Integer e devolva o maior valor.
	public int retornaMaiorValorEmUmaLista(List<Integer> numeros) {
		int maior = Collections.max(numeros);
		return maior;
	}
	
	// 13 - M�todo que receba uma lista de Integer e remova todos os �mpares.
	public List<Integer> removeNumerosImpares(List<Integer> numeros) {
		List<Integer> remover = new ArrayList<Integer>();	// cria uma lista para inserir numeros a remover
		for (int i : numeros) {
            if (i % 2 != 0) { remover.add(i); }
        }

        numeros.removeAll(remover);	// remove da lista <numeros> todos os numeros inclusos na lista <remover>
        return numeros;
	}
	
	// 14 - M�todo que receba uma frase e retorne uma lista com todas as vogais.
	public List<String> guardaVogais(String frase) {
		List<String> vogais = new ArrayList<String>();
		for (char ch : frase.toLowerCase().toCharArray()) {
	        if (ch == 'a') {
	        	vogais.add("a");
	        } else if (ch == 'e') {
	        	vogais.add("e");
	        } else if (ch == 'i') {
	        	vogais.add("i");
	        } else if (ch == 'o') {
	        	vogais.add("o");
	        } else if (ch == 'u') {
	        	vogais.add("u");
	        }
	    }
	    return vogais;
	} 
	
	
}
