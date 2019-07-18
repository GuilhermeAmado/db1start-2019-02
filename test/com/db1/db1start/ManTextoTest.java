package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class ManTextoTest {
	
	@Test
	public void deveRetornarUpper() {
		ManTexto manTexto = new ManTexto();
		String upper = manTexto.upper("teste");
		Assert.assertEquals("TESTE", upper);
	}
	
	@Test
	public void deveRetornarLower() {
		ManTexto manTexto = new ManTexto();
		String lower = manTexto.lower("TESTE");
		Assert.assertEquals("teste", lower);
	}
	
	@Test
	public void deveContarLetras() {
		ManTexto manTexto = new ManTexto();
		int letras = manTexto.contaLetras("DB1START");
		Assert.assertEquals(7, letras);
	}

}
