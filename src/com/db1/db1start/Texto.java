package com.db1.db1start;

public class Texto {
	public static String upper(String texto) {
		if (texto != null && !texto.isBlank()) {
			String upper = texto.toUpperCase();
			return upper;
		}
		String erro = "Texto inválido";
		return erro;
	}
	
	public static String lower(String texto) {
		if (texto != null && !texto.isBlank()) {
			String lower = texto.toLowerCase();
			return lower;
		}
		String erro = "Texto inválido";
		return erro;
	}

}
