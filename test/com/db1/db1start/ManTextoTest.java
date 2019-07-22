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
	
	@Test
	public void deveRemoverEspacosEContarLetras() {
		ManTexto manTexto = new ManTexto();
		int letras = manTexto.contaLetras(" DB1START ");
		Assert.assertEquals(7, letras);
	}
	
	@Test
	public void deveAbreviarNome4Letras() {
		ManTexto manTexto = new ManTexto();
		String nome = manTexto.abreviaNome("Guilherme Amado");
		Assert.assertEquals("Guil", nome);
	}
	
	@Test
	public void deveCortarDuasPrimeirasLetras() {
		ManTexto manTexto = new ManTexto();
		String nome = manTexto.nomeSemInicio("Guilherme Amado");
		Assert.assertEquals("ilherme Amado", nome);
	}
	
	@Test
	public void deveMostrar4UltimasLetras() {
		ManTexto manTexto = new ManTexto();
		String nome = manTexto.quatroUltimasLetras("Guilherme Amado");
		Assert.assertEquals("mado", nome);
	}
	
	@Test
	public void deveSubstituirPrimeiroNome() {
		ManTexto manTexto = new ManTexto();
		String nome = manTexto.substituiPrimeiroNome("Guilherme Amado");
		Assert.assertEquals("ALUNO Amado", nome);
	}
		
}
