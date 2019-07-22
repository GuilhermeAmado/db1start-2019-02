package com.db1.db1start;

public class ManTexto {
	
	// M�todo que recebe um texto e devolve ele em LETRAS MAIUSCULAS  
	public String upper(String texto) {
		if (texto != null && !texto.isBlank()) {
			String upper = texto.toUpperCase();
			return upper;
		}
		String erro = "Texto inv�lido";
		return erro;
	}
	
	// M�todo que recebe um texto e devolve ele em LETRAS MINUSCULAS
	public String lower(String texto) {
		if (texto != null && !texto.isBlank()) {
			String lower = texto.toLowerCase();
			return lower;
		}
		String erro = "Texto inv�lido";
		return erro;
	}
	
	// M�todo que recebe "DB1START" e retorna a quantidade de letras que existe nesta palavra  
	public Integer contaLetras(String palavra) {
		int letras = 0;
		for (int i = 0; i < palavra.length(); i++) {
			if (Character.isLetter(palavra.charAt(i)))
				letras++;
	    }
		return letras;
	}
	
	// M�todo que recebe " DB1START " (tendo um espa�o no inicio e no fim da palavra) e retorna a quantidade de letras que existe
	// M�todo que retorna o item 4 com a mesma quantidade de letras do item 3
	public Integer removeEspacoContaLetras(String palavra) {
		int letras = 0;
		palavra = palavra.replaceAll("\\s", "");	// remove espa�os em branco - poderia se usar o m�todo strip tamb�m
		for (int i = 0; i < palavra.length(); i++) {
			if (Character.isLetter(palavra.charAt(i)))
				letras++;
	    }
		return letras;
	}
	
	// M�todo que recebe o meu nome completo e exibe somente as 4 primeiras letras do nome
	public String abreviaNome(String nome) {
		String nomeAbreviado = nome.substring(0, 4);
		return nomeAbreviado;
	}
	
	// M�todo que recebe o meu nome completo e exibe a partir da terceira letra do nome
	public String nomeSemInicio(String nome) {
		String nomeStrip = nome.substring(2);
		return nomeStrip;
	}
	
	// M�todo que recebe o meu nome completo e exibe somente as 4 ultimas letras
	public String quatroUltimasLetras(String nome) {
		String finalNome = nome.substring(nome.length() - 4);
		return finalNome;
	}
	
	// M�todo que recebe o meu nome completo e substitui o primeiro nome por ALUNO
	public String substituiPrimeiroNome(String nome) {
		String[] nomeCompleto = nome.split("\\s");	// divide a string onde tem espa�os
		String aluno = "ALUNO ";
		String alunoNome = aluno.concat(nomeCompleto[1]);
		return alunoNome;
	}
	
	
}
