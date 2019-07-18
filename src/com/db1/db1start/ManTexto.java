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

}
