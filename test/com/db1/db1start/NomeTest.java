package com.db1.db1start;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class NomeTest {
	
	@Test
	public void deveRetornarMeuNome() {
		Nome nome = new Nome();
		
		List<String> meuNome = nome.meuNome();
		
		Assert.assertEquals(2, meuNome.size());
		Assert.assertEquals("Maiko", meuNome.get(0));
		Assert.assertEquals("Cunha", meuNome.get(1));
		
		Assert.assertTrue(meuNome.contains("Maiko"));
		Assert.assertTrue(meuNome.contains("Cunha"));
	}

}