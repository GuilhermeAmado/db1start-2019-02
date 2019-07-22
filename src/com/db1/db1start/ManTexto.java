package com.db1.db1start;

public class ManTexto {
	
	// Método que recebe um texto e devolve ele em LETRAS MAIUSCULAS  
	public String upper(String texto) {
		if (texto != null && !texto.isBlank()) {
			String upper = texto.toUpperCase();
			return upper;
		}
		String erro = "Texto inválido";
		return erro;
	}
	
	// Método que recebe um texto e devolve ele em LETRAS MINUSCULAS
	public String lower(String texto) {
		if (texto != null && !texto.isBlank()) {
			String lower = texto.toLowerCase();
			return lower;
		}
		String erro = "Texto inválido";
		return erro;
	}
	
	// Método que recebe "DB1START" e retorna a quantidade de letras que existe nesta palavra  
	public Integer contaLetras(String palavra) {
		int letras = 0;
		for (int i = 0; i < palavra.length(); i++) {
			if (Character.isLetter(palavra.charAt(i)))
				letras++;
	    }
		return letras;
	}
	
	// Método que recebe " DB1START " (tendo um espaço no inicio e no fim da palavra) e retorna a quantidade de letras que existe
	// Método que retorna o item 4 com a mesma quantidade de letras do item 3
	public Integer removeEspacoContaLetras(String palavra) {
		int letras = 0;
		palavra = palavra.replaceAll("\\s", "");	// remove espaços em branco - poderia se usar o método strip também
		for (int i = 0; i < palavra.length(); i++) {
			if (Character.isLetter(palavra.charAt(i)))
				letras++;
	    }
		return letras;
	}
	
	// Método que recebe o meu nome completo e exibe somente as 4 primeiras letras do nome
	public String abreviaNome(String nome) {
		String nomeAbreviado = nome.substring(0, 4);
		return nomeAbreviado;
	}
	
	// Método que recebe o meu nome completo e exibe a partir da terceira letra do nome
	public String nomeSemInicio(String nome) {
		String nomeStrip = nome.substring(2);
		return nomeStrip;
	}
	
	// Método que recebe o meu nome completo e exibe somente as 4 ultimas letras
	public String quatroUltimasLetras(String nome) {
		String finalNome = nome.substring(nome.length() - 4);
		return finalNome;
	}
	
	// Método que recebe o meu nome completo e substitui o primeiro nome por ALUNO
	public String substituiPrimeiroNome(String nome) {
		String[] nomeCompleto = nome.split("\\s");	// divide a string onde tem espaços
		String aluno = "ALUNO ";
		String alunoNome = aluno.concat(nomeCompleto[1]);
		return alunoNome;
	}
	
	
}
