package com.db1.db1start;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
		
		nomes.add("Maiko Cunha");
		nomes.add("Maiko Cunha");
		nomes.add("João");
		nomes.add("Maria");
		
		System.out.println(nomes);
		
		nomes.removeIf(banana -> banana.equals("Maiko Cunha"));		// lambda
		
		System.out.println(nomes);
		
		nomes.add("Fernando");
		
		System.out.println(nomes);
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		nomes.add(2, "João Felipe");
		
		System.out.println(nomes);
		
		List<Integer> numeros = new ArrayList<>();
		
		numeros.add(2);
		numeros.add(3);
		
		System.out.println(numeros);
		
		List<List<String>> todosOsNomes = new ArrayList<>();
		
		List<String> nomesComLetraA = new ArrayList<>();
		
		nomesComLetraA.add("Ana");
		
		todosOsNomes.add(nomes);
		todosOsNomes.add(nomesComLetraA);
		
		System.out.println(todosOsNomes);
		
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		pessoas.add(new Pessoa("Maiko Cunha"));
		
		for (Pessoa pessoa : pessoas) {				// percorre a lista
			System.out.println(pessoa.getNome());
		}
		
		
		if (pessoas.size() == 0) {
			System.out.println("Lista vazia");
		} else {
			System.out.println("Lista com valores: " + pessoas.size());
		}
	} 

}