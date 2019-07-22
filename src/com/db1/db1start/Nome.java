package com.db1.db1start;

import java.util.ArrayList;
import java.util.List;

public class Nome {
	
	static int quantidadeDeCaractes(String nome) {
		if (nome != null) {
			return nome.length();
		}
		return 0;
	}
	
	public List<String> meuNome() {
		List<String> meuNome = new ArrayList<String>();
		meuNome.add("Maiko");
		meuNome.add("Cunha");
		return meuNome;
	}

}